package com.codedifferently.circus;

import com.codedifferently.circus.animals.AbstractAnimal;
import com.codedifferently.circus.animals.Bear;
import com.codedifferently.circus.animals.Turtle;
import com.codedifferently.circus.animals.Zebra;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class);

    private ArrayList<Bear> animals;

    public MainCircus(){
        this.animals = new ArrayList<>();
    }

    public void startTheShow(){
        logger.info("You need to program the show");
        Bear bearReference = new Bear("Smokey Da Bear");
        bearReference.doTrick();

        Turtle bowser = new Turtle("bowser");
        bowser.doTrick();

        Zebra zebra = new Zebra("Peter", 400);
        zebra.doTrick();
    }

    public static void main(String[] args) {
        MainCircus mainCircus = new MainCircus();
        mainCircus.startTheShow();
    }
}
