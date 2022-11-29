import java.util.Scanner;
public class CheckOut
{



        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);

            Double itemPrice = safeinput.getRangedDouble(in, "Enter the price of your item", 0.50, 9.99);
            Boolean YN = safeinput.getYNConfirm(in, "Do you have more items ");

            System.out.printf("Your total price is " + itemPrice);
        }
    }

