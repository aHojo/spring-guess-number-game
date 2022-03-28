package ninja.ahojo.config;

import ninja.ahojo.Game;
import ninja.ahojo.GameImpl;
import ninja.ahojo.MessageGenerator;
import ninja.ahojo.MessageGeneratorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// No longer used, we only used this for the beans and an example.
@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "ninja.ahojo")
public class AppConfig {

  // We need these if we don't use the @Component on our classes.
//  2022-03-28 10:57:31,537 [main] [DEBUG] o.s.c.a.ConfigurationClassBeanDefinitionReader - Registering bean definition for @Bean method learnprogramming.AppConfig.numberGenerator()
//  2022-03-28 10:57:31,538 [main] [DEBUG] o.s.c.a.ConfigurationClassBeanDefinitionReader - Registering bean definition for @Bean method learnprogramming.AppConfig.game()
  // == bean methods
//  @Bean
//  public NumberGenerator numberGenerator() {
//    return new NumberGeneratorImpl();
//  }

//  @Bean
//  public Game game() {
//    return new GameImpl();
//  }

//  @Bean
//  public MessageGenerator messageGenerator() {
//    return new MessageGeneratorImpl();
//  }
}
