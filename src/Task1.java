
public class Task1 {

	public static void main(String[] args) {
		int[][] massiv = {
				{1, 3, 2, 4, 9, 7, 9},
				{3, 7, 5, 5, 6, 7, 1},
				{0, 6, 8, 0, 9, 1, 8},
				{4, 5, 4, 9, 7, 1, 8},
				{3, 0, 6, 4, 6, 9, 3},
				{8, 2, 0, 8, 6, 2, 8},
				{7, 9, 3, 9, 8, 8, 6},
		};
		
		for (int i = 0; i < 7; i++) {
			for (int g = 0; g < 7; g++) {
				System.out.print(massiv[i][g] + " ");
			}
			System.out.println();
		}

	}

}
