package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = sc.nextLine();
        System.out.println("Who said it?");
        String person = sc.nextLine();
        System.out.println(person + " says, " + '"' + quote + '"');
    }
}