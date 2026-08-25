import java.util.Arrays;

public class MaxElementFinder {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 56};

        int max = Arrays.stream(arr)
                        .max()
                        .getAsInt();

        System.out.println("Maximum Element: " + max);
    }
}