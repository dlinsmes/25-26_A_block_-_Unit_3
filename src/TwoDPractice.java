public class TwoDPractice {
    public static void main(String [] args) {
        //declare 2d array without setting values
        //10 rows, 20 cols
        int [][] nums = new int [10][20];

        //warm up
        //1 - fill nums with all values of 10
        //2 - 20 times - generate random indices,
        // place a random number [11,99] at that position
        //3 - print nums in grid format
        //4 - find the row and col coordinate of the largest value in nums

        //1
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = 10;
            }
        }

        //2
        for (int i = 0; i < 20; i++) {
            //generate random indices - row and col
            //nums.length is 10
            int row = (int)(Math.random() * nums.length);
            //nums[0].length is 20
            int col = (int)(Math.random() * nums[0].length);

            //[11,99]
            int val = (int)(Math.random() * (99-11+1) + 11);
            nums[row][col] = val;
        }

        //3
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //4 - find the row and col index where the biggest number is
        int rBig = 0;
        int cBig = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] > nums[rBig][cBig]) {
                    rBig = i;
                    cBig = j;
                }
            }
        }

        System.out.println("biggest value is " + nums[rBig][cBig] + " at row " + rBig + " col " + cBig);
    }
}
