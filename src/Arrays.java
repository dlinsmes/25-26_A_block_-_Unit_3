public class Arrays {
    public static void main(String [] args) {
        String word = "zach";

        //a string's length is its amount of characters
        System.out.println(word.length());

        //substring provides the part of the string starting
        //at the provided index (position)
        //-indexing starts at 0
        System.out.println(word.substring(1));

        //another form of substring() accepts two indices
        //-first index is inclusive
        //-second index is exclusive
        //this will include characters 0 and 1, but not 2
        System.out.println(word.substring(0, 2));

        //isolate the "h" in zach
        System.out.println(word.substring(3, 4));

        //for "z" use substring(0,1)
        //for any single letter, use consecutive indices

        //use a for loop to output each letter of word
        //on its own line
        System.out.println();

        //use word.length() instead of 4 so that this works
        //for any string
        for (int i = 0; i < word.length(); i++)
            //i and i+1 will always get consecutive numbers
            System.out.println(word.substring(i, i + 1));

        System.out.println();

        //spell out the word backwards one letter at a time
        for (int i = word.length() - 1; i >= 0; i--)
            System.out.println(word.substring(i, i + 1));

        //arrays - hold multiple values to a single
        //variable name (like lists)
        //-different from lists, the length is set
        //and you cannot add or remove elements dynamically

        //string array
        //declare a string array called words with a
        //length of 5;
        String[] words = new String[5];

        //to set or access individual elements into an array,
        //need to specify the index
        words[0] = "mr lin";
        words[1] = "jay";
        words[2] = "allan";
        words[3] = "apple";
        words[4] = "banana";
        //the last valid index is always the length - 1

        //out of bounds index
        //words[5] = "fadsfdas";

        //if you print the array, the output is the
        //memory location (not useful)
        System.out.println(words);

        //to access specific elements, need to specify the index
        System.out.println(words[3]);

        System.out.println();
        //print whole array

        //an array's length is accessed with .length (no parentheses)
        for (int i = 0; i < words.length; i++)

            //use i as the index for the array
            System.out.println(words[i]);


        //million die roll problem
        //-need 6 if statements and 6 variables
        //do the same problem with no if statements and one array

        //save 6 different results - int data type
        int [] results = new int[6];

        //when you initialize an array,
        // -for ints all values will default to 0
        //-doubles will default to 0.0
        //booleans default to false
        //Strings default null
        for (int i = 0; i < results.length; i++)
            System.out.println(results[i]);

        for (int i = 0; i < 1000000; i++) {
            //generate [0,5] (still 6 different values)
            int roll = (int)(Math.random() * 6);

            //use the roll as the index number
            results[roll]++;
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i] + " " + (i+1) + "s");
        }

    }
}
