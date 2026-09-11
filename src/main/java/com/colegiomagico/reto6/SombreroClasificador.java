package com.colegiomagico.reto6;

/**
 * Usa Switch. Gryffindor -> Valentia, Ravenclaw -> Inteligencia, otro -> Desconocido.
 */
public class SombreroClasificador {

    public static String clasificar(string casa) {
        switch (casa) {
            case ("Gryffindor"):
                return ("Valentia");
            case ("Ravenclaw"):
                return ("Inteligencia");
            case ("otro"):
                return ("Desconocido");
        }
    }

    public static void main(String[] args) {
        System.out.println("Gryffindor: " + clasificar("Gryffindor"));
    }
}
