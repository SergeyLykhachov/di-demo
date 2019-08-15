package com.slykhachov.didemo;

import com.slykhachov.didemo.controllers.ConstructorInjectedController;
import com.slykhachov.didemo.controllers.GetterInjectedController;
import com.slykhachov.didemo.controllers.MyController;
import com.slykhachov.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
        System.out.println(context.getBean(MyController.class).hello());
        System.out.println(context.getBean(ConstructorInjectedController.class).seyHello());
        System.out.println(context.getBean(GetterInjectedController.class).seyHello());
        System.out.println(context.getBean(PropertyInjectedController.class).seyHello());
    }

}
