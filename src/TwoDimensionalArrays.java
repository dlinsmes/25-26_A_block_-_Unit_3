public class TwoDimensionalArrays {
    public static void main(String [] args) {

        //2d array is an array made up of subarrays
        int [][] numbers = { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}};

        //to reference a value in a 2d array, you need
        //two indices - first index is for the row
        //second index is for the position within the row
        System.out.println("row 1 col 2: " + numbers[1][2]);

        //each row has an index (starts at 0)
        //within each row, there is a subindex (starts at 0)

        System.out.println("row 2 col 2: " + numbers[2][2]);

        //for this class, each subarray (row) will have the same length
        //(technically subarrays can have different lengths)

        //the length of a 2d array is the number of subarrays (rows)
        System.out.println(numbers.length);

        //to get number of columns, get the length of a subarray (row)
        //-any valid row index can work - default to 0
        System.out.println(numbers[0].length);

        //to get the total quantity of values in a 2d array,
        //multiply number of rows by number of columns
        System.out.println(numbers.length * numbers[0].length);

        //to go through every value in the 2d array,
        //use nested loops: one for controlling the row index,
        //the other for controlling the col index

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //print only the row that has 9 10 11 12
        System.out.println("row 2:");
        for (int i = 0; i < numbers[2].length; i++)
            System.out.print(numbers[2][i] + " ");

        System.out.println();
        System.out.println("column 3");
        //print the values in the col with 4, 8, 12
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][3] + " ");
        }

        System.out.println();
        System.out.println();

        //to print using a for-each loop:
        //each element of the 2d array is a 1d int array
        for (int [] row: numbers ) {
            for (int n: row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        //calculate and print each row sum

        for (int row = 0; row < numbers.length; row++) {
            //reset sum at the start of each row
            int sum = 0;
            for (int col = 0; col < numbers[0].length; col++)
                sum += numbers[row][col];
            System.out.println(sum);
        }

        System.out.println();
        //print each column sum

        for (int col = 0; col < numbers[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < numbers.length; row++)
                sum += numbers[row][col];
            System.out.println(sum);
        }

    }
}
