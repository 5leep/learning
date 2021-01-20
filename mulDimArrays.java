import java.util.Arrays;

public class mulDimArrays {

    public static void main(String[] args) {
        // [] = 1 dimensional array [][] = 2 dimensional array, etc. \\
        // [2][3] = 2 columns, 3 rows. \\
        int[][] number = { { 1, 2, 3 }, { 4, 5, 6 } };
        number[0][0] = 1;
        System.out.println(Arrays.deepToString(number));
    }
}