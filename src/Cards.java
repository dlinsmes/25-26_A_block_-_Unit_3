public class Cards {

    public static void main(String [] args) {
        //warm up
        //make two string arrays:
        //one that has the different suits of a deck of cards
        //one that has the different ranks of a deck of cards
        //print every combination of rank and suit efficiently

        //when you know the initial values, arrays can be initialized
        //like this:
        String [] suits = {"diamonds", "hearts", "clubs", "spades"};
        String [] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                System.out.println(ranks[j] + " of " + suits[i]);
            }
        }

        for (int i = 0; i < suits.length; i++)
            System.out.println(suits[i]);

        System.out.println();

        //enhanced for loop aka for-each loop
        //iterate through each element in the array and s will
        //temporarily hold the current value of the array
        for (String s: suits)
            System.out.println(s);

        //print every card using for-each loops
        for (String s: suits)
            for (String r: ranks)
                System.out.println(r + " of " + s);

        //use for-each loops when you want to iterate through
        //every element in sequence (without skipping) and the index
        //is not needed

        //for-each loops CANNOT be used for setting values
        for (String s: suits)
            s = "something";

        //(array values are still the same as before)
        for (String s: suits)
            System.out.println(s);

        //for loops (or while loops) can be used to change array values
        for (int i = 0; i < suits.length; i++) {
            suits[i] = "blah";
            System.out.println(suits[i]);
        }

        //this form of setting array values only works when you're
        //declaring it
        //suits = {"fads", "fdsaf"}
        suits[0] = "diamonds";
        suits[1] = "hearts";
        suits[2] = "spades";
        suits[3] = "clubs";

        //swap two of the values - suits[0] and suits[3]
        String temp = suits[0];
        suits[0] = suits[3];
        suits[3] = temp;

        for (String s: suits)
            System.out.println(s);

        int [] silly = new int [52];
        //values will default to 0

        //assign values (not indices) of 0-51 for each
        // element of the array
        for (int i = 0; i < silly.length; i++) {
            silly[i] = i;

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
            int suitI = silly[i] / 13;

            //rank indices [0, 12] - mod 13 to get the remainder after division, which
            //increments by one for every  value
            int rankI = silly[i] % 13;

            System.out.println(silly[i] + " - "+ ranks[rankI] + " of " + suits[suitI]);
        }


        //shuffle the deck so that each element still exists but in some randomized order
        //loop - swap elements in the array using at least one randomized index

        for (int i = 0; i < 100; i++) {
            //indexing of the array is [0, length)
            int rIndex1 = (int)(Math.random() * silly.length);
            int rIndex2 = (int)(Math.random() * silly.length);

            //swap the values at the two random indices
            int t = silly[rIndex1];
            silly[rIndex1] = silly[rIndex2];
            silly[rIndex2] = t;
        }

        System.out.println();

        //print the shuffled deck using a for-each loop
        for (int s: silly) {
            int rankI = s % 13;
            int suitI = s / 13 ;
            System.out.println( s + " - " + ranks[rankI] + " of " + suits[suitI]);
        }
    }
}
