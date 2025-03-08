/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemario_java;

import java.util.Scanner;

/**
 *
 * @author julieth
 */
public class determinar_numero_mayor {

    /**
     * Sistema para determinar cual es el numero mayor entre dos valores. 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int numero = scanner.nextInt();
        System.out.print("ingrese otro numero: ");
        int numero2 = scanner.nextInt();
        int mayor;
        if (numero > numero2){
            mayor = numero;
        }else{
            mayor = numero2;
        }
        System.out.println("el numero mayor es:" + mayor);
        scanner.close();
             
    }
   
}   
     
 
