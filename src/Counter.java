import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        try {
            if (firstNumber >= secondNumber) {
                throw new InvalidParameterException("The second parameter must be higher than the first");
            }

            int iterations = secondNumber - firstNumber;
            for (int i = 1; i <= iterations; i++) {
                System.out.println("Printing number " + (i));
            }
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidParameterException extends Exception {
    public InvalidParameterException(String message) {
        super(message);
    }
}
