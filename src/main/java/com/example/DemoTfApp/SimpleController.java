package com.example.DemoTfApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    // A basic GET endpoint
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

}
