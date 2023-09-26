package part1;

public class Main {
    public static void main(String[] args) {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = ArrayFlattener.flattenArray(inputArray);

        for (int element : flattenedArray) {
            System.out.print(element + " ");
        }
    }
}