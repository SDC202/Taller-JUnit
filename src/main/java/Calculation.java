import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Calculation {
	/*  COMO EJEMPLO
	public int findMax(int arr[]) {
        int max = 0; // Initialize max with 0
        for (int i = 1; i < arr.length; i++) { 
            if (max < arr[i])
                max = arr[i]; 
        }
        return max; 
    }*/
	
	public int findMax(int arr[]) {

        //Asumiendo que el arreglo no es vacio
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            if (max < arr[i]) 
                max = arr[i]; 
        }
        return max; 
    }
	
	
	@Test
	 public void testFindMaxPositivos(){
	 assertEquals(5,findMax(new int[]{1,2,3,4,5}));
	 assertEquals(500,findMax(new int[]{100,20,300,500,50}));
	 assertEquals(60,findMax(new int[] {60,30,20,50,40,10}));
	 }
	
	@Test
	 public void testFindMaxNegativos(){
	 assertEquals(-1,findMax(new int[]{-1,-2,-3,-4,-5}));
	 assertEquals(-20,findMax(new int[]{-100,-20,-300,-500,-50}));
	 assertEquals(-10,findMax(new int[] {-60,-30,-20,-50,-40,-10}));
	 }



}