package com.example.demo;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;


@RedisHash("Student")
public class Student implements Serializable {

    private String id;
    private String name;
    private String lname;

    public Student(String id, String name, String lname) {
        this.id = id;
        this.name = name;
        this.lname = lname;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
