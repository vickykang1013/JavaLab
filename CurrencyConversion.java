import java.util.Scanner;

/**
 * @author Vicky Kang
 * @since 03 October 2025
 */

public class CurrencyConversion {

    static final double CURRENCY_RATIO = 1400.00;

    public static double USD2KRW(double amount) {
        return amount * CURRENCY_RATIO;
    }

    public static double KRW2USD(double amount) {
        return amount / CURRENCY_RATIO;
    }

    public static int menu(Scanner input) {
        int option;

        System.out.println("Choose the option you want to convert");
        System.out.println("1. US Dollars to Korean Won");
        System.out.println("2. Korean Won to US Dollars");
        System.out.println("3. Quit");
        System.out.println("Enter the option: ");
        option = input.nextInt();
        return option;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 0;

        do {
            option = menu(input);
        
            if (option == 3) {
                System.out.println("Goodbye!");
                break;
            }
       
            System.out.println("Enter the amount you want to convert: ");
            double amount = input.nextDouble();

            switch (option) {
                case 1:
                    System.out.printf("Converted amount: %.2f Won\n", USD2KRW(amount));
                    break;
                case 2:
                    System.out.printf("Converted amount: %.2f Dollar\n", KRW2USD(amount));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while(true);
    }
}