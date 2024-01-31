package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * 
 *
 * @author Maninderjit
 * @author Maninderjit Singh Jan 31, 2024 
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        hand[0] = new Card("Hearts", 1);
        hand[1] = new Card("Spade", 10);
        hand[2] = new Card("Diamonds", 11);
        hand[3] = new Card("Club", 4);
        hand[4] = new Card("Hearts", 7);
        hand[5] = new Card("Spade", 9);
        hand[6] = new Card("Club", 3);

        System.out.println("Enter your guess");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value between 1 to 13");
        int userValue = input.nextInt();
        input.nextLine();  // Consume the newline character left by nextInt
        System.out.println("Enter your suit");
        String userSuit = input.nextLine();
        
        Card playerCard = new Card(userSuit, userValue);
        boolean isEqual = false;
        
        for (Card card : hand){
            if (card.equals(playerCard)){
                isEqual = true;
                break;
            }
        }
        
        if(isEqual){
            printInfo();
        } else {
            System.out.print("Sorry better luck next time");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        // Implement your printInfo() method logic here.
        // This method should print information about the matched card.
        System.out.println("Congratulations! You found a match!");
        System.out.println("I am Maninder Singh");
        
    }
}
