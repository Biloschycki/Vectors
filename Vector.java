package fiap;

import java.util.Scanner;

public class Aula06_Exercício02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		String[] nomes = new String [10];
		String nomeProcurado =null;
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"° nome:" );
			nomes[i]=entrada.next();
		}//fim for
			System.out.println("Digite o nome para procurar no vetor:");
			nomeProcurado=entrada.next();
			
			for(int i=0;i<10;i++) {
			if(nomes[i].equalsIgnoreCase(nomeProcurado)) {
				System.out.println("Achei o "+nomeProcurado+" - Posição "+ (i+1));
			}else {
					System.out.println("Não achei o nome procurado.");
				}
			
			}
	}//class

}//main
