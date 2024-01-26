import java.util.*;
public class product {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 0 and 1000
        System.out.print("Enter a number between 0 and 1000: ");

        // Read the input number
        int number = scanner.nextInt();

        // Validate if the number is within the specified range
        if (number < 0 || number > 1000) {
            System.out.println("Please enter a number between 0 and 1000.");
        } else {
            // Calculate the multiplication of all digits
            int product = multiplyDigits(number);

            // Display the result
            System.out.println("The multiplication of all digits in " + number + " is " + product);
        }


    }

    // Method to multiply all digits in a number
    private static int multiplyDigits(int num) {
        int product = 1;

        // Loop through each digit in the number
        while (num != 0) {
            // Extract the last digit using the % operator
            int digit = num % 10;

            // Multiply the digit to the running product
            product *= digit;

            // Remove the extracted digit using the / operator
            num /= 10;
        }

        return product;
    }


}
