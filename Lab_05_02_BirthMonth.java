public class Lab_05_02_BirthMonth {

    public static void main(String[] args)
    {
        int birthMonth = 3;

        if(birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.println("Invalid Input, please enter a number 1 though 12.");
        }
    }
}
