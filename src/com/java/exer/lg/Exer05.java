package com.java.exer.lg;

import java.util.Scanner;

/**
 * Faça uma programa que converta metros para centímetros
 */

public class Exer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os metros:");
        double metros = scanner.nextDouble();

        //1m = 100cm
        double cm = metros * 100;

        System.out.println(metros + "m é igual a " + cm + "cm");



    }
}
