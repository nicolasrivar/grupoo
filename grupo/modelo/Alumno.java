/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo.modelo;

import java.time.LocalDate;

/**
 *
 * @author Nicolas
 */
public class Alumno {
    private int idAlumno;
    private String nombre;
    private String apellido;
    private LocalDate fechNac;
    private boolean activo;
    private int legajo;

    public Alumno(String nombre, String apellido, LocalDate fechNac, boolean activo, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechNac = fechNac;
        this.activo = activo;
        this.legajo = legajo;
    }

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, String apellido, LocalDate fechNac, boolean activo, int legajo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechNac = fechNac;
        this.activo = activo;
        this.legajo = legajo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    
    
    
    
}
