/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fase3envio;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class Conexion {
    public void establecerConexion() {
        String host = "localhost";
        String user = "root";
        String password = "";
        String basededatos = "envios";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            String newConnection = "jdbc:mysql://"+host+"/"+basededatos+"?"+"user="+user+"&password="+password;
            con = DriverManager.getConnection(newConnection);
            System.out.println("Conexion Exitosa");
            
        } catch (Exception e) {
            System.out.println("Ocurrio un Error" + e);
        }
    }
    
    
}
