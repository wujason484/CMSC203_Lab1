public class CheckingAccount extends BankAccount{
	private final double FEE=0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name,amount);
		setAccountNumber(getAccountNumber()+"-10");
	}
	
	public boolean withdraw(double amount) {
		double amountPlusFee=amount+FEE;
		return super.withdraw(amountPlusFee);
	}

}
