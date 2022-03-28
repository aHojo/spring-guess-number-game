package ninja.ahojo;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageGeneratorImpl implements MessageGenerator{



  private final static Logger log =  LoggerFactory.getLogger(MessageGeneratorImpl.class);

//  @Autowired private Game game;
    private Game game;

    @Autowired
    public MessageGeneratorImpl(Game game) {
      this.game = game;
    }
  // init methods
  @PostConstruct
  public void init() {
    log.info("Game info = {}",  game);
  }

  @Override
  public String getMainMessage() {
    return "Number is between " + game.getSmallest() +
        " and " + game.getBiggest() +
        " can you guess it?";
  }

  @Override
  public String getResultMessage() {
    if (game.isGameWon()) {
      return "You guessed it! The number was " + game.getNumber();
    } else if (game.isGameLost()) {
      return "You lost. the number wsa " + game.getNumber();
    } else if (!game.isValidNumberRange()) {
      return "Invalid number range";
    } else if (game.getRemainingGuesses() == game.getGuessCount()) {
      return "What is your first guess? ";
    } else {
      String direction = "Lower";

      if (game.getGuess() < game.getNumber()) {
        direction = "Higher";
      }
      return direction + "! You have " + game.getRemainingGuesses() + " guesses left";
    }
  }
}
