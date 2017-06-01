package cdtwitter;

import javax.swing.JOptionPane;



public class CDTwitter {

    public static void main(String[] args) {
        
        Funciones Twitt = new Funciones();
        
        Twitt.conectar();
        Twitt.twittear(JOptionPane.showInputDialog("Introducir nuevo Estado"));
        Twitt.lineaTiempo();
        Twitt.buscarTwit(JOptionPane.showInputDialog("Introduce el hastag"));
        Twitt.enviarMensaje(JOptionPane.showInputDialog("Introduce destinatario"), JOptionPane.showInputDialog("Introduce el mensaje"));

    }

}
