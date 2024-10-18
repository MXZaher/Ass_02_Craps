import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        int diceRoll1;
        int diceRoll2;
        int point;
        boolean done = false;
        boolean fullydone = false;
        boolean validinput = false;
        String choice;
        do {
            Random rnd = new Random();
            diceRoll1 = rnd.nextInt(6) + 1;
            diceRoll2 = rnd.nextInt(6) + 1;
            System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2);
            switch (diceRoll1 + diceRoll2) {
                case 2, 3, 12:
                    System.out.println("Craps! You lost!");
                    do {
                        System.out.print("Would you like to play again? (Y/N): ");
                        Scanner in = new Scanner(System.in);
                        choice = in.next();
                        switch (choice.toUpperCase()) {
                            case "Y":
                                validinput = true;
                                done = true;
                                break;
                            case "N":
                                validinput = true;
                                done = true;
                                fullydone = true;
                                break;
                            default:
                                System.out.println("Please enter a valid input");
                        }
                    } while (!validinput);
                    validinput = false;
                    break;
                case 7, 11:
                    System.out.println("Natural! You win!");
                    do {
                        System.out.print("Would you like to play again? (Y/N): ");
                        Scanner in = new Scanner(System.in);
                        choice = in.next();
                        switch (choice.toUpperCase()) {
                            case "Y":
                                validinput = true;
                                done = true;
                                break;
                            case "N":
                                validinput = true;
                                done = true;
                                fullydone = true;
                                break;
                            default:
                                System.out.println("Please enter a valid input");
                        }
                    } while (!validinput);
                    validinput = false;
                    break;
                default:
                    point = diceRoll1 + diceRoll2;
                    System.out.println("The point is " + (diceRoll1 + diceRoll2));
                    do {
                        diceRoll1 = rnd.nextInt(6) + 1;
                        diceRoll2 = rnd.nextInt(6) + 1;
                        System.out.println("You rolled a " + diceRoll1 + " and a " + diceRoll2);
                        if ((diceRoll1 + diceRoll2) == point) {
                            System.out.println("You hit the point! You win!");
                            do {
                                System.out.print("Would you like to play again? (Y/N): ");
                                Scanner in = new Scanner(System.in);
                                choice = in.next();
                                switch (choice.toUpperCase()) {
                                    case "Y":
                                        validinput = true;
                                        done = true;
                                        break;
                                    case "N":
                                        validinput = true;
                                        done = true;
                                        fullydone = true;
                                        break;
                                    default:
                                        System.out.println("Please enter a valid input");
                                }
                            } while (!validinput);
                        } else if ((diceRoll1 + diceRoll2) == 7) {
                            System.out.println("You rolled a 7! You lose!");
                            do {
                                System.out.print("Would you like to play again? (Y/N): ");
                                Scanner in = new Scanner(System.in);
                                choice = in.next();
                                switch (choice.toUpperCase()) {
                                    case "Y":
                                        validinput = true;
                                        done = true;
                                        break;
                                    case "N":
                                        validinput = true;
                                        done = true;
                                        fullydone = true;
                                        break;
                                    default:
                                        System.out.println("Please enter a valid input");
                                }
                            } while (!validinput);
                        }
                    }while(!done);
                break;
            }
        }while(!fullydone);
    }
}