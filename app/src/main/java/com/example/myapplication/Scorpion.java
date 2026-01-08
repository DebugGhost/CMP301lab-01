package com.example.myapplication;


import java.util.Date;

public class Scorpion extends Pet{
    public Scorpion(String Name) {
        super(Name);
    }

    public Scorpion(String Name, Date birthDate) {
        super(Name, birthDate);
    }

    @Override
    public String speak() {
        return "hiss";
    }

}
