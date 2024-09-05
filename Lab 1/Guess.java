import java.util.*;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int secretNum = random.nextInt(1,11);
        int numGuesses = 0;
        int guess = 0;

        while (guess != secretNum){
           System.out.println("Enter your guess: ");
           guess = Integer.parseInt(scan.nextLine());
           numGuesses += 1;
           if (guess < secretNum){
              System.out.println("Your guess is too low.");
           } else if (guess > secretNum){
              System.out.println("Your guess is too high.");
           } else {
              System.out.println("You got it!!");
           }
        }
        System.out.println("It took you " + numGuesses + " guesses.");
    }
}
