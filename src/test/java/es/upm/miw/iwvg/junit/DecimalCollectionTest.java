package es.upm.miw.iwvg.junit;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection decimal;
	
	@Before
    public void before() {
    	decimal = new DecimalCollection();
		decimal.add(3.5);
		decimal.add(7.9);
		decimal.add(10.0);
		decimal.add(1.1);
		decimal.add(2.3);
    }

	@Test
    public void testSize() {
		assertEquals(5, decimal.size());
    }
	
	@Test
    public void testSum() {
		assertEquals(24.8, decimal.sum(), 10e-5);
    }
	
	@Test
    public void testHigher() {
		assertEquals(10.0, decimal.higher(), 10e-5);
    }
	
	@Test
    public void testMediaLista() {
		assertEquals(4.96, decimal.mediaLista(), 10e-5);
    }
	
	@Test
    public void testDecimalMenor() {
		assertEquals(1.1, decimal.decimalMenor(), 10e-5);
    }
}