import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int target = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < number.length - 1; i++) {
            int firstNumber = number[i];
            for (int j = i + 1; j < number.length; j++) {
                int secondNumber = number[j];
                if (firstNumber + secondNumber == target) {
                    System.out.printf("%d %d%n", firstNumber, secondNumber);
                }
            }
        }
    }
}
