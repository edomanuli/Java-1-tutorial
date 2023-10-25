import java.util.Random;
import java.util.Scanner;

/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);

    // User's name
    System.out.println("Enter your name:");
    String name = input.nextLine();
    System.out.println(name +", " + "I'm thinking of a number between 0 and 100.");

    Random randNum = new Random();
    int number = randNum.nextInt(101);


    int count = 0;

    while (true) {
      System.out.println("Enter your guess:");
      int guess = input.nextInt();
      count++;

      if (guess == number) {
        System.out.println("Well done, " + name + "! You found my number in " + count + " tries!");
        break;
      } else if (guess < number) {
        System.out.println("Your guess is too low, try again.");
      } else {
        System.out.println("Your guess is too high, try again.");
      }
    }
  }
}
