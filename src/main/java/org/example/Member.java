package org.example;

public class Member {
    public static void main(String[] args) {
        int a = 7, b , c = 0;
        int[] abs = {1, 2, 3, 4, 5};
        try {
            b = abs[5];
            c = a / b;
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println(c);
    }
}