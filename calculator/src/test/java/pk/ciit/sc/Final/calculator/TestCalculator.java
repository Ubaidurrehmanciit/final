package pk.ciit.sc.Final.calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestCalculator {
	private static Calculator calculator  = new Calculator();
	@Test
	public void testfindMax(){
		int result = calculator.findMax(3, 4,3);
		assertEquals(4, result);
	}
	@Test
	public void testfindMax1(){
		int result = calculator.findMax(-1, 4,0);
		assertEquals(3, result);
	}
	
	@Test
	public void testfindMax2(){
		int result = calculator.findMax(-1, -4,-6);
		assertEquals(-1, result);
	}
	
	@Test
	public void square(){
		int result = calculator.square(3);
		assertEquals(9, result);
	}
	
	
	
	@Test
	public void cube(){
		int result = calculator.cube(2);
		assertEquals(8, result);
	}
	
	@Test
	public void cube1(){
		int result = calculator.cube(-2);
		assertEquals(-8, result);
	}

}