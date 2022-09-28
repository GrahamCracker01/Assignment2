//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment2B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        float fltX1, fltX2, fltCurrentFrame, fltFPS, flt30Frame, flt60Frame;

        //first output and get input
        System.out.println("[Lerping!]");
        System.out.print("Enter the X coordinate for Keyframe #1: ");
        fltX1 = scan.nextFloat();
        System.out.print("Enter the X coordinate for Keyframe #2: ");
        fltX2 = scan.nextFloat();
        System.out.print("How many frames have passed? ");
        fltCurrentFrame = scan.nextInt();

        //math
        fltFPS = fltX2 - fltX1;
        flt30Frame = fltX1 + (fltFPS * (fltCurrentFrame / 30));
        flt60Frame = fltX1 + (fltFPS * (fltCurrentFrame / 60));

        //output
        System.out.println("");
        System.out.println("The character has to move " + fltFPS + " places in a second.");
        System.out.println("At 30 FPS, their current X position would be " + flt30Frame + ".");
        System.out.println("At 60 FPS, their current X position would be " + flt60Frame + ".");

    }
}