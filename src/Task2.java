
public class Task2 {
	public String getMinAndMax(int[][][] massiv) {
		int maxElem = massiv[0][0][0];
		int minElem = massiv[0][0][0];
		
		for (int i = 0; i < massiv.length; i++) {
			for (int g = 0; g < massiv[i].length; g++) {
				for (int k = 0; k < massiv[i][g].length; k++) {
					if (massiv[i][g][k] >= maxElem) {
						maxElem = massiv[i][g][k];
					}
					else {
						
					}
				}
			}
		}
		
		for (int i = 0; i < massiv.length; i++) {
			for (int g = 0; g < massiv[i].length; g++) {
				for (int k = 0; k < massiv[i][g].length; k++) {
					if (massiv[i][g][k] <= minElem) {
						minElem = massiv[i][g][k];
					}
					else {
						
					}
				}
			}
		}
		
		
		return "Max element is "+maxElem+"\n"+"Min element is "+minElem;
	}
	public static void main(String[] args) {
		Task2 number = new Task2();
		String result = number.getMinAndMax(new int[][][] {
			{{1, 2, 43, 3}, {32, 6, 3}, {3, 9, 45}},
			{{3, 4}, {12, 4, 9}, {77}},
			{{24, 23, 2, 3, 7}, {67, 66}, {3, 9, 3}}
		});
		System.out.println(result);
	}

}
