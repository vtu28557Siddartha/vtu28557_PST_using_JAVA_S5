import java.util.Arrays;

public class LastDigits {
    public static void main(String[] args) {

        int[] numbers = {123, 456, 789, 1024, 555};

        Arrays.stream(numbers)
              .map(n -> n % 10)
              .forEach(System.out::println);
    }
}