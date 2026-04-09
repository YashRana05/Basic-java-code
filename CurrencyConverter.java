
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the currency to convert from (USD, JPY, AUD, EUR, INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency to convert to (USD, JPY, AUD, EUR, INR): ");
        String toCurrency = scanner.next().toUpperCase();

        double conversionRate = 0;

        switch (fromCurrency) {
            case "USD":
                switch (toCurrency) {
                    case "EUR": conversionRate = 1.14;
                    break;
                    case "INR": conversionRate = 82.75;
                    break;
                    case "JPY": conversionRate = 114.37;
                    break;
                    case "AUD": conversionRate = 0.65;
                    break;
                    case "USD": conversionRate = 1;
                    break;
                    default: System.out.println("Invalid target currency."); 
                    return;
                }
                break;
                case "JPY":
                switch (toCurrency) {
                    case "EUR": conversionRate = 0.0062;
                    break;
                    case "INR": conversionRate = 0.53;
                    break;
                    case "USD": conversionRate = 0.0069;
                    break;
                    case "AUD": conversionRate = 0.01;
                    break;
                    case "JPY": conversionRate = 1;
                    break;
                    default: System.out.println("Invalid target currency."); 
                    return;
                }
                break;
                 case "AUD":
                switch (toCurrency) {
                    case "EUR": conversionRate = 0.56;
                    break;
                    case "INR": conversionRate = 56.23;
                    break;
                    case "USD": conversionRate = 0.64;
                    break;
                    case "JPY": conversionRate = 94.42;
                    break;
                    case "AUD": conversionRate = 1;
                    break;
                    default: System.out.println("Invalid target currency."); 
                    return;
                }
                break;
            case "EUR":
                switch (toCurrency) {
                    case "USD": conversionRate = 1.08;
                    break;
                    case "INR": conversionRate = 89.65;
                    break;
                    case "JPY": conversionRate = 159.24;
                    break;
                    case "AUD": conversionRate = 1.77;
                    break;
                    case "EUR": conversionRate = 1;
                    break;
                    default: System.out.println("Invalid target currency.");
                    return;
                }
                break;
            case "INR":
                switch (toCurrency) {
                    case "USD": conversionRate = 0.012; 
                    break;
                    case "EUR": conversionRate = 0.011;
                    break;
                    case "JPY": conversionRate = 1.68;
                    break;
                    case "AUD": conversionRate = 0.017;
                    break;
                    case "INR": conversionRate = 1; 
                    break;
                    default: System.out.println("Invalid target currency.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid source currency.");
                return;
        }

        double convertedAmount = amount * conversionRate;
        System.out.printf("%.2f %s equals %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
    }
}