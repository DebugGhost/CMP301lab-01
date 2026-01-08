package com.example.myapplication;

import java.util.Date;

public class Sad extends Mood{
    public Sad() {
        super();
    }
    public Sad(Date date) {
        super(date);
    }
    @Override
    public String getMoodString() {
        return "Happy";
    }
}
