import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		int[] massiv = {4, 20, 13, 7, 0, 8, 19, 3, 6, 14};
		
		for (int i = 0; i < massiv.length; i++) {
			if(Integer.toString(massiv[i]).contains("4")) {
				massiv[i] = massiv[i]/2;
			}
		}
		
		System.out.println(Arrays.toString(massiv));
		
		for (int i = 0; i < massiv.length; i++) {
			if(massiv[i]%2 == 0) {
				massiv[i] = massiv[i]*massiv[i];
			}
			else {
				massiv[i] = 2*massiv[i];
			}
		}
		
		System.out.println(Arrays.toString(massiv));

	}

}
