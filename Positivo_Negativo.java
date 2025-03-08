/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author julieth
 */
public class Positivo_Negativo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero entero");
        int numero = scanner.nextInt();
        
        if (numero > 0){
            System.out.println("el numero" + numero + "es positivo");
        }else{
            System.out.println("el numero" + numero + "es negativo");
        }
        scanner.close();
    }
}
