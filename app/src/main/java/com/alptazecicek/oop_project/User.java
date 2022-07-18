package com.alptazecicek.oop_project;

public class User extends People{
    //property

    String name;
    String job;

    //Constructor


    public User(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;
        System.out.println("UserCreated");
    }
}
