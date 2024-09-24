package JAVA_PROGRAMMING;

class BankAccount {
	private double balance;
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. New balance: Rs." + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: Rs." + balance);
		} else if (amount > balance) {
			System.out.println("Insufficient balance for withdrawal.");
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}
} 