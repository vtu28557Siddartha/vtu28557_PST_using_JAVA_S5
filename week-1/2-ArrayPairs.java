import java.util.stream.IntStream;

public class ArrayPairs {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println("Array Pairs:");

        IntStream.range(0, arr.length)
                .forEach(i ->
                    IntStream.range(i + 1, arr.length)
                            .forEach(j ->
                                System.out.println("(" + arr[i] + ", " + arr[j] + ")")
                            )
                );
    }
}