package org.example.controller;

import org.example.dto.PersonDto;
import org.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<PersonDto> getAll() {
        return personService.getAllPersons();
    }

    @PostMapping
    public PersonDto save(@RequestBody PersonDto personDto) {
        return personService.savePerson(personDto);
    }
}
