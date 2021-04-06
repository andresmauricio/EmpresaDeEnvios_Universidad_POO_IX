/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fase3envio;

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
        showPanelLogin();

    }
    
    public static void showPanelLogin() {
        JFrame ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
    }
    
    private static void showPanelConexion() {
        JFrame ventanaConex = new VentanaConexion();
        ventanaConex.setVisible(true);
    }
    
}
