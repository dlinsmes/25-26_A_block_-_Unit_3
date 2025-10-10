public class ArrayPractice {

    public static void main(String [] args) {
        //warm up
        //int array of length 10
        //fill the array with random numbers [0,3]
        //print the whole array on one line
        //find which [0,3] number occurs the most in the array

        int [] nums = new int [10];
        for (int i = 0; i < nums.length; i++) {

            //[0,3]
            int r = (int)(Math.random() * 4);
            nums[i] = r;
        }

        //prints the memory location/address (not useful)
        System.out.println(nums);

        //need to loop through each index to print the different values
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");

        System.out.println();

        //like the die roll problem
        int [] count = new int [4];

        //loop through the 10 values to count how many 0s, 1s, 2s, 3s
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            //use value as the index in the count array
            count[value]++;

            //equivalent: count[ nums[i] ]++;
        }

        System.out.println("counts:");
        for (int i = 0; i < count.length; i++)
            System.out.print(count[i] + " ");

        System.out.println();

        //find which value is the largest in count and save its index
        int max = 0;
        int index = -1;
        for (int i = 0; i < count.length; i++) {

            if (count[i] > max) {
                max = count[i];

                //index is what random [0,3] number the count is for
                index = i;
            }
        }
        System.out.println("there are " + max + " " + index + "s");
    }

}
