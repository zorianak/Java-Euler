/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeuler;

/**
 *
 * @author LoLBRB
 */
public class ProblemOne extends Problem {
    public static void ProbOne(int problemNumber)
    {
        
       Problem One = new Problem();
                //first we want to add everything that is a multiple of three less than 1k
                System.out.println("Working..");
                //counter, to increase when we want it to
                int i;
                //holds actual summation
                int sum = 0;
                
                for(i = 1; i < 1000; i++){
                    if(i%3 == 0)//is it divisible by 3
                    {
                        sum += i;
                        continue;
                    }
                    else if (i % 5 == 0) //is it divisible by 3
                    {
                        sum += i;
                    }
                }

                One.answer = sum;
                One.solution = "I approached this problem by creating two "+
                        "variables; one, i, which would track the numbers from " +
                        "1 to 1000, and sum, which would actually track the sum.  \n" +
                        "I then created a 'for' loop which incremented i from 1 - 1000, "+
                        "and within that loop, I checked if i was divisible by 3 " +
                        " or 5 through modulus division.  \nIf it happened to be divisible, "+
                        "it incremented sum by that amount (sum + i). \n "+
                        "It should also be added that a \"Continue\" keyboard is " +
                        "used when determining if i is divisble by 3 to skip over "+
                        "checking if it is divisible by 5.\n\n";
                One.question = "Find the sume of all multiples of 3 or 5 below 1000.\n";
                System.out.println(One.question + "\n" + One.solution + "\n Therefore, the answer is " + One.answer);
    }
}
