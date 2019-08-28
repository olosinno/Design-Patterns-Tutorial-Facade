package dp.facade;

public class FundsCheck {
	private double cashInAccount = 500.00;
	public double getCashInAccount() {return cashInAccount;}
	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}
	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount += cashDeposited;
	}
	
	public boolean haveEnough(double cashToWithdraw) {
		if (cashToWithdraw > getCashInAccount()) {
			System.out.println("Not enough cash.");
			System.out.println("Current Balance: " + getCashInAccount());
			return false;
		}
		else {
			decreaseCashInAccount(cashToWithdraw);
			System.out.println("Withdraw complete! Remaining cash: " + getCashInAccount());
			return true;
		}
	}
	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit complete. Current Balance: " + getCashInAccount());
	}
}
