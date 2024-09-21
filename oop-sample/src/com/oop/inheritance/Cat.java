package com.oop.inheritance;

import com.oop.basic.Animal;
import com.oop.interfacing.Ianimal;

public class Cat extends Animal implements Ianimal {
    public Cat(String name) {
        super(name);
        super.setSound("meowing");
    }

    public String getSound(){
        return getName() + " is " + super.getSound();
    }

    @Override
    public void move() {
        System.out.println(getName() + " cacthing a bird");
    }
}
