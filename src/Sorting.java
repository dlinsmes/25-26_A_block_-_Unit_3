public class Sorting {

    public static void main(String [] args) {
        //set up an int array of length 10
        // and fill it with random numbers [0, 100]

        int [] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
            nums[i] = (int)(Math.random() * 100 + 1);

        for (int n: nums)
            System.out.print(n + " ");
        System.out.println();

        //with a group, find a way to sort the numbers
        //in the array in least to greatest order
        //rules: can't look up sorting algs, can't make
        //another array

        //10 2 5 9 4

        //insertion sort
        //move from left to right (for loop)
        //assume that to the left of whatever position
        //you're on, the numbers are already in sorted order
        //save the value of the position you're on
        //check to the left of that position:
        //if the number to the left is greater than the value saved
        //move it to the right by one position
        //continue until the number to the left is no longer
        //greater than the saved value
        // 2 10 5 9 4
        // 2 5 10 9 4
        // 2 5 9 10 4
        // 2 4 5 9 10

        for (int i = 0; i < nums.length; i++) {
            int holdValue = nums[i];

            //look to the left of i
            int j = i-1;
            while (j >= 0 && nums[j] > holdValue) {
                //move value at j to the right by 1
                nums[j+1] = nums[j];
                j--;
            }
            //at this point there should be an open position
            //at j+1 where the hold value can be placed
            nums[j+1] = holdValue;

            for (int n: nums)
                System.out.print(n + " ");
            System.out.println();
        }

        for (int n: nums)
            System.out.print(n + " ");


        System.out.println();
        System.out.println();

        //re-randomize
        for (int i = 0; i < nums.length; i++)
            nums[i] = (int)(Math.random() * 100 + 1);

        for (int n: nums)
            System.out.print(n + " ");
        System.out.println();

        //selection sort
        //- find the smallest number to the right of the |
        // swap it into the position left of the |
        //| moves to the right by one position
        //10 2 5 9 4
        // 10 | 2 5 9 4

        for (int i = 0 ; i < nums.length; i++) {
            int smallIndex = i;

            //look to the right of i check whether there's
            //a smaller value, and save its index
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[smallIndex])
                    smallIndex = j;
            }


            //swap the values at i and smallestI
            int temp = nums[i];
            nums[i] = nums[smallIndex];
            nums[smallIndex] = temp;


            for (int n: nums)
                System.out.print(n + " ");
            System.out.println();
        }

        for (int n: nums)
            System.out.print(n + " ");
        System.out.println();
    }
}
