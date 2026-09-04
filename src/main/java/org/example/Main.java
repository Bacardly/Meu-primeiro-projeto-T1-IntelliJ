package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu salario: ");
            var salario = sc.nextDouble();

            System.out.println("Digite sua parcela desejada: ");
            var parcela = sc.nextDouble();

            if (parcela <= salario * 0.30)
                System.out.println("Pode solicitar o emprestimo.");
            else
                System.out.println("Não pode solicitar o emprestimo");
        }
}