package io.anymobi.springbootwebstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebStarterApplication {

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(SpringBootWebStarterApplication.class);
        application.addListeners(new EventLifeCycleListener());
        application.run(args);
    }
}
