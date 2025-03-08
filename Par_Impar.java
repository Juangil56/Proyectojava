/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author julieth
 */
public class Par_Impar {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println("el numero " + numero + "es par");
        }else{
            System.out.println("el numero " + numero + "es impar");
        }
    scanner.close();
    }
    
    
    
}
