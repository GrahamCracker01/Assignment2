//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment2A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intPeople;
        int intGroups;
        int intRemainder;

        //get input
        System.out.print("How many people are in your group? ");
        intPeople = scan.nextInt();
        System.out.print("How many groups do you want: ");
        intGroups = scan.nextInt();

        //math
        intRemainder = (intPeople % intGroups);

        //output
        System.out.println("");
        System.out.println("If we divide " + intPeople + " people in " + intGroups + " groups evenly, " + intRemainder + " person/people will be left without a group.");

    }
}