package com.oop.basic;

public class Animal {
    private final String name;
    private String colour;
    private String sound;

    public Animal(String name){
        this.name = name;
    }

//    public void setName(String name){
//        this.name = name;
//    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public String getName(){return name;};

    public String getColour(){return colour;};

    public String getSound(){return sound;};

}
