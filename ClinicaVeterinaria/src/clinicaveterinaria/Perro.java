/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author mati
 */
public class Perro {
    private String nombre;
    private String raza;
    private Calendar fecha;
    ArrayList<VacunaPerro> listaVacunas= new ArrayList<VacunaPerro>();
    
    public Perro(String nombre, String raza, Calendar fecha) {
        this.nombre = nombre;
        this.raza = raza;
        this.fecha = fecha;
    }
    
    public void vacunar(VacunaPerro vp){
        this.listaVacunas.add(vp);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public ArrayList<VacunaPerro> getListaVacunas() {
        return listaVacunas;
    }

    public void setListaVacunas(ArrayList<VacunaPerro> listaVacunas) {
        this.listaVacunas = listaVacunas;
    }

    
   
}
