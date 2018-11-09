package com.hao.ApplicationBoot;
/**
* @author Griezmann
* @date 2018年10月10日 
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages={"com.tianliangedu"})
public class ApplicationBootControler {
   public static void main(String[] args) {
      SpringApplication.run(ApplicationBootControler.class, args);
   }
}
