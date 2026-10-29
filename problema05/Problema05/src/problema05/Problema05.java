/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author tiven
 */
public class Problema05 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        
        String cliente;
        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double precioSpotify;
        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;
        double descuentoSpotify = 0;
        double finalNetflix;
        double finalYoutube;
        double finalDropbox;
        double finalSpotify;
        double totalSinDescuento;
        double ahorroTotal;
        double totalPagar;
        double porcentajeNetflix = 0.23;
        double porcentajeYoutube = 0.23;
        double porcentajeDropbox = 0.45;

        System.out.println("Ingrese el nombre del cliente");
        cliente = entrada.nextLine();

        System.out.println("Ingrese el precio mensual de Netflix");
        precioNetflix = entrada.nextDouble();

        System.out.println("Ingrese el precio mensual de YouTube Premium");
        precioYoutube = entrada.nextDouble();

        System.out.println("Ingrese el precio mensual de Dropbox");
        precioDropbox = entrada.nextDouble();

        System.out.println("Ingrese el precio mensual de Spotify");
        precioSpotify = entrada.nextDouble();

        descuentoNetflix = precioNetflix * porcentajeNetflix;
        descuentoYoutube = precioYoutube * porcentajeYoutube;
        descuentoDropbox = precioDropbox * porcentajeDropbox;

        finalNetflix = precioNetflix - descuentoNetflix;
        finalYoutube = precioYoutube - descuentoYoutube;
        finalDropbox = precioDropbox - descuentoDropbox;
        finalSpotify = precioSpotify - descuentoSpotify;

        totalSinDescuento = precioNetflix + precioYoutube + precioDropbox + precioSpotify;
        ahorroTotal = descuentoNetflix + descuentoYoutube + descuentoDropbox + descuentoSpotify;
        totalPagar = finalNetflix + finalYoutube + finalDropbox + finalSpotify;

        System.out.printf("REPORTE DE SERVICIOS DIGITALES\n"
                + "Cliente: %s\n"
                + "------------------------------\n"
                + "Netflix (23%%): descuento $%.2f, precio final $%.2f\n"
                + "YouTube Premium (23%%): descuento $%.2f, precio final $%.2f\n"
                + "Dropbox (45%%): descuento $%.2f, precio final $%.2f\n"
                + "Spotify (0%%): descuento $%.2f, precio final $%.2f\n"
                + "------------------------------\n"
                + "Costo total sin descuentos: $%.2f\n"
                + "Ahorro mensual total: $%.2f\n"
                + "Total a pagar mensualmente: $%.2f\n",
                cliente,
                descuentoNetflix, finalNetflix,
                descuentoYoutube, finalYoutube,
                descuentoDropbox, finalDropbox,
                descuentoSpotify, finalSpotify,
                totalSinDescuento, ahorroTotal, totalPagar);
        }
}