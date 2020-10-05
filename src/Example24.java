import java.util.Scanner;
public class Example24 {
    public static void main (String[] argv) {

        int number;
        int i = 1;
        double factorial = 1;

        System.out.println ("Please, enter a number");

        Scanner inputValue;
        inputValue = new Scanner (System.in);

        number = inputValue.nextInt();

        while (i <= number) {
            factorial = factorial * i;
            i = i + 1;
        }

        // I don't know why but sometimes the product comes out negative, so that I added this "if" instruction:

        if (factorial < 0) {
            factorial = factorial * -1;
        }
        System.out.println ("The factorial of your number is " + factorial);
    }
}
