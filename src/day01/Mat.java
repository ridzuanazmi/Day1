package day01;

public class Mat {
    
    public static void main(String[] args) {
        
        // Matrix is defined by [row][column] as below
        Integer[][] mat = new Integer [5][3];

        // Print out the number of rows and columns in the matrix. Take note on the columns
        System.out.printf("Rows: %d\n", mat.length);
        System.out.printf("Columns: %d\n", mat[0].length);

        // Add value 10 into the matrix at position 0,0 and print out the value
        mat[0][0] = 10;
        System.out.printf("Value at 0,0 is %d\n", mat[0][0]);
    }

}
