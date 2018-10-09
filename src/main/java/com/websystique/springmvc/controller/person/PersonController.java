package com.websystique.springmvc.controller.person;

import com.websystique.springmvc.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rith on 10/9/2018.
 */
@Controller
@RequestMapping(value = "/item")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value="/person_list")
    public ResponseEntity<Object> findPersonHome() {
        System.out.println("findPersonHomelist");
        Object item = 	personService.getPerson();
        if(item == null){
            return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Object>(item, HttpStatus.OK);
    }
    @RequestMapping(value="/home2")
    public ResponseEntity<Object> findPersonHome2() {
        System.out.println("findPersonHome2");
        Object item = 	personService.getPerson();
        if(item == null){
            return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Object>(item, HttpStatus.OK);
    }
}
