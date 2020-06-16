package matrix;

public class RotationMatrix {
    public static void reverse_rows(int mat[][])
    {
        int k;
        for (int i = 0; i < mat.length; i++)
        {
            k = mat.length-1;
            for (int j = 0; j < k; j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
                k--;
            }}}

    public static void print_matrix(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }}

    public static void transpose_matrix(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i;j<mat.length;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }}}
}
