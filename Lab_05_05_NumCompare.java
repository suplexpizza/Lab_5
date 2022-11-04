import java.util.Scanner;

public class Lab_05_05_NumCompare
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");

        int num2 = in.nextInt();

        System.out.println("");

        if (num1 == num2)

            System.out.println(num1 + " == " + num2);

        else if (num1 < num2)

            System.out.println(num1 + " < " + num2);

        else if (num1 > num2)

            System.out.println(num1 + " > " + num2);
        else
        {
            System.out.println("You didn't enter a number. Try again.");
        }
    }
}


