package spring.test.mistake.delete;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tolkv
 * @version 28/03/2017
 */
@Configuration
public class Config3 {
  @Bean
  public String confignumber3() {
    System.out.println("confignumber3 = |");
    return "confignumber2bean";
  }
}
