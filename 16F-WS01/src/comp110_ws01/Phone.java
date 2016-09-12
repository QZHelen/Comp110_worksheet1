package comp110_ws01;

public class Phone {

	// step1: declare instance variables
	private String _brand;
	private int _power;
	private int _password;
	private boolean _locked;

	// step2: constructor
	public Phone(String brand, int power, int password){
		_brand = brand;
		_power = power;
		_password = password;
		_locked = true;
	}
	
	// step3: methods:
	public void charge(int time){
		if(_power + time > 100){
			_power = 100;
		} 
		else {
			_power = time * 1 + _power;
		}
		
	}
	
	public void decreasePower(int percent){
		if(_power - percent < 0){
			_power = 0;
		} else{
			_power = _power - percent;
		}
		
	}
	
	public boolean unlockPhone(int password){
		if(_password == password && _power > 0){
			this.decreasePower(1);
			_locked = false;
			return true;
		}
		else{
			return false;
		}
	}
	
	public void resetPassword(int password){
		this.decreasePower(2);
		_password = password;
	}
	
	public void sendMessage(int number, String message) {
		if (_locked == false) {
			if (number < 1000000000 && number >= 100000000){
				System.out.println("You have sent " + message + " to " + number );
			} else  {
				System.out.println("Message failed to send.");
			}
		}
	}
	// charge(time); TODO: upper -- if-else
	// decreasePower(percentage); TODO: check lower bounds -- if-else 
	// isUnlockSuccessful(password); TODO: 1. check have power and password correct; 2. decrease power  
	// resetPassword(password); TODO: decrease power
	// 
	
	// getter methods
	public int getPower(){
		return _power;
	}
	
	public int getPassword(){
		return _password;
	}
	
	public String getBrand(){
		return _brand;
	}
	

}
