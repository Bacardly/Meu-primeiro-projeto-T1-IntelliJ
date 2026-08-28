package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Exercício 1 - Cálculo de IMC

        System.out.println("Exercício 1 - Cálculo de IMC");

        System.out.println("Digite o peso em kg:");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura em metros:");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC é: " + imc);


        // Exercício 2 - Conversor de Medidas

        System.out.println("\nExercício 2 - Conversor de Medidas");

        System.out.println("Digite o valor em metros:");
        double metros = entrada.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("Valor em centímetros: " + centimetros);
        System.out.println("Valor em milímetros: " + milimetros);


        // Exercício 3 - Divisão e Resto

        System.out.println("\nExercício 3 - Divisão e Resto");

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = entrada.nextInt();

        int quociente = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("Quociente da divisão: " + quociente);
        System.out.println("Resto da divisão: " + resto);


        // Exercício 4 - Cálculo de Juros Simples

        System.out.println("\nExercício 4 - Cálculo de Juros Simples");

        System.out.println("Digite o capital inicial:");
        double capital = entrada.nextDouble();

        System.out.println("Digite a taxa de juros mensal:");
        double taxa = entrada.nextDouble();

        System.out.println("Digite o tempo em meses:");
        double tempo = entrada.nextDouble();

        double juros = capital * taxa * tempo;
        double montante = capital + juros;

        System.out.println("Juros: R$ " + juros);
        System.out.println("Montante final: R$ " + montante);


        // Exercício 5 - Conversor de Tempo

        System.out.println("\nExercício 5 - Conversor de Tempo");

        System.out.println("Digite a quantidade total de segundos:");
        int segundosTotais = entrada.nextInt();

        int horas = segundosTotais / 3600;
        int minutos = (segundosTotais % 3600) / 60;
        int segundos = segundosTotais % 60;

        System.out.println("Tempo convertido: " + horas + " horas, "
                + minutos + " minutos e " + segundos + " segundos.");

        entrada.close();
    }
}