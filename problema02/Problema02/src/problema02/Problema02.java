/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiven
 */
public class Problema02 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        double area;
        double base;
        double altura;
        
        System.out.println("ingrese la base del triangulo");
        base = entrada.nextDouble();
                
        System.out.println("ingrese la altura del triangulo");
        altura = entrada.nextDouble();
                
        area = (base * altura) / 2;
        
        System.out.printf("AREA DEL TRIANGULO\n------\nBase: %.2f\nAltura: %.2f"
                + "\n------\nArea: %.2f\n",base , altura , area);
        
    }
    
}
