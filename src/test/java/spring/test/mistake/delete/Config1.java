package spring.test.mistake.delete;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tolkv
 * @version 28/03/2017
 */
@Configuration
public class Config1 {
  @Bean
  public String confignumber1(){
    System.out.println("confignumber1 = |");
    return "confignumber1bean";
  }
}
