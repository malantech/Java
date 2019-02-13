package com.malantech;

public class Main {

    public static void main(String[] args) {

        // widths: int 32 (4 bytes), float = 32 (4 bytes), double 64 (8 bytes)
        int myIntVal = 5;
        float myFloatVal = 5f / 3;
        double myDoubVal = 5d / 3;
        System.out.println("MyIntVal = " + myIntVal);
        System.out.println("myFloatVal = " + myFloatVal);
        System.out.println("myDoubVal = " + myDoubVal);

        double numpounds = 200;
        double pounds = 1;
        double kilograms = .45359237;

        double totalkilos =(numpounds * pounds) * kilograms;

        System.out.println(totalkilos);


    }
}
