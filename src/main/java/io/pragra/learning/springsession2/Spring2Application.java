package io.pragra.learning.springsession2;

import io.pragra.learning.springsession2.domain.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

public class Spring2Application {

    public static void main(String... args) {
        ///SpringApplication.run(Spring2Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.springsession2.conf", "io.pragra.learning.springsession2.domain");

        Game game = context.getBean(Game.class);
        System.out.println(game.startGame());
    }

}
