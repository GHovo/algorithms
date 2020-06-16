package matrix;

import static matrix.RotationMatrix.*;

public class mainMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The matrix before rotation ");
        print_matrix(mat);
        System.out.println("Transpose of the matrix ");
        transpose_matrix(mat);
        System.out.println("The matrix after rotation ");
        reverse_rows(mat);
        print_matrix(mat);
    }
}
