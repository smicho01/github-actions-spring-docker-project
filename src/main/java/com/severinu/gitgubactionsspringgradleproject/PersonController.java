package com.severinu.gitgubactionsspringgradleproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping()
    public ResponseEntity<Person> getPerson () {
        Person person = new Person("Adam Smith", 44);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

}
