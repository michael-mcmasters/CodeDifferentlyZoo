package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Turtle extends AbstractAnimal {

    public Turtle(String name) {
        super(name);
    }

    @Override
    public void doTrick() {
        AnimalTricks trick = AnimalTricks.BREATHEFIRE;
        String msg = String.format("Hey Mario. It's me, %s... %s", name, trick.toString());
        logger.info(msg);
    }
}
