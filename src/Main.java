public class Main
{
    public static void main(String[] args)
    {
        double itemPrice = 150.00;
        double freeShip = 100.00;
        double tax = .02;
        double wTax = itemPrice * tax;
        double totalPrice = itemPrice + wTax;

        if (itemPrice < freeShip)
        {
            System.out.println("Sorry, you don't get free shipping.");
            System.out.println("The cost of your item is "+itemPrice+" and with a tax of 2%, it's "+totalPrice);
        }
        else
        {
            System.out.println("You get free shipping!");
        }
            

    }
}