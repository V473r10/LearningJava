package com.v473r10.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Messages")
public class HelloWorldController {
    @GetMapping("/LearningJava")
    public String getMessage() {
        return "I'm learning Java this 2023!";
    }
}
