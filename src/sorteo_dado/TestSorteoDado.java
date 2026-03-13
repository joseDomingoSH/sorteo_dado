/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorteo_dado;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 *
 * @author jSarabia
 */
public class TestSorteoDado {
    public static JTextArea textArea = new JTextArea(5,20);
    public static JScrollPane scroll = new JScrollPane (textArea);
    
    public static void main(String[] args) {
        String reporte = "";
        int opcion;
        opcion = JOptionPane.showConfirmDialog(null, "Quieres empezar el sorteo?");
        if (opcion==0) {
            reporte += "     Iteraciones del sorteo\n";
            reporte += SorteoDado.compararDado();
            textArea.setText(reporte);
            JOptionPane.showMessageDialog(null, scroll);
        } else {
            JOptionPane.showMessageDialog(null, "Fin del sorteo");
        }
    }
    
}
