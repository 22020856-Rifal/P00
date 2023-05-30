import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a=1234;
		int b=8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected=9999;
		assertEquals (expected, actual);
	}
	@Test
	public void testSubstract() {
		int a=1234;
		int b=1000;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a,b);
		
		int expected=234;
		assertEquals (expected, actual);
	}
	@Test
	public void testMultiple() {
		int a=1234;
		int b=2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected=2468;
		assertEquals (expected, actual);
	}
	@Test
	public void testDivide() {
		int a=1000;
		int b=10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected=100;
		assertEquals (expected, actual);
	}
}
