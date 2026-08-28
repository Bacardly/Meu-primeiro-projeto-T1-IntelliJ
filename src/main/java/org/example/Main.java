package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Exercício 1 - Conversor de Moeda

        System.out.println("Exercício 1 - Conversor de Moeda");

        System.out.println("Digite o valor em Reais:");
        double reais = entrada.nextDouble();

        System.out.println("Digite a cotação do Dólar:");
        double cotacaoDolar = entrada.nextDouble();

        double dolares = reais / cotacaoDolar;

        System.out.println("O valor convertido em Dólares é: " + dolares);


        // Exercício 2 - Consumo de Combustível

        System.out.println("\nExercício 2 - Consumo de Combustível");

        System.out.println("Digite a distância percorrida em km:");
        double distancia = entrada.nextDouble();

        System.out.println("Digite o total de combustível gasto em litros:");
        double litros = entrada.nextDouble();

        double consumo = distancia / litros;

        System.out.println("O consumo médio é: " + consumo + " km/l");


        // Exercício 3 - Salário Mensal

        System.out.println("\nExercício 3 - Salário Mensal");

        System.out.println("Digite o valor da hora trabalhada:");
        double valorHora = entrada.nextDouble();

        System.out.println("Digite o número de horas trabalhadas no mês:");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.println("O salário bruto é: R$ " + salarioBruto);


        // Exercício 4 - Área do Círculo

        System.out.println("\nExercício 4 - Área do Círculo");

        System.out.println("Digite o raio do círculo:");
        double raio = entrada.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("A área do círculo é: " + area);


        // Exercício 5 - Troca de Valores

        System.out.println("\nExercício 5 - Troca de Valores");

        System.out.println("Digite o valor de A:");
        int valorA = entrada.nextInt();

        System.out.println("Digite o valor de B:");
        int valorB = entrada.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("A = " + valorA);
        System.out.println("B = " + valorB);

        int temporario = valorA;
        valorA = valorB;
        valorB = temporario;

        System.out.println("Depois da troca:");
        System.out.println("A = " + valorA);
        System.out.println("B = " + valorB);

        entrada.close();
    }
}