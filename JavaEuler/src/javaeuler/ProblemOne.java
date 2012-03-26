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
                One.solution = "I guess I should do this in Java.\n";
                One.question = "Find the sume of all multiples of 3 or 5 below 1000.\n";
                System.out.println(One.question + "\n" + One.solution + "\n Therefore, the answer is " + One.answer);
    }
}
