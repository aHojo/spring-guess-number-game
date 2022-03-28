package ninja.ahojo.config;

import ninja.ahojo.GuessCount;
import ninja.ahojo.MaxNumber;
import ninja.ahojo.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "ninja.ahojo")
@PropertySource("classpath:config/game.properties")
public class GameConfig {
// == fields ==
  // @Value gets the value from the properties file.
  // :20 is the default value.
  @Value("${game.maxNumber:20}")
  private int maxNumber;
  @Value("${game.guessCount:50}")
  private int guessCount;

  @Value("${game.minNumber:0}")
  private int minNumber;

  // == bean methods ==
  @Bean
  @MaxNumber
  public int maxNumber() {
    return maxNumber;
  }

  @Bean
  @GuessCount
  public int guessCount() {
    return guessCount;
  }

  @Bean
  @MinNumber
  public int getMinNumber() {
    return minNumber;
  }
}
