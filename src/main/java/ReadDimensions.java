import java.util.Scanner;

public class ReadDimensions {
    private static final Scanner sc = new Scanner(System.in);

    /***
     * Reads the dimensions of a 3D matrix from the user.
     * @return the dimensions of the 3D matrix and the size of the flattened one.
     */
    public static int[] readDimensions() {
        int[] dimensions = new int[4];

        System.out.print("Enter First Dimension Size: ");
        dimensions[0] = sc.nextInt();

        System.out.print("Enter Second Dimension Size: ");
        dimensions[1] = sc.nextInt();

        System.out.print("Enter Third Dimension Size: ");
        dimensions[2] = sc.nextInt();

        dimensions[3] = dimensions[0] * dimensions[1] * dimensions[2];

        return dimensions;
    }
}
