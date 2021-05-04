/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fase3envio;

import fase3envio.interfaces.RegistrarEmpleado;
import fase3envio.interfaces.VentanaConexion;
import fase3envio.interfaces.Login;
import fase3envio.interfaces.Envio;
import fase3envio.interfaces.GenerarReporte;
import fase3envio.interfaces.RegistrarUsuario;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Fase3Envio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Fase3EmpresaEnvios.Main.main()");
        Conexion conexion = new Conexion();
        conexion.establecerConexion();
        showPanelLogin();
        showPanelConexion();
        showPanelRegistrarEmpleado();
    }
    
    public static void showPanelLogin() {
        JFrame ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
    }
    
    private static void showPanelConexion() {
        JFrame ventanaConex = new VentanaConexion();
        ventanaConex.setVisible(true);
    }
    
    private static void showPanelRegistrarEmpleado() {
        JFrame registrarEmpleado = new RegistrarEmpleado();
        registrarEmpleado.setVisible(true);
    }
        
     private static void showPanelRegistrarUsuario() {
        JFrame registrarUsuario = new RegistrarUsuario();
        registrarUsuario.setVisible(true);
    }
    
    private static void showPanelGenerarReporte() {
        JFrame generarReporte = new GenerarReporte();
        generarReporte.setVisible(true);
    }
    
    private static void showPanelEnviar() {
        JFrame envio = new Envio();
        envio.setVisible(true);
    }
}
