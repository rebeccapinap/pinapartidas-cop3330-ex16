package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final int legalAge = 16;

        // Determines if user is old enough to drive using age input
        System.out.print("What is your age? ");
        int age = input.nextInt();

        String str = age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.print(str);
    }
}
