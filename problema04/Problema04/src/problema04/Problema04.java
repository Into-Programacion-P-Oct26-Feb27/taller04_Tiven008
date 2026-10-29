/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiven
 */
public class Problema04 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        
        String cliente;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double costoBase;
        double costoAdicional = 0.15;
        double costoOperacional;
        double costoFinal;
        
        System.out.println("ingrese su Nombre");
        cliente = entrada.nextLine();
        System.out.println("Ingrese valor estimado del cpu");
        cpu = entrada.nextDouble(); 
        System.out.println("Ingrese valor estimado del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese valor estimado del raton");
        raton = entrada.nextDouble();
        System.out.println("Ingrese valor estimado de la pantalla");
        pantalla = entrada.nextDouble();
        
        costoBase = cpu + teclado + raton + pantalla;
        costoOperacional = costoBase * costoAdicional;
        costoFinal = costoBase + costoOperacional;
        
        System.out.printf("REPORTE: \nNombre del Cliente: %s\nValores Iniciales: "
                + "\nCPU: $%.1f\nTeclado: $%.1f\nRaton $%.1f\nPantalla $%.1f\n\n"
                + "Costo Base: $%.2f\nCosto Adicional del 15%% : $%.2f\nCosto final: "
                + "$%.2f\n",cliente , cpu, teclado, raton, pantalla ,costoBase ,
                costoOperacional ,costoFinal);
        
    }
    
}
    