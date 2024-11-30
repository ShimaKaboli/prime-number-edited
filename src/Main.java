import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// author Pouria Ghafarbeigi


        // define the scanner
        Scanner scanner = new Scanner(System.in);

        // define the main variables
        int input;

        // define the auxiliary variables
        boolean isPrime = true;

        // set your information
        System.out.print("Enter a positive number ");
        input = scanner.nextInt();

        if (input < 2) {
            System.out.println("The" + input + " is not a Prime number.");
            return;
        }

        // check the input is Prime or not
        System.out.print("The prime numbers ");
        for (int counter = 2; counter < input; counter++) {

            // the default value for prime is always true
            isPrime = true;

            // check the counter is Prime
            for (int secondCounter = 2; secondCounter < counter; secondCounter++) {
                if ((counter % secondCounter) == 0) {
                    isPrime = false;
                    break;
                }
            }

            // check the flag is True  it means we find a Prime number and should be printed.
            if (isPrime) {
                System.out.print(counter + "is prime");
            }
        }

        // print the last result
        if (isPrime) {
            System.out.println("nThe" + input + "is a Prime number.");
        } else {
            System.out.println("nThe" + input + "is not a Prime number.");
        }
    }
}