package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

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
	public void testIsEven() {
		MyInteger.setiValue(2);
		MyInteger x = new MyInteger();
		assertTrue(x.isEven());
	}
	
	public void testIsOdd() {
		MyInteger.setiValue(3);
		MyInteger x = new MyInteger();
		assertTrue(x.isOdd());
	}
	
	public void testIsPrime() {
		MyInteger.setiValue(7);
		MyInteger x = new MyInteger();
		assertTrue(x.isPrime());
	}
	
	public void testIntIsEven(){
		assertTrue(MyInteger.isEven(2));
	}
	
	public void testIntIsOdd(){
		assertTrue(MyInteger.isOdd(1));
	}
	
	public void testIntIsPrime(){
		assertTrue(MyInteger.isPrime(2));
	}
	
	public void testMyIntIsEven(){
		MyInteger x = new MyInteger();
		assertTrue(x.isEven(2));
	}
	
	public void testMyIntIsOdd(){
		MyInteger x = new MyInteger();
		assertTrue(x.isOdd(1));
	}
	
	public void testMyIntIsPrime(){
		MyInteger x = new MyInteger();
		assertTrue(x.isPrime(2));
	}
	
	public void testIntIsEqual(){
		MyInteger.setiValue(2);
		assertTrue(MyInteger.equals(2));
	}
	
	public void testMyIntIsEqual(){
		MyInteger.setiValue(2);
		MyInteger x = new MyInteger();
		assertTrue(MyInteger.equals(x));
	}
	

}
