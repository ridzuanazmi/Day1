package day01;

public class Arrs {
    
    public static void main(String[] args) {
        
        // Array is Integer with square bracket
        Integer[] mat = new Integer[6];

        // Size of the array
        System.out.printf("The size of the array is %s\n",mat.length);

        // Input the numbers into the array
        mat[0] = 0;
        mat[1] = 1;
        mat[2] = 2;
        mat[3] = 2;
        mat[4] = 2;
        mat[5] = 2;

        // To print out the numbers in the array
        for (int i=0; i < mat.length; i++) {
            System.out.printf("The number in position %s is %s\n", i, mat[i]);
        }
    }
}
