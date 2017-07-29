package net.esilva.helloboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootController {

    @RequestMapping("/hello")
    public String helloBoot(){
        return "Hello, I am Boot, Spring Boot!";
    }
}
