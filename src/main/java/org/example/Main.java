package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tempo de empresa (meses): ");
        int meses = sc.nextInt();

        if (meses > 3)
            System.out.println("Pode aderir ao plano de saúde.");
        else
            System.out.println("Não pode aderir ao plano de saúde.");
    }
}