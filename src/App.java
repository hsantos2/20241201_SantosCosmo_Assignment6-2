
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        //Calculate sum of all digits in numbers
        System.out.print("The sum of the digits in " + number + " is " +
			sumDigits(number));

    }

    public static long sumDigits(long n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
    }
}
