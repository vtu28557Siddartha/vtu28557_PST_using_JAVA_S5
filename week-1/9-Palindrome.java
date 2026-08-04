import java.util.Scanner;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = str.chars()
                            .mapToObj(c -> String.valueOf((char) c))
                            .collect(Collectors.collectingAndThen(
                                    Collectors.toList(),
                                    list -> {
                                        java.util.Collections.reverse(list);
                                        return String.join("", list);
                                    }));

        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}