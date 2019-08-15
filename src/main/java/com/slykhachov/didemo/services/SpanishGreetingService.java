package com.slykhachov.didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("es")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Servico de Saludo Primario";
    }
}
