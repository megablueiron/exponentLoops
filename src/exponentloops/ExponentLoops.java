/*
 * Michael Botros
 * Oct 10, 2019
 * This program will raise your number to an exponent that you choose using while loops
 */

package exponentloops;

//import scanner library
import java.util.Scanner;

/**
 *
 * @author mibot3117
 */
public class ExponentLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a new scanner object
        Scanner keyedInput = new Scanner(System.in);
        
        //declaring a variable for choice
        int choice = 0;
        int number = 0;
        int exponent = 0;
        int result = 0;
        int base = 0;
        
        //Setting up a loop for all the instructions and options for the program
        while (choice != 4){
            
                //print out the header
        System.out.println("------Cool Exponent Program------");
        System.out.println("");
        
        //print out the instructions for the user and the options
        System.out.println("Please enter your choice:");
        System.out.println("1... Square your number");
        System.out.println("2... Cube your number");
        System.out.println("3... Put your number to a desired exponent");
        System.out.println("4... Exit");
        System.out.println("Please enter your choice:");
        
        choice = keyedInput.nextInt();
        
        //These next lines will do a calculation to your selected number based on the option you chose
        if (choice == 1)
        {
            System.out.println("Please enter the number you would like to square");
            number = keyedInput.nextInt();
            
            result = number * number;
            System.out.println("Your number squared is " + result + ".");
        }
        if (choice == 2)
        {
            System.out.println("Please enter the number you would like to cube");
            number = keyedInput.nextInt();
            
            result = number * number * number;
            System.out.println("Your number cubed is " + result + ".");
        }
        if (choice == 3)
        {
            System.out.println("Please enter the number you would like your base to be");
            number = keyedInput.nextInt();
            System.out.println("Please enter the exponent you would like to raise your base to");
            exponent = keyedInput.nextInt();
            base = number;
            for (int i = 0; i < (exponent-1); i++)
            {
                number = number * base;
                result = number;
            }
            System.out.println("Your number to the exponent " + exponent + " is " + result + ".");
        }
        
       }
    }
}
