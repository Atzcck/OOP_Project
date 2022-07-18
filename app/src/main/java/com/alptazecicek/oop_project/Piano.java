package com.alptazecicek.oop_project;

public class Piano implements Insturment,HouseDecor{

    String brand;
    boolean digital;

    @Override
    public void info() {
        System.out.println("override method");
    }
}
