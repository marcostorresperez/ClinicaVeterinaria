/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.Calendar;

/**
 *
 * @author mati
 */
public class VacunaPerro {

    private Calendar fecha;
    Vacuna vacunaPerro = new Vacuna();

    public VacunaPerro(Calendar fecha, Vacuna v) {
        this.fecha = fecha;
        vacunaPerro = v;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

}
