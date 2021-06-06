/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int age = myApp.ageInput();
        String output = myApp.ageCheck(age);

        myApp.printOutput(output);
    }

    public int ageInput() {
        System.out.print("What is your age? " );
        return input.nextInt();
    }

    public String ageCheck(int age) {
        final String output = age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        return output;
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}
