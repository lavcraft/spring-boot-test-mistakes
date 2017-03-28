package spring.test.mistake.delete;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tolkv
 * @version 28/03/2017
 */
@Configuration
public class Config2 {
  @Bean
  public String confignumber2() {
    System.out.println("confignumber2 = |");
    return "confignumber2bean";
  }
}
