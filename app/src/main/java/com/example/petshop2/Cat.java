package com.example.petshop2;

import java.util.Date;

public class Cat extends Pet implements Pettable{

    public Cat(String name){
        super(name);
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public voic Pet() {
        return null;
    }
}
