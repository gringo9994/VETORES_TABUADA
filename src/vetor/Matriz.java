package vetor;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		
String mat[][]=new String[2][2];
	
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Iniciando Programa");
		
		
		
		
		for (int i = 0; i <2; i++) {
			for (int j = 0; j <2; j++) {
			System.out.println("informe um nome");
			//atribuir os nomes dentro da matriz
			mat[i][j]=entrada.nextLine();
			System.out.println("Informe a Idade");
			mat[i][j]=entrada.nextLine();
			
			
			
			}
			
		}
		
		for (int i = 0; i <2; i++) {
			for (int j = 0; j <2; j++) {
				
				System.out.println("Os Nomes Citados Acima São: " +mat[i][j]);
				
			}
			
		}
		
		
		
		

	}

}
