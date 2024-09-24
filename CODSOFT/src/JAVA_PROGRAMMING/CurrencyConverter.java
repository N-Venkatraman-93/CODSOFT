package JAVA_PROGRAMMING;

class CurrencyConverter {
	double exchangeRate;
	public void fetchExchangeRate(String baseCurrency, String targetCurrency) {
		if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
			exchangeRate = 0.85;
		} else if (baseCurrency.equals("USD") && targetCurrency.equals("GBP")) {
			exchangeRate = 0.73; 
		} else {
			System.out.println("Exchange rate not available for selected currencies.");
			exchangeRate = 0;
		}
	}
	public double convert(double amount) {
		return amount * exchangeRate;
	}
}