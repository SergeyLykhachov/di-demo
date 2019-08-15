package com.slykhachov.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected via getter";
    }
}
