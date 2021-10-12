/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo.control;

import grupo.modelo.*;
import grupo.modelo.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas
 */
public class AlumnoData {
    private Connection con;

    public AlumnoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion"+ex);
        }
        
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql = "INSERT INTO  alumno (legajo, nombre, apellido, fechNac, activo) VALUES (?, ? , ? , ? , ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getLegajo());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setDate(4, Date.valueOf(alumno.getFechNac()));
            ps.setBoolean(5, alumno.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys(); 
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt(0)); // 0 es la posicion de idAlumno en la base de datos
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("no se pudo instertar el allumno"+ex);
        }
    }
}
