
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julieth
 */
public class Solicitud_usuario {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero");
        int numero = scanner.nextInt();
        
        if (numero > 0){
            System.out.print("ingrese otro valor");
            int numero2 = scanner.nextInt();
            
            int suma = numero + numero2;
            int resta = numero - numero2;
            int producto = numero * numero2;
        
        System.out.println("la suma de los dos numeros ingresados es: " + suma);
        System.out.println("la resta de los dos numeros ingresados es: " + resta);
        System.out.println("la producto de los dos numeros ingresados es: " + producto);
            
        }else{
            System.out.println("el primero valor no es positivo");
        }
        
        
        scanner.close();
        
                
                
        
    }
}
