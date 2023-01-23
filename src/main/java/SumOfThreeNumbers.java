
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Proomt the user for three numbers and store them in variables
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());
        // Calculate the sum of the three numbers
        int sum = firstNumber + secondNumber + thirdNumber;
        // Output the sum of the three numbers
        System.out.println("The sum of the numbers is " + sum);
    }
}
