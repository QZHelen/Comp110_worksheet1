package comp110_ws01;

public class PhoneRunner {

	public static void main(String[] args) {
		/*
		 * Create new instance of Phone, and pass in any brand.
		 * Set power to 50.
		 * Set password to 110.
		 */
		Phone phone = new Phone("Samsung", 50, 110);
		System.out.println("A new phone of brand " + phone.getBrand() + " has been produced. Current power: " + phone.getPower() + "; Initial password: " + phone.getPassword() + ".");
		
		/*
		 * Charge your phone 10 minutes and print your power.
		 */
		
		phone.charge(10);
		
		System.out.println("The power after charging for 10 minutes is:");
		System.out.println(phone.getPower());
		
		/* 
		 * Charge your phone 50 minutes and print your power.
		 */
		
		phone.charge(50);
		
		System.out.println("The power after charging for another 50 minutes is:");
		System.out.println(phone.getPower());
		
		/*
		 * Decrease your phone's power by 60 percent and print your power.
		 */
		
		phone.decreasePower(60);
		System.out.println("The power after decreasing the power by 60 percent is:");
		System.out.println(phone.getPower());
		
		/*
		 * Unlock your phone with the password 121. How did this affect your
		 * phone's power?
		 */
		phone.unlockPhone(121);
		System.out.println("The power after using 121 to unlock phone: ");
		System.out.println(phone.getPower());
		
		/*
		 * Unlock your phone with the password 110. How did this affect your 
		 * phone's power?
		 */
		phone.unlockPhone(110);
		System.out.println("The power after using 110 to unlock phone: "+phone.getPower());
		
		/*
		 * Reset your phone's password to your favorite number! Remember
		 * the power should be decreasing. Also check to make sure 
		 * the password changed!
		 */
		phone.resetPassword(890);
		System.out.println("The power after reseting password: ");
		System.out.println(phone.getPower());
		System.out.println("The new password is:");
		System.out.println(phone.getPassword());
		
		/*
		 * Send a nice message to any number you would like to brighten their
		 * day by calling sendMessage.
		 */
		phone.sendMessage(123456789, "Hello World:)");
	}

}
