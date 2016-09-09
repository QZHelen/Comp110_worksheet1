package comp110_ws01_tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import comp110_ws01.Phone;

public class WS01_tester {

	Phone p = new Phone("Samsung", 51, 111);
			
	@Test
	public void testCharge() {
		int randomNum = (int) (Math.random()*10);
		int initial = p.getPower();
		p.charge(randomNum);
		assertEquals("Charge method incorrect.",initial + randomNum,p.getPower());
		p.charge(randomNum + 60);
		assertEquals("Charge method incorrect.", 100, p.getPower());
		
	}
	
	@Test
	public void testDecreasingPower(){
		int randomNum = (int) (Math.random() * 5);
		p.decreasePower(randomNum);
		assertEquals("Decreasing Power method incorrect", 51 - randomNum, p.getPower());
		p.decreasePower(80);
		assertEquals("Decreasing Power method incorrect", 0, p.getPower());
	}
	
	@Test
	public void testUnlockPhone() {
		int randomWrongPw = (int) (Math.random() * 110);
		assertFalse("Unlock Phone method incorrect.", p.unlockPhone(randomWrongPw));
		assertTrue("Unlock Phone method incorrect.", p.unlockPhone(111));
		assertEquals("Unlock Phone method incorrect.", p.getPower(), 50);
		p.decreasePower(100);
		assertFalse("Unlock Phone method incorrect.", p.unlockPhone(111));
	}
	
	@Test
	public void testResetPassword(){
		int number = (int) (Math.random() * 100);
		p.resetPassword(number);
		assertEquals("Reset Password method incorrect.", p.getPassword(), number);
		assertEquals("Reset Password method incorrect.", p.getPower(), 49);
	}

}
