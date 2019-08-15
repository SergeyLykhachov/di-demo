package com.slykhachov.didemo.controllers;

import com.slykhachov.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        return this.greetingService.sayGreeting();
    }
}
