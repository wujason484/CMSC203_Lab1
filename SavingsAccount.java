public class SavingsAccount extends BankAccount{
	private final double rate=0.025;
	private int savingsNumber=0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name,amount);
		setAccountNumber(getAccountNumber()+"-"+savingsNumber);
	}

	public void postInterest() {
		double monthRate=rate/12;
		double monthInterest=monthRate*getBalance();
		deposit(monthInterest);
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount,amount);
		savingsNumber+=1;
		accountNumber = oldAccount.accountNumber;
	}

}

