/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Clinica {

    private String nombre;
    private ArrayList<Vacuna> listaVacunas;
    private ArrayList<Perro> listaPerros;

    Clinica() {
    }

    public Clinica(String nombre) {
        this.nombre = nombre;
        listaVacunas = new ArrayList<Vacuna>();
        listaPerros = new ArrayList<Perro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void obtenerVacuna() {
        for (int i = 0; i < this.listaVacunas.size(); i++) {
            System.out.println("ID" + "\t" + "recuerdo" + "\t" + "nombre" + "\t" + "Precio");
            System.out.println(this.listaVacunas.get(i).getId() + "\t" + this.listaVacunas.get(i).getRecuerdo() + "\t" + "\t " + this.listaVacunas.get(i).getNombre() + "\t" + this.listaVacunas.get(i).getPrecio());
            System.out.println("*********************************************************************");
        }
    }

    public ArrayList<Vacuna> getListaVacunas() {
        return listaVacunas;
    }

    public void setListaVacunas(ArrayList<Vacuna> listaVacunas) {
        this.listaVacunas = listaVacunas;
    }

    public ArrayList<Perro> getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(ArrayList<Perro> listaPerros) {
        this.listaPerros = listaPerros;
    }

    public void añadirVacuna(Vacuna v) {
        this.listaVacunas.add(v);
    }

    public void añadirPerro(Perro p) {
        this.listaPerros.add(p);
    }

    public Perro buscarPerro(String nombre) {
        for (int i = 0; i < this.listaPerros.size(); i++) {
            if (listaPerros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return listaPerros.get(i);
            }
        }
        return null;
    }

    public Vacuna buscarVacuna(String nombre) {
        for (int i = 0; i < this.listaVacunas.size(); i++) {
            if (listaVacunas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return listaVacunas.get(i);
            }
        }
        return null;
    }

}
