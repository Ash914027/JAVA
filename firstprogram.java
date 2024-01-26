import java.util.*;
public class speed {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter speed and acceleration
        System.out.print("Enter speed and acceleration: ");

        // Read speed (v) and acceleration (a)
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();

        // Calculate the minimum runway length
        double runwayLength = (speed * speed) / (2 * acceleration);

        // Display the result
        System.out.println("The minimum runway length for this airplane is " + runwayLength);

        // Close the scanner
        scanner.close();
    }

}
