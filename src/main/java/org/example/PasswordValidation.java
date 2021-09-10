/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class PasswordValidation {

    static public void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.printf("What is the password? ");

        String password = input.next();

        if (password.equals("abc$123"))
            System.out.printf("Welcome!");
        else
            System.out.printf("I don't know you.");
    }
}
