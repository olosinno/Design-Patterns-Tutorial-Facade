package dp.facade;

public class TestBankAcct {
	public static void main(String[] args) {
		AccountFacade accessAccount = new AccountFacade(7654, 321);
		accessAccount.withdrawCash(50.00);
		accessAccount.withdrawCash(500.00);
		accessAccount.depositCash(300.00);
	}
}
