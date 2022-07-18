package com.alptazecicek.oop_project;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser = new User();       //singeltan sınıfı??
        myUser.name = "Alp";
        myUser.name = "Devops";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musitian";
        */

        User myUser = new User("Alp", "Automation Engineer");
        System.out.println(myUser.information());


        System.out.println(myUser.name);


        //Encapsulation

        Musician James = new Musician("James", "Guitar", 50);
        System.out.println(James.getAge());

        //Inheritance
        SuperMusician lars = new SuperMusician("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //POLYMORPHISM
        //Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(3,4));
        System.out.println(mathematics.sum(6,2,1));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();
        Dog barley = new Dog();
        barley.test();
        barley.sing();

        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();





    }
}