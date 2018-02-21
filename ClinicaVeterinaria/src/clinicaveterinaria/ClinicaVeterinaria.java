/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author mati
 */
public class ClinicaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar fecha = null;
        String nombre = null;
        int id;
        double precio;
        int recuerdo;
        String raza;
        int opcion;
        
        Clinica clinica1 = null;
        Vacuna vacuna1 = null;
        Perro perro1 = null;
        VacunaPerro vacunaPerro1 = null;
        
        Perro perroActivo;
        Vacuna vacunaActiva;
        

        do {
            mostrarMenu();
            System.out.println("introduce opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce nombre de la clinica");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    clinica1 = new Clinica(nombre);
                    break;
                case 2:
                    System.out.println("Introduce id de la vacuna");
                    id = teclado.nextInt();
                    System.out.println("Introduce recuerdo");
                    recuerdo = teclado.nextInt();
                    System.out.println("Introduce nombre");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.println("Introduce precio");
                    precio = teclado.nextDouble();
                    vacuna1 = new Vacuna(id, recuerdo, nombre, precio);
                    clinica1.añadirVacuna(vacuna1);
                    break;
                case 3:
                    System.out.println("Introduce un nombre NUEVO");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.println("Introduce raza de perro");
                    raza = teclado.nextLine();
                    perro1 = new Perro(nombre, raza, null);
                    clinica1.añadirPerro(perro1);
                    break;
                case 4:
                    System.out.println("Introduce el nombre del perro");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    perroActivo = clinica1.buscarPerro(nombre);
                    if (perroActivo != null) {
                        //listado de vacunas
                        clinica1.obtenerVacuna();
                        System.out.println("Indica la vacuna a administrar");
                        nombre = teclado.nextLine();
                        vacunaActiva = clinica1.buscarVacuna(nombre);

                        System.out.println("Introduce la fecha y hora de la vacuna");
                        fecha = Calendar.getInstance();
                        System.out.println("introduce año");
                        int anyo = teclado.nextInt();
                        System.out.println("introduce mes");
                        int mes = teclado.nextInt();
                        System.out.println("introduce dia");
                        int dia = teclado.nextInt();
                        fecha.set(anyo, mes, dia);
                        System.out.println("fecha " + fecha.getTime());

                        vacunaPerro1 = new VacunaPerro(fecha, vacunaActiva);
                        perroActivo.vacunar(vacunaPerro1);

                    } else {
                        System.out.println("Perro no encontrado, dar de alta");
                    }
                    break;

            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("---------------------------");
        System.out.println("1.- Alta de la clinica");
        System.out.println("2.- Alta de la vacuna");
        System.out.println("3.- Alta de perro");
        System.out.println("4.. Vacuna de perro");
        System.out.println("5.- Listado de vacunas");
        System.out.println("6.- Cambiar fecha de proxima vacunacion");
        System.out.println("7.- Listado de todos perros vacunados");
        System.out.println("8.- Listado de perros para vacunar");
        System.out.println("------------------------------");
    }
}
