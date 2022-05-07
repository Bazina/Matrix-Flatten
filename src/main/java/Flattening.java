import java.util.Scanner;

public class Flattening {
    private static final Scanner sc = new Scanner(System.in);

    /***
     * Flattens a 3D matrix into a 1D matrix.
     * @param n the first dimension of the matrix.
     * @param m the second dimension of the matrix.
     * @param p the third dimension of the matrix.
     * @param q the dimension of the flattened matrix.
     * @return the flattened matrix.
     */
    public static int[] flatten(int n, int m, int p, int q) {
        int y = 0;
        int[] flattenMatrix1D = new int[q];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < p; k++) {
                    System.out.print("Enter Element (" + (i + 1) + ", " + (j + 1) + ", " + (k + 1) + "): ");
                    flattenMatrix1D[y++] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }

        return flattenMatrix1D;
    }
}
