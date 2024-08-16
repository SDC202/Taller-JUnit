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

        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            if (max < arr[i]) 
                max = arr[i]; 
        }
        return max; 
    }


}