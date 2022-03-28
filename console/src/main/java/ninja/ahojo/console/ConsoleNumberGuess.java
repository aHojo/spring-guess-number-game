package ninja.ahojo.console;

import java.sql.SQLOutput;
import java.util.Scanner;
import ninja.ahojo.Game;
import ninja.ahojo.MessageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//@Component
//public class ConsoleNumberGuess implements ApplicationListener<ContextRefreshedEvent> {
//  private static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);
//
//
//  @Override
//  public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//    log.info("Container ready for use");
//  }
//}
@Component
public class ConsoleNumberGuess {
  private static final Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

  // Feilds
  @Autowired
  private Game game;

  @Autowired
  private MessageGenerator messageGenerator;


//  @EventListener
//  public void start(ContextRefreshedEvent contextRefreshedEvent) {
//    log.info("Start() -- Container ready for use");
//  }
@EventListener(ContextRefreshedEvent.class)
public void start() {
  log.info("Start() -- Container ready for use");

  Scanner scanner = new Scanner(System.in);

  while (true) {
    System.out.println(messageGenerator.getMainMessage());
    System.out.println(messageGenerator.getResultMessage());

    int guess = scanner.nextInt();
    game.setGuess(guess);
    game.check();

    if (game.isGameWon() || game.isGameLost()) {
      System.out.println(messageGenerator.getResultMessage());
      System.out.println("Play gain? y/n");
      String playAgainString = scanner.nextLine().trim();

      if (!playAgainString.equalsIgnoreCase("y")) {
        break;
      }
      game.reset();
    }


  }
}
}
