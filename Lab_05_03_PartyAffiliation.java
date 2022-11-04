import java.util.Scanner;
public class Lab_05_03_PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Enter your party affiliation: ");
        input = scanner.nextLine();

        switch (input)
        {
            case "d":
            case "D":
                System.out.println("You get a Democratic Donkey.");
                break;
            case "r":
            case "R":
                System.out.println("You get a Republican Elephant.");
                break;
            case "i":
            case "I":
                System.out.println("You get an Independent Person.");
                break;
            default:
                System.out.println("You get Other.");
        }
    }
}