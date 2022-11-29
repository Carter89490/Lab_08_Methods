import java.util.Scanner;
public class method
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        sayHello();

        sayHello(13);

        sayMsg("Damn Carter!", 35);

        int favNum =7;

        int doubledInt = doubleIt(favNum);

            System.out.println("Doubled is: " + doubledInt);

            int favorite_number = getRangedInt(in, "enter your favorite number",1,100);

    }

    public static void sayHello()
    {
        System.out.println("Hello");
    }

    public static void sayHello(int times)
    {
        for(int i = 0; i <= times; i++)
            System.out.println("Hello!");
    }

    public static void sayMsg(String Msg, int times)
    {
        for(int i = 0; i <= times; i++)
            System.out.println(Msg);
    }

    public static int doubleIt(int num)
    {
        int retVal = 0;

        retVal = num * 2;

        return retVal;

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high )
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.println(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said your ret val is " + retVal);
                    done = true;
                } else {
                    System.out.println("you said your ret val is " + retVal + " but that is out of range [" + low + " - " + high + "]: ");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("you must enter an intager not " + trash);
            }
        }while(!done);

        return retVal;







    }



}
