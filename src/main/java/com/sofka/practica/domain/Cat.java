package com.sofka.practica.domain;

import com.sofka.practica.abstracts.Animal;
import com.sofka.practica.interfaces.ICat;

/**
 * Se crea la clase Cat que extiende de Animal e implementa la interfaz ICat con el objetivo de definir
 * el modelo de un gato e implementar el maullido.
 *
 * @version 1.00.000 27/05/2022
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 27/05/2022
 */
public class Cat extends Animal implements ICat {

    /**
     * Se crea la instancia de un gato.
     *
     * @param raza  the raza
     * @param color the color
     */
    public Cat(String raza, String color) {
        super(raza, color);
    }

    /**
     * Se sobre escribe el metodo maullar de la interfaz, para darle cuerpo.
     */
    @Override
    public void maullar() {
        logger.info("El cato esta maullando");
    }

    /**
     * Se sobre escribe el metodo toString con el objetivo de mostrar los datos del Cat
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
