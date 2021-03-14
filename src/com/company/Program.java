package com.company;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        int l = arr.length-1;
        for (int i = l; i >= 0; i--) {
            char a = arr[i];
            System.out.print(a);
        }
    }
}

