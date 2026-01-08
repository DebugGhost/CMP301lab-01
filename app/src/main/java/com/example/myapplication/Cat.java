package com.example.myapplication;

import java.util.Date;

public class Cat extends Pet implements Pettable{
    public Cat(String Name) {
        super(Name);
    }

    public Cat(String Name, Date birthDate) {
        super(Name, birthDate);
    }

    @Override
    public String speak() {
        return "meow"; // Cats meow
    }

    @Override
    public void pet() {

    }
}
