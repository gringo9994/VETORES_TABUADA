package vetor;

public class Matriz2 {

	public static void main(String[] args) {

		int mat[][] = { { 1, 2, 3, 4, 5 }, { 6, 5, 4, 3, 2, 1 } };

		for (int linha = 0; linha < mat.length; linha++) {
			
			for (int coluna = 0; coluna < mat[linha].length; coluna++) {

				System.out.print(mat[1][2]+"\t");
			}

		}

	}

}
