import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	 public void testFindMaxPositivos(){
		Calculation c = new Calculation();
		assertEquals(5,c.findMax(new int[]{1,2,3,4,5}));
		assertEquals(500,c.findMax(new int[]{100,20,300,500,50}));
		assertEquals(60,c.findMax(new int[] {60,30,20,50,40,10}));	
	 }
	
	@Test
	 public void testFindMaxNegativos(){
		Calculation c = new Calculation();
		assertEquals(-1,c.findMax(new int[]{-1,-2,-3,-4,-5}));
		assertEquals(-20,c.findMax(new int[]{-100,-20,-300,-500,-50}));
		assertEquals(-10,c.findMax(new int[] {-60,-30,-20,-50,-40,-10}));
	 }

}
