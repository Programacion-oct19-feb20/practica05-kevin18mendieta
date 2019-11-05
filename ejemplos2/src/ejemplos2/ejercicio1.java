/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * un padre de familia a pagado 3 cuotas de navidad de sus hijos la cuota uno 
 * fue de 15 dolares la cuota 2 de 10 dolares y la cuota 3 de 16 dolares generar
 * un programa en lenjuaje java que permita ingresar por teclado los valores de
 * las cuotas luego presentar el promedio de dolares pagados entre las cuotas  
 * ademas presentar un mensaje en pantalla (true o false) dependiendo del 
 * promedio si el promedio es mayor o igual a 11 deberia salir true si el promedio 
 * es menor a 11 tendria que salir false
 */
public class ejercicio1 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cuota1 = 15;
        int cuota2 = 10;
        int cuota3 = 16;
        int suma = cuota1 + cuota2 + cuota3;
        int promedio = cuota1 + cuota2 + cuota3;
        
        
        System.out.printf("Ingrese su cuota 1:");
        cuota1= entrada.nextInt();
        System.out.printf("Ingrese su cuota 2:");
        cuota2= entrada.nextInt();
        System.out.printf("Ingrese su cuota 3:");
        cuota3= entrada.nextInt();
        System.out.printf("Suma: %d + %d + %d = %d\n", cuota1, cuota2, cuota3,
                cuota1 + cuota2 + cuota3);
        System.out.printf("El promedio de dolares pagados entre las coutas es :"
        + "\n%d >=11 %s\n", promedio, 11<= promedio);
        
    }
}
