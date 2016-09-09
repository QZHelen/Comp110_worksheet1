package comp110_ws01_tester;

import static org.junit.Assert.*;

import org.junit.Test;

import comp110_ws01.Phone;

public class WS01_tester {

	Phone p = new Phone("Samsung", 50, 110);
	
	
	@Test
	public void testCharge() {
	
		p.charge(10);
		assertEquals("Charge method incorrect.",p.getPower(), 60);
		p.charge(60);
		assertEquals("Charge method incorrect.", p.getPower(), 100);
		
	}
	
	@Test
	public void testUnlockPhone() {
		assertFalse("Unlock Phone Method incorrect.", p.unlockPhone(123));
		assertTrue("Unlock Phone Method incorrect.", p.unlockPhone(110));
		assertEquals("Charge method incorrect.", p.getPower(), 49);
	}
	
	@Test
	public void resetPassword(){
		int number = (int) (Math.random() * 100);
		p.resetPassword(number);
		assertEquals("Reset Password method incorrect.", p.getPassword(), number);
		assertEquals("Charge method incorrect.", p.getPower(), 48);
	}

}
