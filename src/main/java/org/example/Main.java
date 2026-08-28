package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Exercício 1 - Média Aritmética

        System.out.println("Exercício 1 - Média Aritmética");

        System.out.println("Digite a primeira nota:");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + media);


        // Exercício 2 - Conversor de Temperatura

        System.out.println("\nExercício 2 - Conversor de Temperatura");

        System.out.println("Digite a temperatura em Celsius:");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);


        // Exercício 3 - Área do Quadrado

        System.out.println("\nExercício 3 - Área do Quadrado");

        System.out.println("Digite o lado do quadrado:");
        double lado = entrada.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);


        // Exercício 4 - Perímetro do Retângulo

        System.out.println("\nExercício 4 - Perímetro do Retângulo");

        System.out.println("Digite a base do retângulo:");
        double base = entrada.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        double altura = entrada.nextDouble();

        double perimetro = 2 * (base + altura);

        System.out.println("O perímetro do retângulo é: " + perimetro);


        // Exercício 5 - Cálculo de Desconto

        System.out.println("\nExercício 5 - Cálculo de Desconto");

        System.out.println("Digite o valor do produto:");
        double valorProduto = entrada.nextDouble();

        double desconto = valorProduto * 0.15;
        double novoValor = valorProduto - desconto;

        System.out.println("O valor do desconto é: " + desconto);
        System.out.println("O novo valor do produto é: " + novoValor);

        entrada.close();
    }
}