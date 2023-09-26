package part2;

public class Main {
    public static void main(String[] args) {
        ArrayResolver arrayResolver = new ArrayResolver();
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] resultArray = arrayResolver.reverseArray(inputArray);

        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }
}
