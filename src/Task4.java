import java.util.Arrays;
import java.util.Random;

public class Task4 {
		public boolean IsItReapeatable(int number, int[] massiv) {
			boolean bool = false;
			for (int i = 0; i < massiv.length; i++) {
				if (massiv[i] == number) {
					bool = true;
					break;
				}
			}
			return bool;
		}
	public static void main(String[] args) {
		int[] massiv = new int[20];
		int min = 1;
		int max = 20;
		
		Task4 number = new Task4();
		
		Random random = new Random();
		for (int i = 0; i < massiv.length; i++) {
			
			int x = random.nextInt(max-min+1);
			x += min;
			if (number.IsItReapeatable(x, massiv)) {
				i = i - 1;
			}
			else {
				massiv[i] = x;
			}
		}
		System.out.println(Arrays.toString(massiv));
	}
	
}
