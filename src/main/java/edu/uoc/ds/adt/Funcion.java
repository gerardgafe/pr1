package edu.uoc.ds.adt;

public class Funcion {

    public Character calcularFuncion(int x) {
        // Calcular x mod 4
        int mod = x % 4;
        // Devolver (x mod 4)^2 como Character
        return Character.valueOf((char) ((mod * mod) + '0'));
    }

}
