import java.util.Random;
import java.util.Scanner;

public class Guessing_Number
{
    public static void generateNum()
    {
        System.out.println(" ");
        Random rand = new Random();
        int randomNumber = rand.nextInt(11);
        guessNumber(randomNumber);
    }

    public static void guessNumber( int randomNumber)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Number Guessing Game");
        System.out.println("Guess the number between 0-10");

        int guess = sc.nextInt();
        System.out.println(" ");

        while (guess<0 || guess>10)
        {
            System.out.println("Guess the number between 0-10");
            guess = sc.nextInt();
            System.out.println();
        }

        int tries = 0;
        while (guess != randomNumber)
        {
            tries++;
            System.out.println("Wrong Guess");
            System.out.println("Guess Again");

            guess = sc.nextInt();
            System.out.println(" ");

            while (guess<0 || guess>10)
            {
                System.out.println("Guess the number between 1-10 : ");
                guess = sc.nextInt();
                System.out.println(" ");
            }
        }
        System.out.println("Correct Answer");
        System.out.println("Wrong Attempt : "+tries);

        System.out.println("Press 1 to Play again : ");
        System.out.println("Press 0 to exit");

        int choice = sc.nextInt();

        if(choice==1)
        {
            generateNum();
        }
        else
        {
            return;
        }
    }

    public static void main(String[] args) {
        generateNum();
    }
}
