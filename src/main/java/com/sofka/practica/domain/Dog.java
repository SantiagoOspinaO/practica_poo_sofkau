package com.sofka.practica.domain;

import com.sofka.practica.abstracts.Animal;
import com.sofka.practica.interfaces.IDog;

/**
 * Se crea la clase Dog que extiende de Animal e implementa la interfaz IDog con el objetivo de definir
 * el modelo de un perro e implementar el ladrido.
 *
 * @version 1.00.000 27/05/2022
 *
 * @author Santiago Ospina Osorio - santiago.m200@outlook.es
 *
 * @since 27/05/2022
 */
public class Dog extends Animal implements IDog {

    /**
     * Se crea la instancia de un perro.
     *
     * @param raza  the raza
     * @param color the color
     */
    public Dog(String raza, String color) {
        super(raza, color);
    }

    /**
     * Se sobre escribe el metodo ladrar de la interfaz, para darle cuerpo.
     */
    @Override
    public void ladrar() {
        logger.info("El perro esta ladrando");
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
