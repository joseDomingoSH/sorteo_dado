/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorteo_dado;

/**
 *
 * @author jSarabia
 */
public class SorteoDado {
    // Hecho por Gerardo  <3
    private static int dado;
    private static int iteracion;

    public static int lanzarDado() {
        return (int) (Math.random() * 6) + 1;
    }

    public static String compararDado(){
        String detalleReporte = "";
        iteracion = 1; //Hecho a la Mexicana por Ian 
        while(iteracion <= 3){
            
            dado = lanzarDado();
            
            if (dado == 1 || dado == 2) {
                detalleReporte += "Iteración " + iteracion + " \t " + " Dado: " + dado + "\n";
                iteracion++;
            }else if (dado == 3 || dado == 4 || dado == 5 || dado == 6){
                detalleReporte += "Iteración " + iteracion + " \t " + "Dado: " + dado + "\n";
                break;
            }
        }
        return detalleReporte;
    }
    // Hecho por Gerardo  <3
}
