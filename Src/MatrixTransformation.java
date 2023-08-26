import java.util.Arrays;
import java.util.Random;

public class MatrixTransformation {
    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(10) + 2;
        int n = random.nextInt(10) + 2;
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[n][m];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix2[j][i] = matrix1[i][j];
            }

        }
        for (int i = 0; i < matrix2.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }
    }
}
