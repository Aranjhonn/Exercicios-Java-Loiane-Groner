package com.java.exer.lg;

import java.util.Scanner;

/**
 * Faça um programa que peça um número e então mostre a mensagem "O número foi [número]
 */
public class Exer02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("O número foi: " + numero);

    }
}
