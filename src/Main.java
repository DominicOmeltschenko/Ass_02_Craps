import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
                Scanner in = new Scanner(System.in);
                Random generator = new Random();
                int dieOne;
                int dieTwo;
                int crapsRoll = 0;
                int pointNumber = 0;
                String playAgain = "";
                String trash = "";
                boolean done = false;
                do
                {

                        dieOne = new Random().nextInt(6) + 1;
                        dieTwo = new Random().nextInt(6) + 1;
                        crapsRoll = dieOne + dieTwo;

                        if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
                        {
                            System.out.println("You rolled: " + dieOne + " and " + dieTwo + " With a sum of: " + crapsRoll);
                            System.out.println("You crapped out! You lose.");
                        }
                        else if (crapsRoll == 7 || crapsRoll == 11)
                        {
                            System.out.println("You rolled: " + dieOne + " and " + dieTwo + " With a sum of: " + crapsRoll);
                            System.out.println("You got a natural! You win.");
                        }
                        else
                        {
                            pointNumber = crapsRoll;
                            System.out.println("You rolled: " + dieOne + " and " + dieTwo + " The Point is now: " + pointNumber);
                        }

                    System.out.print("Would you like to roll again? (Y/N): ");
                    playAgain = in.nextLine();
                    if (playAgain.equalsIgnoreCase("N"))
                    {
                        done = true;
                    }
                    else if (playAgain.equalsIgnoreCase("Y" ))
                    {
                        done = false;
                    }
                    else
                    {
                        trash = playAgain;
                        System.out.println("You said: " + trash);
                        System.out.print("Please say Y or N: ");
                        playAgain = in.nextLine();
                    }


                }while(!done);


    }
}