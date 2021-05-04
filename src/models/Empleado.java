/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import fase3envio.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class Empleado extends Person {
    
    public Empleado(String id, 
            String nombres, 
            String identificacion, 
            String nacimiento, 
            String direccion, 
            String telefono, 
            String rol, 
            String password) {
        super(  id, 
                nombres, 
                identificacion, 
                nacimiento, 
                direccion, 
                telefono, 
                rol, 
                password);
    }
    
   private static  Conexion conexion = new Conexion();
   
   public void insertaEmpleado() throws SQLException{
                // INSERT INTO `empleado` (`idEmpleado`, `identificacion`, `nombres`, `fecha_de_nacimiento`, `telefono`, `password`, `Empleadocol`, `rol`) VALUES ('1', '105241222336', 'Andres Acelas', '2021-05-04', '315447174', 'casitaroja', 'CONST', 'ADMIN');
		// conexion.establecerConexion();
		String seleccion="INSERT INTO `empleado`(`idEmpleado`,`identificacion`,`nombres`,`fecha_de_nacimiento`,`telefono`,`password`, `Empleadocol`, `rol`)"+"values (?,?,?,?,?,?,?,?)";
		PreparedStatement ps=conexion.IConnection.prepareStatement(seleccion);
		ps.setString(1, id);
		ps.setString(2, identificacion);
		ps.setString(3, nombres);
		ps.setString(4, nacimiento);
		ps.setString(5, telefono);
		ps.setString(6, password);
		ps.setString(7, "SEDE COLOMBIA");
                ps.setString(8, rol);
                System.out.println(ps);
		ps.executeUpdate();
    }
   


    
}
