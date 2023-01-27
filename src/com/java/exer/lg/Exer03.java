package com.java.exer.lg;

import java.util.Scanner;

/**
 * Faça um programa que peça dois números e imprima a soma.
 */
public class Exer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " é " + soma);
    }
}
