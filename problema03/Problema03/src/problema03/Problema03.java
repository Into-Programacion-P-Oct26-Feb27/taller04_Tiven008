/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiven
 */
public class Problema03 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        
        String Titular;
        String Direccion;
        double costoMinuto = 1.50;
        int minutos;
        double valorTotal;
        
        System.out.println("ingrese el nombre del Titular");
        Titular = entrada.nextLine();
        System.out.println("ingrese la direcion de su domicilio");
        Direccion = entrada.nextLine();
        
        System.out.println("ingrese los minutos consumidos");
        minutos = entrada.nextInt();
                
        valorTotal = costoMinuto * minutos;
        
        System.out.printf("======\nPLANTILLA DE SERVICIO TELEFONICA \n======\n"
                + "Titular: %s\nDireccion: %s\n------ \nCosto por minuto: $%.2f\n"
                + "Minutos consumidos: %d\n------ \nValor total a pagar: $%.2f\n"
                + "======\n",Titular ,Direccion ,costoMinuto ,minutos , valorTotal);
        
    }
    
}
