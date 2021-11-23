package ru.otus.spring.dao;

import ru.otus.spring.domain.Person;

import java.util.Optional;

public interface PersonDao {

    Optional<Person> findByName(String name);
}
