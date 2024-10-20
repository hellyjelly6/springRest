package org.example.mapper;

import org.example.dto.PersonDto;
import org.example.entity.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonDto toPersonDto(Person actor);
    Person toPerson(PersonDto actorDTO);
}