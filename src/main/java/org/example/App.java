package org.example;

import org.example.config.SpringConfig;
import org.example.dto.PersonDto;
import org.example.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService personService = context.getBean(PersonService.class);
    }
}
