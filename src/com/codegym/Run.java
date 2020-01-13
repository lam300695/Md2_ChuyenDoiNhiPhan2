package com.codegym;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so can chuyen : ");
        int num = sc.nextInt();
        System.out.println("He nhi phan cua " + num + " la : ");
        DecimalToBinaryExample decimalToBinaryExample = new DecimalToBinaryExample();
        decimalToBinaryExample.convert(num);
    }
}
