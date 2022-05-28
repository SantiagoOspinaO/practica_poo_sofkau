package com.sofka.practica;

import com.sofka.practica.domain.Cat;
import com.sofka.practica.domain.Dog;

import java.util.logging.Logger;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("logger");

        Dog dog = new Dog("Pastor Belga", "Negro");
        String dogData = dog.toString();
        logger.info(()-> "Dog: " + dogData);

        Cat cat = new Cat("Persa", "Gris");
        String catData = cat.toString();
        logger.info(()-> "Cat: " + catData);
    }
}
