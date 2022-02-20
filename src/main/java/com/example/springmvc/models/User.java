package com.example.springmvc.models;

import java.util.Date;

public class User {

    private String name,gender;
    private int age;
    private Date dob;

    public User() {

    }

    public User(String name, String gender, int age, Date dob) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
