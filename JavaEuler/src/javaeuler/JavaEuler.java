package javaeuler;

import java.util.*;

/**
 *
 * @author The Kim
 */
public class JavaEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //counter for how many problems I've implemented.  Sadly, I can't figure
        //out a way to have JavaEuler actually count this intelligently, so
        //I unfortunately have to increment it myself until I figure it out.
        int problems = 1;
        
        while(true)
        {
        System.out.println("This app contains several problems from ProjectEuler.net. \n");
        System.out.println("Enter 1 for Problem 1.");
        
        //grab the input from the user to get which problem they want
        Scanner problemScanner = new Scanner (System.in);
        String chooseProblem = problemScanner.next();

        System.out.println("You have entered " + chooseProblem);
            
        //First, make the string into an integer.
        int theProblem = Integer.parseInt(chooseProblem);
        
        
        //now to check if the user actually input an actual problem number.
        
        //now kiss!  I mean, compare!
        if (theProblem <= problems && theProblem > 0)
        {
            //code to select problem
            break;
        }
        else {
            System.out.println("You did not enter a problem that I have done! \n");
            System.out.println("Please enter a number less than " + problems + ".\n");
            //clear any buffered stuff
            System.out.flush();
            
        
        }
        
        
    }
}
