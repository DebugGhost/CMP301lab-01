package com.example.myapplication;

import java.util.Date;

public class Dog extends Pet implements Pettable{
    public Dog(String Name) {
        super(Name);
    }

    public Dog(String Name, Date birthDate) {
        super(Name, birthDate);
    }

    @Override
    public String speak() {
        return "bark";
    }


    @Override
    public void pet() {

    }
}
