/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo.modelo;

/**
 *
 * @author Nicolas
 */
public class Inscripcion {
    private int idInsc;
    private int idAlumno;
    private int idMateria;
    private double nota;
    private boolean activo;

    public Inscripcion(int idInsc, int idAlumno, int idMateria, double nota, boolean activo) {
        this.idInsc = idInsc;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
        this.activo = activo;
    }

    public Inscripcion() {
    }

    public Inscripcion(int idAlumno, int idMateria, double nota, boolean activo) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
        this.activo = activo;
    }

    public int getIdInsc() {
        return idInsc;
    }

    public void setIdInsc(int idInsc) {
        this.idInsc = idInsc;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
