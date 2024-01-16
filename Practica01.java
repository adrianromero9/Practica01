
package com.mycompany.practica01;

import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String nombre;
        int edad;
        double altura;
        double peso;
        double imc;
       
        System.out.println("Formulario de Persona");
        System.out.println("=====================");
        System.out.println();
        System.out.println("Nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Edad: ");
        edad = scanner.nextInt();
        System.out.println("Altura: ");
        altura = scanner.nextDouble();
        System.out.println("Peso: ");
        peso = scanner.nextDouble();
        imc = peso/(altura*altura);
        System.out.println("El índice de la masa corporal es: " + imc);
        
    
    
    }    
}
