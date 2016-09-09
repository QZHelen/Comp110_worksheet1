package comp110_ws01;

public class OneCard {
	/**
	 * step1: declare three private instance variables called _PID, _balance,
	 * and _password, and their types should be int, double, String,
	 * respectively
	 */

	private int _PID;
	private double _balance;
	private String _password;

	/**
	 * step2: build a constructor for this class that takes in 3 parameters, int
	 * PID, double balance, and String password, and then assign the values to
	 * the corresponding instance variables, i.e., save the value of PID to
	 * _PID, balance to _balance, and so on.
	 * 
	 */

	public OneCard(int PID, double balance, String password) {
		this._PID = PID;
		this._balance = balance;
		this._password = password;
	}

	/**
	 * step3: implement the methods here: 
	 * void addFunds(double dollars); 
	 * void subtractFunds(double dollars);  // call isBalanceEnough() first, 
	 * boolean isBalanceEnough(double dollars);
	 * double getBalance(); 
	 * boolean isPasswordCorrect(String password);
	 */

}
