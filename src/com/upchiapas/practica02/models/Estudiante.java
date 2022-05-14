package com.upchiapas.practica02.models;

import java.time.LocalDate;

public class Estudiante {
    private int matricula;
    private String nombre;
    private char sexo;
    private String lugarOrigen;
    private LocalDate fechaNacimiento;

    public Estudiante(int matricula,
                      String nombre,
                      char sexo,
                      String lugarOrigen,
                      LocalDate fechaNacimiento){
        this.matricula = matricula;
        this.nombre =  nombre;
        this.sexo = sexo;
        this.lugarOrigen = lugarOrigen;
        this.fechaNacimiento = fechaNacimiento;
    }

    public byte getEdad(){
        int edad;

        edad = LocalDate.now().getYear() - fechaNacimiento.getYear();
        return (byte)edad;
    }

    public int getMatricula() {
        return matricula;
    }

    public char getSexo() {
        return sexo;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", lugarOrigen='" + lugarOrigen + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public String getNombre(){
        return nombre;
    }
}
