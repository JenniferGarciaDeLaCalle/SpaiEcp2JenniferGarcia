package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fact;

    @Before
    public void before() {
    	fact = new Fraction(10, 2);
    }
    
    @Test
    public void testDecimal() {
        assertEquals(5.0, fact.decimal(), 10e-5);
    }
    
    
    @Test
    public void testNumerador() {
        assertEquals(10, fact.getNumerator());
    }
    
    @Test
    public void testDenominador() {
        assertEquals(2, fact.getDenominator());
    }
    
    @Test
    public void testFraccionMayor(){
    	fact.fraccionMayor(new Fraction(5, 2));
    	assertEquals(10, fact.getNumerator());
    	assertEquals(2, fact.getDenominator());
    }
    
    @Test
    public void testMitadFraccion(){
    	fact.mitadFraccion();
    	assertEquals((double) (10/2)/2, fact.decimal(), 10e-5);
    }
    
    @Test
    public void testMultiplicarFraccion(){
    	fact.multiplicarFraccion(new Fraction(5, 2));
    	assertEquals(50, fact.getNumerator());
    	assertEquals(4, fact.getDenominator());
    }

}
