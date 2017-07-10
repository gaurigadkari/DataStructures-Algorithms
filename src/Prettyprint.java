import java.util.ArrayList;

public class Prettyprint {
	public ArrayList<ArrayList<Integer>> prettyPrint(int n) {
	    int size = 2 * n - 1;
		ArrayList<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer>>(size);
	    int [][] matrix = new int [size] [size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][j] = n;
				}
				if(matrix[j][i] == 0) {
					matrix[j][i] = n;
				}
				if(matrix[j][size - 1 - i] == 0) {
					matrix[j][size - 1 - i] = n;
				}
				if(matrix[size - 1 - i][j] == 0) {
					matrix[size - 1 - i][j] = n;
				}
			}
			n--;
		}
		for(int i = 0; i < size; i++) {
		    ArrayList<Integer> rows = new ArrayList<Integer> (size);
			for(int j = 0; j < size; j++) {
				rows.add(matrix[i][j]);
			}
			matrixList.add(rows);
		}
		return matrixList;
	}
	
}
