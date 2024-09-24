package JAVA_PROGRAMMING;

import java.util.Scanner;

public class CurrencyConverterApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter base currency (e.g., USD): ");
		String baseCurrency = scanner.nextLine();
		System.out.print("Enter target currency (e.g., EUR): ");
		String targetCurrency = scanner.nextLine();
		CurrencyConverter converter = new CurrencyConverter();
		converter.fetchExchangeRate(baseCurrency, targetCurrency);
		if (converter.exchangeRate != 0) {
			System.out.print("Enter amount to convert: ");
			double amount = scanner.nextDouble();
			double convertedAmount = converter.convert(amount);
			System.out.printf("%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
		}
		scanner.close();
	}
}