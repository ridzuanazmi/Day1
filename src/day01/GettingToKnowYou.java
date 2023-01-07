package day01;

// Using the class 
import java.io.Console;

public class GettingToKnowYou {
    
    // ENTRY POINT
    public static void main(String[] args) {
        
        // Read from command line
        // Get the console. Something simialr to a scanner
        Console cons = System.console();
        
        // Prompts the user for name
        String name = cons.readLine("What is your name? ");

        // Prompts user for another name
        String name2 = cons.readLine("What is your nickname? ");
        
        // Prompts the user for email
        String email = cons.readLine("What is youre email? ");

        // Check if the email length is sufficient
        if (email.length() > 0) {

            // Print email and name
            System.out.printf("Your name is %s. Your email is %s", name, email);

        } else {

            // Print name only
            System.out.printf("Your name is %s", name);

        }

        // Check is name and nickname is the same. If yes, prints out Yabadabadoo!
        if (name.equals(name2)) {
            
            System.out.printf("\nYabadabadoo!");

        }

    }
    
}
