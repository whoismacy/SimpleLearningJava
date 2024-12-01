import java.util.Scanner;
import static java.lang.System.exit;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args)
    {
        System.out.println("\n\t\t*****Welcome to the Number Guessing Game!*****\n");
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int min=1, max=1000;
            int user_input0, user_input1 = 0;
            System.out.println("I'm thinking of a number between 1 and 1000.");
            System.out.println("Choose your difficulty level:\n1. Easy (30 chances)\n2. Medium (20 chances)\n3. Hard (10 chances)\n4. Exit :(");
            System.out.println("\nEnter your choice:");
            user_input0 = scanner.nextInt();
            int rand_guess = random.nextInt(max - min + 1 ) + min;

            if(user_input0 == 1)
            {
                System.out.println("Wonderful! You have selected the Easy difficulty level.\nYou have 30 chances to guess the number. Let the game begin.\n");
                for(int i = 1; i <= 30; i++)
                {
                    System.out.println("Input your guess number: ");
                    user_input1 = scanner.nextInt();

                    if(user_input1 == rand_guess)
                    {
                        System.out.println("Correct!!! match found in " + i + " attempts.");
                        break;
                    }
                    else{
                        System.out.println(user_input1 + " is not the correct number.\n");
                    }
                }
                if(user_input1 != rand_guess)
                {
                    System.out.println("The guess number was " + rand_guess + ", Better luck next time.");
                }

            }
            else if(user_input0 == 2)
            {
                System.out.println("Great! You have selected the Medium difficulty level.\nYou have 20 chances to guess the number. Let the game begin.\n");
                for(int i = 1; i <= 20; i++)
                {
                    System.out.println("Input your guess number: ");
                    user_input1 = scanner.nextInt();

                    if(user_input1 == rand_guess)
                    {
                        System.out.println("Correct!!! match found in " + i + " attempts.");
                        break;
                    }
                    else
                    {
                        System.out.println(user_input1 + " is not the correct number.\n");
                    }
                }
                if(user_input1 != rand_guess)
                {
                    System.out.println("The guess number was " + rand_guess + ", Better luck next time.");
                }
            }
            else if(user_input0 == 3)
            {
                System.out.println("Nice! You have selected the Hard difficulty level.\nYou have 10 chances to guess the number. Let the game begin.\n");
                for(int i = 1; i <= 10; i++)
                {
                    System.out.println("Input your guess number: ");
                    user_input1 = scanner.nextInt();

                    if(user_input1 == rand_guess)
                    {
                        System.out.println("Correct!!! match found in " + i + " attempts.");
                        break;
                    }
                    else
                    {
                        System.out.println(user_input1 + " is not the correct number.\n");
                    }
                }
                if(user_input1 != rand_guess)
                {
                    System.out.println("The guess number was " + rand_guess + ", Better luck next time.\n");
                }
            }
            else if(user_input0 == 4)
            {
                String user_Strchoice;
                scanner.nextLine();
                System.out.println("Are you sure you want to exit ? (yes / no) :");
                user_Strchoice = scanner.nextLine();
                if(user_Strchoice.equalsIgnoreCase("yes") && !user_Strchoice.isEmpty())
                {
                    System.out.println("Thank you for playing Number Guessing Game.");
                }
                else
                {
                    continue;
                }
                exit(0);
            }
            else
            {
                System.out.println("Invalid input.\n");
            }
        }
    }
}

