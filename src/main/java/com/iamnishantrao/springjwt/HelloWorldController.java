package com.iamnishantrao.springjwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "<h1>hello world from iamnishantrao!</h1>";
    }
}
