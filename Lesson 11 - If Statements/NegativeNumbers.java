import java.util.Scanner;
public class NegativeNumbers
{
    // This program reads a number from the
    // user and prints if it is negative.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt("Number: ");
        if (number < 0)
        {
            System.out.println("Number is negative");
        }
    }
}
