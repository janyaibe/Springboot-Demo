package com.DemoApp.DemoAPP;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String greet () {
        return "Hello World, Welcome to John's Demo App!";
    }

}
