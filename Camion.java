
package Clases;

import java.time.LocalDate;

public class Camion {
   private String patente, modelo, marca;
   private int capacidad;
   private LocalDate fechaReg;
   

    public Camion(String patente, String modelo, String marca, int capacidad,LocalDate fechaReg) {
        
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidad = capacidad;
        this.fechaReg = fechaReg;
        
    } 

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public LocalDate getFechaReg() {
        return fechaReg;
    }
   
   
}
