package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Service {

    @Autowired
    private Repo repo;

    public void testing1() {

    Student student = new Student("sdf", "yjkhj", "hfgh");
    repo.save(student);
}

    public List<Student> showAll() {
        List<Student> all = new ArrayList<>();
        repo.findAll().iterator().forEachRemaining(all::add);

        return all;
    }
}
