package org.example;

public class Main {

    public static void main(String[] args) {

        // Exercício 1 - Comparação de dois números

        int numero1 = 10;
        int numero2 = 20;

        System.out.println("Exercício 1 - Comparação de dois números:");

        System.out.println("numero1 > numero2: " + (numero1 > numero2));
        System.out.println("numero1 < numero2: " + (numero1 < numero2));
        System.out.println("numero1 >= numero2: " + (numero1 >= numero2));
        System.out.println("numero1 <= numero2: " + (numero1 <= numero2));
        System.out.println("numero1 == numero2: " + (numero1 == numero2));
        System.out.println("numero1 != numero2: " + (numero1 != numero2));


        // Exercício 2 - Operadores lógicos

        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        System.out.println("\nExercício 2 - Operadores lógicos:");

        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 && cond3: " + (cond1 && cond3));

        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("cond2 || cond3: " + (cond2 || cond3));
    }
}