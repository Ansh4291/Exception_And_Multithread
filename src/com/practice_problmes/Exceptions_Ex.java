package com.practice_problmes;

public class Exceptions_Ex {
    public static void main(String[] args) {

//        program to demonstrate ArithmeticException

//        {
//            try {
//                int a = 30, b = 0;
//                int c = a / b;  // cannot divide by zero
//                System.out.println("Result = " + c);
//            } catch (ArithmeticException e) {
//                System.out.println("Can't divide a number by 0");
//            }
//        }

//        program to demonstrate NullPointerException

//        try {
//            String a = null; //null value
//            System.out.println(a.charAt(0));
//        } catch(NullPointerException e) {
//            System.out.println("NullPointerException..");
//        }

//        program to demonstrate StringIndexOutOfBoundsException

        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}