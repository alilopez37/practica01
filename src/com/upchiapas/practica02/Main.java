package com.upchiapas.practica02;

import com.upchiapas.practica02.models.Estudiante;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Estudiante veronica = new Estudiante(221224,
                "Verónica",
                'M',
                "Tuxtla Gutiérrez",
                LocalDate.of(2003,12,4));

        byte edad;
        edad = veronica.getEdad();
        System.out.println(veronica.getNombre() +" tiene "+ veronica.getEdad()+ " años");

        System.out.println(veronica);
    }
}
