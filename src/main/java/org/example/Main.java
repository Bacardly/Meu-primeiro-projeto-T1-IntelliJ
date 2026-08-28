package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        // 1. Casting implícito
        int numeroInt = 10;
        double numeroDouble = numeroInt;

        System.out.println("Exercício 1:");
        System.out.println("Valor int: " + numeroInt);
        System.out.println("Valor double: " + numeroDouble);


        // 2. Casting explícito
        double valorFracionado = 15.75;
        int valorInteiro = (int) valorFracionado;

        System.out.println("\nExercício 2:");
        System.out.println("Valor double: " + valorFracionado);
        System.out.println("Valor int: " + valorInteiro);


        // 3. Conversão de tipos
        float valorFloat = 25.50f;
        long valorLong = (long) valorFloat;
        double valorDouble = valorLong;

        System.out.println("\nExercício 3:");
        System.out.println("Valor float: " + valorFloat);
        System.out.println("Valor long: " + valorLong);
        System.out.println("Valor double: " + valorDouble);


        // 4. Diferença entre tipos de dados
        short valorShort = 100;
        int valorInt = valorShort;
        byte valorByte = (byte) valorShort;

        System.out.println("\nExercício 4:");
        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor byte: " + valorByte);
    }
}
