package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Zebra extends AbstractAnimal {
    private int speed;

    public Zebra(String name, int speed) {
        super(name);
        this.speed = speed;
    }


    @Override
    public void doTrick() {
        AnimalTricks trick = AnimalTricks.SWIM;
        String message = String.format("Hi, my name is %s the zebra, and I like to %s", name, trick.toString());
        message += " at " + speed + "MPH!";
        logger.info(message);
    }

}
