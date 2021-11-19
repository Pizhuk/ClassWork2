import java.util.Arrays;

public class Task3 {
	
	public static void main(String[] args) {
		int[] massiv = {1, 3, 56, 45, 44, 21, 36, 8};
		
		int a = 0;
		
		
		int b = 0;
		
		
		for (int i = 0; i < massiv.length; i++) {
			if (massiv[i]%2 == 0) {
				a++;
			}
			else if (massiv[i]%2 != 0){
				b++;
			}
		}
		
		int[] massivChet = new int[a];
		int[] massivNechet = new int[b];
		int[] massivResult = new int[a+b];

		for (int i = 0; i < massiv.length; i++) {
			if (massiv[i]%2 == 0) {
				massivChet[a-1] = massiv[i];
				a--;
			}
			else {
				massivNechet[b-1] = massiv[i];
				b--;
			}
		}
		Arrays.sort(massivChet);
		Arrays.sort(massivNechet);
		
		int index1 = 0;
		for (int i = 0; i < massivResult.length; i=i+2) {
			massivResult[i] = massivChet[index1];
			index1++;
		}
		
		int index2 = 0;
		for (int i = massivResult.length-1; i >= 0; i=i-2) {
			massivResult[i] = massivNechet[index2];
			index2++;
		}
		
		
		System.out.println(Arrays.toString(massivResult));
	}

}
