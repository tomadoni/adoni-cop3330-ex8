/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int people=0;
        int pizza=0;
        int slices=0;
        System.out.println("How many people?");
        people= kb.nextInt();
        System.out.println("How many pizzas do you have?");
        pizza= kb.nextInt();
        System.out.println("How many slices per pizza?");
        slices= kb.nextInt();
        System.out.println(people+" people with "+pizza+" pizzas ("+(pizza*slices)+" slices)");
        System.out.println("Each person gets "+(pizza*slices)/people+" pieces of pizza.");
        System.out.println("There are "+(pizza*slices)%people+" leftover pieces.");
    }
}
