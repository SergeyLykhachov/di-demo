package com.slykhachov.didemo;

import com.slykhachov.didemo.controllers.ConstructorInjectedController;
import com.slykhachov.didemo.controllers.GetterInjectedController;
import com.slykhachov.didemo.controllers.MyController;
import com.slykhachov.didemo.controllers.PropertyInjectedController;
import com.slykhachov.didemo.examplebeans.FakeDataSource;
import com.slykhachov.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = context.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUser());
    }

}
