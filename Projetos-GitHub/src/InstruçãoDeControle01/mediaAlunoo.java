package Instru��oDeControle01;

import java.util.Scanner;

import javax.swing.JOptionPane;
 // C�sar Silva..
public class mediaAlunoo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("----M�dia Alunos ------------");
		System.out.println("-----------------------------");
	     int nota = 0;
		int cont = 0;
		int total = 0;
		System.out.printf("Nota -1 para sair:");
		nota = entrada.nextInt();

		while (nota != -1) {

			total = total + nota;
			cont++;

			System.out.printf("Nota -1 para sair:");
			nota = entrada.nextInt();
		}
		if(cont !=0) 
		{
         		double media = (double)total /cont;
			
			System.out.println("-----------------------------");
			System.out.printf("Foram digitados %d notas um total de %d\n", cont, total);
			System.out.printf("A media e :%.2f\n ", media);
		}else {
			System.out.println("N�o foram inseridos notas!");
		}

		
		System.out.println("-----------------------------");
		System.out.println("Fim, Volte Sempre!!");
		entrada.close();

	}
}
