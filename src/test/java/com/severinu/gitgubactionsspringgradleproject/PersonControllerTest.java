package com.severinu.gitgubactionsspringgradleproject;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class PersonControllerTest {

    PersonController personController = new PersonController();

    @Test
    void testGetPerson() {
        ResponseEntity<Person> personEntity = personController.getPerson();
        Person person = personEntity.getBody();
        assertEquals("Adam Smith", person.getName());
    }

}