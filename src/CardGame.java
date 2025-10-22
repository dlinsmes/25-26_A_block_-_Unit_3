import java.util.Scanner;

public class CardGame {
    public static void main(String [] args) {
        String [] suits = {"diamonds", "hearts", "clubs", "spades"};
        String [] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

        int [] deck = new int [52];
        //values will default to 0

        //assign values (not indices) of 0-51 for each
        // element of the array
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;

            //come up with how to assign each different combination
            // to the [0, 51] values
            //0 - Ace of clubs
            //1 - 2 of clubs
            //...
            //12 - king of clubs
            //13 - ace of hearts
            //26 - ace of spades
            //39 - ace of diamonds
            //51 - king of diamonds

            //(no for loops necessary)

            //suit indices [0, 3] - use int div by 13 to result in [0, 3]
            int suitI = deck[i] / 13;

            //rank indices [0, 12] - mod 13 to get the remainder after division, which
            //increments by one for every  value
            int rankI = deck[i] % 13;

            System.out.println(deck[i] + " - "+ ranks[rankI] + " of " + suits[suitI]);
        }


        //shuffle the deck so that each element still exists but in some randomized order
        //loop - swap elements in the array using at least one randomized index

        for (int i = 0; i < 100; i++) {
            //indexing of the array is [0, length)
            int rIndex1 = (int)(Math.random() * deck.length);
            int rIndex2 = (int)(Math.random() * deck.length);

            //swap the values at the two random indices
            int t = deck[rIndex1];
            deck[rIndex1] = deck[rIndex2];
            deck[rIndex2] = t;
        }

        System.out.println();

        //print the shuffled deck using a for-each loop
        for (int s: deck) {
            int rankI = s % 13;
            int suitI = s / 13;
            System.out.println( s + " - " + ranks[rankI] + " of " + suits[suitI]);
        }

        //game:
        //player has a hand of cards drawn from the deck
        //-choose a card to throw out and replace with a new
        //card drawn from the deck
        //-continues until they have 4 of a kind of the same rank
        //in the hand

        int handSize = 7;
        int [] hand = new int[handSize];

        //fill the hand with the initial drawn cards

        //every time you draw from the deck, use the top
        //as the index, then increment top so that it will be
        //the index of the next card
        //top should stay less than 52 to be valid
        int top = 0;

        for (int i = 0; i < handSize; i++) {
            hand[i] = deck[top];
            top++;
        }
        System.out.println();

        System.out.println("your hand:");
        for (int i = 0; i < handSize; i++) {
            int rankI = hand[i] % 13;
            int suitI = hand[i] / 13;
            System.out.println(i + " - " + ranks[rankI] + " of " + suits[suitI]);
        }

        //loop - continue until there's 4 of a kind
        boolean fourOfKind = false;
        Scanner s = new Scanner(System.in);
        while (!fourOfKind && top < 52) {
            //pick which card to throw out
            System.out.println("enter the index of the card to throw out");
            int i = s.nextInt();
            while (i < 0 || i >= handSize) {
                System.out.println("invalid index");
                System.out.println("enter the index of the card to throw out");
                i = s.nextInt();
            }

            //draw a new card to replace it with
            hand[i] = deck[top];
            top++;

            for (int j = 0; j < handSize; j++) {
                int rankI = hand[j] % 13;
                int suitI = hand[j] / 13;
                System.out.println(j + " - " + ranks[rankI] + " of " + suits[suitI]);
            }

            //check for four of a kind

        }

    }
}
