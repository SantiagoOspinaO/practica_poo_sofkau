package com.sofka.practica.abstracts;

import java.util.logging.Logger;

/**
 * Se crea la clase Animal abstract con la intención de heredar de ella direfentes tipos de animales con los
 * mismos atributos.
 *
 * @version 1.00.000 27/05/2022
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 27/05/2022
 */
public abstract class Animal {
    /**
     * The Logger.
     */
    protected Logger logger = Logger.getLogger("logger");

    private String raza;
    private String color;

    /**
     * Se crea la instancia de un animal
     *
     * @param raza  the raza
     * @param color the color
     */
    protected Animal(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }

    /**
     * Se crea el metodo Get del atributo raza.
     *
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Se crea el metodo Set del atributo raza.
     *
     * @param raza the raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Se crea el metodo Get del atributo color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Se crea el metodo Set del atributo color.
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Se sobre escribe el metodo toString con el objetivo de mostrar los datos del animal
     */
    @Override
    public String toString() {
        return "Animal{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
