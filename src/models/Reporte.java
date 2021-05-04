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
public class Reporte {
    
       private final int idReporte;
       private final String tipo ;
       private final String ciudad;
       private final String valor;
       private final String Empleado_idEmpleado;
       
       private static final  Conexion conexion = new Conexion();
       
       public Reporte(int id, String tipo, String ciudad, String valor, String idEmpleado) {
           this.idReporte = id;
           this.tipo = tipo;
           this.ciudad = ciudad;
           this.valor = valor;
           this.Empleado_idEmpleado = idEmpleado; 
       }

       public void inserReport() throws SQLException {
        String seleccion = "INSERT INTO `reporte`(`idReporte`, `tipo`, `ciudad`, `valor`, `Empleado_idEmpleado`)"+"values (?,?,?,?,?)";
        PreparedStatement ps=conexion.IConnection.prepareStatement(seleccion);
        ps.setInt(1, this.idReporte);
        ps.setString(2, this.tipo);
	ps.setString(3, this.ciudad);
	ps.setString(4, this.valor);
	ps.setString(5, this.Empleado_idEmpleado);
        ps.executeUpdate();
   }
    
}
