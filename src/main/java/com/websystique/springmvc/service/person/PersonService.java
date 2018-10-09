package com.websystique.springmvc.service.person;

import com.websystique.springmvc.model.Person;

import java.util.List;

/**
 * Created by Rith on 10/9/2018.
 */
public interface PersonService {
    Person findById(Long id);

    List<Person> getPerson();
}
