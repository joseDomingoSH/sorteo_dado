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
    // Hecho por Gerardo <3
    public static String dado;
    public static int iteracion;
    

    public static int lanzarDado() {
        return (int) (Math.random() * 6) + 1;
    }

    public static String compararDado(int n){
        int i = 1;
        int d = 0;
        String reporte = "";
        
        while(i <= n){
            
            d = lanzarDado();
            
            if (d == 1 || d == 2) {
                reporte += "Iteración " + i + " \t " + " Dado: " + d + "\n";
                i++;
            }else if (d == 3 || d == 4 || d == 5 || d == 6){
                reporte += "Iteración " + i + " \t " + "Dado: " + d + "\n";
                break;
            }
        }
        return reporte;
    }
    // Hecho por Gerardo <3
}
