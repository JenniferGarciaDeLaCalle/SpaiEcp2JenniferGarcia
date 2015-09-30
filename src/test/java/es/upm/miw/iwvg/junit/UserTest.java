package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;

    @Before
    public void before() {
    	user = new User(420657, "JuAn antOnio", "gonZalez", "Gutierrez");
    }
	
	@Test
    public void testFullName() {
		assertEquals("Juan Antonio Gonzalez Gutierrez", user.fullName());
    }
	
	@Test
    public void testInitials() {
		assertEquals("J.", user.initials());
    }
	
	@Test
    public void testGetNumber() {
		assertEquals(420657, user.getNumber());
    }
	
	@Test
    public void testGetName() {
		assertEquals("Juan Antonio", user.getName());
    }
	
	@Test
    public void testGetFamilyName() {
		assertEquals("Gonzalez", user.getFamilyName());
    }
	
	@Test
    public void testGetSecondFamilyName() {
		assertEquals("Gutierrez", user.getSecondFamilyName());
    }
	
}