/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Gianpaolo
 */
public class RolEnTrabajo {
    
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private String razon;
    private Rol UnRol;
    private Profesor UnProfesor;

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Rol getUnRol() {
        return UnRol;
    }

    public void setUnRol(Rol UnRol) {
        this.UnRol = UnRol;
    }

    public Profesor getUnProfesor() {
        return UnProfesor;
    }

    public void setUnProfesor(Profesor UnProfesor) {
        this.UnProfesor = UnProfesor;
    }

    public RolEnTrabajo(LocalDate fechaDesde,Profesor UnProfesor,Rol UnRol) {
        this.fechaDesde = fechaDesde;
        this.UnProfesor = UnProfesor;
        this.UnRol = UnRol;
        
    }
    
public void mostrar(){

    System.out.println("\nLa fecha desde que empezo el trabajo es: "+fechaDesde+" la fecha hasta que realizo el trabajo es: "+fechaHasta+" la razon por la que abandono el trabajo es: "+razon+" el rol que realizaba es: "+UnRol+" el profesor que lo realizaba es: "+UnProfesor);
    
    
    
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.UnProfesor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RolEnTrabajo other = (RolEnTrabajo) obj;
        if (!Objects.equals(this.UnProfesor, other.UnProfesor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
         this.UnProfesor.mostrar();
        return "";
       
            
    }






}
