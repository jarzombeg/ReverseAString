package com.company;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String text = input.readLine();
        char[] arr = text.toCharArray();
        int l = arr.length-1;
        for (int i = l; i >= 0; i--) {
            char a = arr[i];
            System.out.print(a);
        }
    }
}

