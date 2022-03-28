package ninja.ahojo.console;

import ninja.ahojo.config.AppConfig;
import ninja.ahojo.MessageGenerator;
import ninja.ahojo.NumberGenerator;
import ninja.ahojo.config.GameConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  private static Logger log = LoggerFactory.getLogger(Main.class);
//  private static final String CONFIG_LOCATION = "beans.xml";
  public static void main(String[] args) {
    log.info("Guess the number game");

    // create context (container)
//    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext((CONFIG_LOCATION));
//    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);


//    // get numbergenerator bean from context (container)
////    NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);
//    NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
//
//    // call method netc() to get a random number
//    int number = numberGenerator.next();
//
//    // log the generated number
//    log.info("number = {}", number);
//
////    // get game bean from context (container)
////    Game game = context.getBean(Game.class);
//    // get game bean from context (container)
//    MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
//    log.info("getMainMessage = {}", messageGenerator.getMainMessage());
//    log.info("getRsultMessage = {}", messageGenerator.getResultMessage());

    // call the reset method
//    game.reset();
    // close the context
    context.close();

  }

}
