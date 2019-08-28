package dp.facade;

public class SecurityCodeCheck {
	private int securityCode = 321;
	
	public int getSecurityCode() {return securityCode;}
	public boolean isCodeCorrect(int secCodeToCheck) {
		if (secCodeToCheck == getSecurityCode()) {return true;}
		else {return false;}
	}
}
