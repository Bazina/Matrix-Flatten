public class Main {
    public static void main(String[] args) {
        int[] dimensions = ReadDimensions.readDimensions();
        int[] flattenMatrix1D = Flattening.flatten(dimensions[0], dimensions[1], dimensions[2], dimensions[3]);

        PrintMatrix.print(flattenMatrix1D);
    }
}
