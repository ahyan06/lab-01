package com.example.petshop2;

import java.util.Date;

public class SadMood extends Mood {

    public SadMood() {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String getMoodString() {
        return "sad";
    }
}
