package spring.test.mistake.delete;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author tolkv
 * @version 28/03/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextHierarchy({
    @ContextConfiguration(classes = {Config1.class}),
    @ContextConfiguration(classes = {Config2.class}),
})
public class ConfigTest1 {
  @Test
  public void firsttest() throws Exception {
    System.out.println("firsttest");
    assertThat(true, equalTo(true));
  }
}
