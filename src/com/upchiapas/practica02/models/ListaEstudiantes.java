package com.upchiapas.practica02.models;

public class ListaEstudiantes {
    private Estudiante[] listaEstudiante;
    private byte numeroEstudiantes;

    public ListaEstudiantes(byte numeroEstudiantes){
        listaEstudiante = new Estudiante[numeroEstudiantes];
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public boolean addEstudiante(Estudiante estudiante) {
        byte indice = 0;
        boolean estado;
        while (indice < numeroEstudiantes &&
                listaEstudiante[indice] != null)
            indice++;

        if (indice < numeroEstudiantes) {
            listaEstudiante[indice] = estudiante;
            estado = true;
        } else
            estado = false;

        return estado;
    }

    public byte getPromedioEdad(){
        int indice=0;
        int sumaEdades = 0;

        while ( indice<numeroEstudiantes &&
                listaEstudiante[indice] != null) {
            sumaEdades = sumaEdades + listaEstudiante[indice].getEdad();
            indice++;
        }
        return (byte)(sumaEdades / indice);
    }
}
