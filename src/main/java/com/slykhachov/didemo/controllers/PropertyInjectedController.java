package com.slykhachov.didemo.controllers;

import com.slykhachov.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    private GreetingService greetingService;

    public String seyHello() {
        return greetingService.sayGreeting();
    }
}
