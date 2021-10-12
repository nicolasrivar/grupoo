/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo;

import grupo.control.AlumnoData;
import grupo.modelo.Alumno;
import grupo.modelo.Conexion;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas
 */
public class Grupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Conexion conexion = new Conexion();
            AlumnoData ad = new AlumnoData(conexion);
            Alumno a = new Alumno("Juan", "Lopez", LocalDate.of(2000, 2, 24), true, 1234);
            ad.guardarAlumno(a);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Grupo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
 