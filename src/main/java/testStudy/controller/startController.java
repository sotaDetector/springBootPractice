package testStudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class startController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

}
