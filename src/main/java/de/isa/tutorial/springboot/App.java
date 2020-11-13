package de.isa.tutorial.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 */
//@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class App {
  private static final Logger logger = LoggerFactory.getLogger(App.class);

  // Tutorial: Beans and Injection
  @Autowired RestTemplate restTemplate;

  @Value("${my.very.own.property}")
  private String myProp;

  public static void main(String[] args) {
    System.out.println("Testing spring boot app");
    SpringApplication.run(App.class, args);
  }

  @RequestMapping("/test0")
  public String index0() {
    logger.info("path / called (info)");
    logger.debug("path / called (debug)");
    return "Greetings from Spring Boot!\n" + myProp;
  }

  @RequestMapping("/test1")
  public String index1() {
    logger.info("path /test called (info)");
    logger.debug("path /test called (debug)");
    return "Greetings from  the Test Spring Boot Application!\n" + myProp;
  }

  // Tutorial: Beans and Injection
  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
