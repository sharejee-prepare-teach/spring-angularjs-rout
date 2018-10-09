package com.websystique.springmvc.controller.person;

import com.websystique.springmvc.model.Person;
import com.websystique.springmvc.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Rith on 10/9/2018.
 */
@RestController
@RequestMapping(value = "/api/person_list")
public class APIPersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    private List<Person> getPersonList(){
        return personService.getPerson();
    }

}
