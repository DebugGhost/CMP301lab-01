package com.example.myapplication;

import java.util.Date;

public abstract class Pet {
    private String Name;
    private Date birthDate;

    public Pet(String Name) {
        this.Name = Name;
    }
    public Pet(String Name, Date birthDate){
        this.Name = Name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String speak();

}
