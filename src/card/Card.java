package card;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Values from 1 to 13
            c.setSuit(Card.SUITS[random.nextInt(Card.SUITS.length)]); // Suits from the SUITS array
            magicHand[i] = c; // Add card to magic hand
        }
        
        // Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2); // Value is 2
        luckyCard.setSuit("Clubs"); // Suit is clubs
        
        // Ask the user for a card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a card value (1-13 where Ace=1, Jack=11, Queen=12, King=13):");
        int value = scanner.nextInt();
        System.out.println("Enter a suit (Hearts, Diamonds, Spades, Clubs):");
        String suit = scanner.next();
        
        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        // Search for the user's card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
        
        // Check if the user's card matches the lucky card
        if (userCard.getValue() == luckyCard.getValue() && userCard.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
            System.out.println("You picked the lucky card!");
        }
        
        // Close the scanner
        scanner.close();
    }
}
