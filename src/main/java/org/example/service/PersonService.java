package org.example.service;

import org.example.dto.PersonDto;
import org.example.entity.Person;
import org.example.mapper.PersonMapper;
import org.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonMapper personMapper;

    public List<PersonDto> getAllPersons() {
        return personRepository.findAll().stream()
            .map(personMapper::toPersonDto)
            .toList();
    }

    public PersonDto savePerson(PersonDto personDto) {
        Person person = personMapper.toPerson(personDto);
        return personMapper.toPersonDto(personRepository.save(person));
    }

}
