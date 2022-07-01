package InstruçãoDeControle01;

import java.util.Scanner;

import javax.swing.JOptionPane;
 // César Silva..
public class mediaAlunoo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println("----Média Alunos ------------");
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
			System.out.println("Não foram inseridos notas!");
		}

		
		System.out.println("-----------------------------");
		System.out.println("Fim, Volte Sempre!!");
		entrada.close();

	}
}
