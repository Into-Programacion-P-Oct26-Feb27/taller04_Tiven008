/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema01 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gasto_mensual;
        
        System.out.println("ingrese el nombre proyecto 1");
        proyecto1 = entrada.nextLine();
                
        System.out.println("ingrese el nombre proyecto 2");
        proyecto2 = entrada.nextLine();
                
        System.out.println("ingrese el nombre proyecto 3");
        proyecto3 = entrada.nextLine();
        
        System.out.println("ingrese gasto 1");
        gasto1 = entrada.nextDouble();
        
        System.out.println("ingrese gasto 2");
        gasto2 = entrada.nextDouble();
        
        System.out.println("ingrese gasto 3");
        gasto3 = entrada.nextDouble();
        
        gasto_mensual = gasto1 + gasto2 + gasto3;
        
        System.out.printf("CONTROL DE GASTOS DE PROYECTOS\nProyectos:\n-------\n"
                + "1.%s: $%.2f\n\n2.%s: $%.2f\n\n3.%s: $%.2f\n------\n"
                + "GASTO MENSUAL TOTAL: $%.2f\n",proyecto1, gasto1, proyecto2,gasto2,
                proyecto3 , gasto3 , gasto_mensual);
        
    }
    
}
