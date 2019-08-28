package dp.facade;

public class AccountFacade {
	private int accountNumber;
	private int securityCode;

	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
	
	public AccountFacade(int newAcctNum, int newSecCode) {

		accountNumber = newAcctNum;
		securityCode = newSecCode;
		
		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
	}
	public int getAcctNum() {return accountNumber;}
	public int getSecCode() {return securityCode;}

	public void withdrawCash(double cashToGet) {
		if (acctChecker.accountActive(getAcctNum()) && codeChecker.isCodeCorrect(getSecCode()) && fundChecker.haveEnough(cashToGet)) {
			System.out.println("Transaction complete!\n");
		}
		else System.out.println("Transaction failed.\n");
	}
	public void depositCash(double cashToDeposit) {
		if (acctChecker.accountActive(getAcctNum()) && codeChecker.isCodeCorrect(getSecCode())) {
			fundChecker.makeDeposit(cashToDeposit);
			System.out.println("Transaction complete!\n");
		}
		else System.out.println("Transaction failed.\n");
	}
}
