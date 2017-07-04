package com.example.fj.databindingdemo.bean;

/**
 * Created by 860617010 on 2017/7/4.
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
