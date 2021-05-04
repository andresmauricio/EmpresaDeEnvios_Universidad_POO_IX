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
public class Factura {
    
    // INSERT INTO `factura` (`idFactura`, `valor`, `iva`, `total`, `Facturacol`, `Usuario_idUsuario`) VALUES ('1', '500000', '18', '550000', 'FACTURA', '2');
    private final String id;
    private final String valor;
    private final String iva;
    private final String total;
    private final String factura;
    private final String empleado;
    
    private static final  Conexion conexion = new Conexion();
    
    public Factura (String id, String valor, String iva, String total, String factura, String empleado) {
        this.id = id;
        this.valor = valor;
        this.iva = iva;
        this.total = total;
        this.factura = factura;
        this.empleado = empleado;
        
    }

    
    public void inserFactura() throws SQLException {
        String seleccion = "INSERT INTO `factura` (`idFactura`, `valor`, `iva`, `total`, `Facturacol`, `Usuario_idUsuario`)"+"values (?,?,?,?,?, ?)";
        PreparedStatement ps=conexion.IConnection.prepareStatement(seleccion);
        ps.setString(1, this.id);
        ps.setString(2, this.valor);
	ps.setString(3, this.iva);
	ps.setString(4, this.total);
	ps.setString(5, this.factura);
        ps.setString(6, this.empleado);
        ps.executeUpdate();
   }
}
