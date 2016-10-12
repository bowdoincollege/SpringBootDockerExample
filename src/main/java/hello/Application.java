/**
 * @author bbisesti
 * @description This file is used for the Spring Boot Docker Application
 */
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

    /**
     * @function This function returns a string for the home directory case
     * @author bbisesti
     * @return String
     */
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World!";
    }

    /**
     * @author bbisesti
     * @function This function is called to begin the program
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}