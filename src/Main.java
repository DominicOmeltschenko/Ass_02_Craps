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
                boolean stillRolling = false;
                do
                {



                        dieOne = new Random().nextInt(6) + 1;
                        dieTwo = new Random().nextInt(6) + 1;
                        crapsRoll = dieOne + dieTwo;

                        if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
                        {
                            System.out.println("You rolled: " + dieOne + " and " + dieTwo + " With a sum of: " + crapsRoll);
                            System.out.println("You crapped out! You lose.");
                            stillRolling = false;
                        }
                        else if (crapsRoll == 7 || crapsRoll == 11)
                        {
                            System.out.println("You rolled: " + dieOne + " and " + dieTwo + " With a sum of: " + crapsRoll);
                            System.out.println("You got a natural! You win.");
                            stillRolling = false;
                        }
                        else
                        {
                            pointNumber = crapsRoll;
                            System.out.println("You rolled: " + dieOne + " and " + dieTwo + " The Point is now: " + pointNumber);
                            System.out.print("Roll again (hit enter to continue)");
                            playAgain = in.nextLine();
                            do {
                            if (playAgain.equalsIgnoreCase("" ))
                            {


                                dieOne = new Random().nextInt(6) + 1;
                                dieTwo = new Random().nextInt(6) + 1;
                                crapsRoll = dieOne + dieTwo;

                                if (crapsRoll == 7)
                                {
                                    System.out.println("You rolled a 7. You Lose!");
                                    stillRolling = false;
                                }
                                else if (crapsRoll == pointNumber)
                                {
                                    System.out.println("You rolled: " + dieOne + " and " + dieTwo + " With a sum of: " + crapsRoll + "." + " You rolled the point! You Win!");
                                    stillRolling = false;
                                }
                                else
                                {
                                    stillRolling = true;
                                    System.out.println("You rolled: " + dieOne + " and " + dieTwo + " With a sum of: " + crapsRoll);
                                    System.out.print("You didn't roll the point. Roll again (hit enter to continue)");
                                    playAgain = in.nextLine();
                                }


                            }
                            else
                            {
                                trash = playAgain;
                                System.out.println("You said: " + trash);
                                System.out.print("Please hit enter");
                                playAgain = in.nextLine();
                                stillRolling = true;
                            }
                            }while (stillRolling);
                        }


                    System.out.print("Would you like to play again? (Y/N): ");
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