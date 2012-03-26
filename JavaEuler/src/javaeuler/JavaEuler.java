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
    
    public static final int PROBLEMS = 2;
    public static void main(String[] args) {
        //counter for how many problems I've implemented.  Sadly, I can't figure
        //out a way to have JavaEuler actually count this intelligently, so
        //I unfortunately have to increment it myself until I figure it out.
        System.out.println("This app contains several problems from ProjectEuler.net. \n");
        while(true)
        {
        System.out.println("Enter 1 for Problem 1.\n");
        System.out.println("Enter 2 for Problem 2.\n");
        
        //grab the input from the user to get which problem they want
        Scanner problemScanner = new Scanner (System.in);
        String chooseProblem = problemScanner.next();

        System.out.println("You have entered " + chooseProblem + ".\n");
        
        
        
        //Check to see if the user's input is actually an integer rather than a letter

        int theProblem;
        
        Boolean inputTest = CheckInput(chooseProblem);
        if (inputTest == true){
            theProblem = Integer.parseInt(chooseProblem);
            //now to check if the user actually input an actual problem number.
            boolean problemNumber = checkProblem(theProblem);
            if (problemNumber == true){
                //call number
                GetProblem(theProblem);
                break;
            }
            else {
                System.out.println("You did not enter a problem that I have done! \n");
                System.out.println("Please enter a number between 1 and " + PROBLEMS + ".\n");
            }
        }
        else {
            System.out.println("Please input a number.");
        }
        
        
        
    }
}
    //This method checks to see if the input is actually a string
    public static boolean CheckInput(String chooseProblem)
    {
        try {
        //Make the string into an integer.
        Integer.parseInt(chooseProblem);
        return true;
        }
        catch(NumberFormatException nfe) {
            return false;
        }
    }
    
    //This checks to see if the user input is actually a problem number
    public static boolean checkProblem(int userInput)
    {
        //now kiss!  I mean, compare!
        if (userInput <= PROBLEMS && userInput > 0)
        {
            return true;
        }
        else {
            
            //clear any buffered stuff
            System.out.flush();
            return false;
        }
    }
    
    //This gets the problem number, and pulls its information.
    public static void GetProblem(int problemNumber)
    {
        
        switch (problemNumber)
        {
            case 1: 
                ProblemOne.ProbOne(problemNumber);
                break;
            case 2:
                ProblemTwo.ProbTwo(problemNumber);
                break;
            default: break;    
        }
        //void return
        
    }
}