package com.oop.inheritance;

import com.oop.basic.Animal;
import com.oop.interfacing.Ianimal;

public class Pig extends Animal implements Ianimal {
    public Pig(String name) {
        super(name);
        super.setSound("oink-oink");
    }

    public String getSound(){
        return getName() + " is " + super.getSound();
    }

    @Override
    public void move() {
        System.out.println(getName() + " jumping on puddle");
    }
}
