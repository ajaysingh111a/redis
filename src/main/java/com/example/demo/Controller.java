package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public void create(){
        service.testing1();
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<Student> show(){

        return service.showAll();
    }
}
