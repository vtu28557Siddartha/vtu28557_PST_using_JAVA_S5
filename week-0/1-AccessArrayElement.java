import java.util.Optional;
import java.util.stream.IntStream;
import java.util.Scanner;

public class AccessArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        Optional<Integer> element = IntStream.range(0, arr.length)
                .filter(i -> i == index)
                .map(i -> arr[i])
                .boxed()
                .findFirst();

        if (element.isPresent()) {
            System.out.println("Element at index " + index + " is: " + element.get());
        } else {
            System.out.println("Invalid Index");
        }

        sc.close();
    }
}