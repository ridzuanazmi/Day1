package day01;

import java.io.Console;
import java.security.SecureRandom;
import java.util.Random;

public class GuessNumber {
    
    //ENTRY POINT
    public static void main(String[] args) {
        
        // Create a random number generator
        Random rand = new SecureRandom();

        // Get the console to read the lines
        Console cons = System.console();

        // Generate a number between 1 and 10
        int ToGuess = rand.nextInt(10) +1;

        // Main Loop
        // Set i as number of tries and set a condition to decrese i by 1 and i must not be 0
        for (int i = 3; i != 0 ; i--) {
            
            // Ask user to input a number (integer)
            String input = cons.readLine("\nWhat is your guess (%s tries) ",i);
            Integer num = Integer.parseInt(input);

            // To compare the number the user input with the random number generated
            if (num == ToGuess) {
                System.out.printf("Correct. You win!");
                break;
            } else if (num < ToGuess){
                System.out.printf("Higher");
            } else if (num > ToGuess) {
                System.out.printf("Lower");
            }
            
            // if number of tries is 0, we lose
            if (i == 1) {
                System.out.printf("\nThe number is %s. You lose!", ToGuess);
            }

        } 

        
        
    }
}
