public class PrintMatrix {
    /***
     * Prints a matrix in spiral order.
     * @param matrix the matrix to print.
     */
    public static void print(int[] matrix) {
        System.out.println("Matrix 1D: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println((i + 1) + "-th Element " + matrix[i] + " ");
        }
    }
}
