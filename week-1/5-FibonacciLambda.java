import java.util.function.Supplier;
import java.util.stream.Stream;

public class FibonacciLambda {

    public static void main(String[] args) {

        int n = 10;

        Supplier<int[]> fibonacci = new Supplier<int[]>() {
            int[] series = {0, 1};

            @Override
            public int[] get() {
                int[] result = {series[0], series[1]};
                int next = series[0] + series[1];
                series[0] = series[1];
                series[1] = next;
                return result;
            }
        };

        Stream.generate(fibonacci)
                .limit(n)
                .map(a -> a[0])
                .forEach(System.out::println);
    }
}