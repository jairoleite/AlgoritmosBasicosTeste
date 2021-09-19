package br.com.questoes.atividade;

import br.com.questoes.atividade.fatorial.Fatorial;
import br.com.questoes.atividade.multiplos.Multiplos;
import br.com.questoes.atividade.ordenacao.BubbleSort;
import br.com.questoes.atividade.votoeleitores.Voto;

public class Main {

	public static void main(String[] args) {
		
		//voto em relação aos eleitores
		Voto voto = new Voto(1000, 800.0, 150.0, 50.0);
		
		System.out.println("Calculo dos votos:");
		System.out.println( String.format("%s%.2f%s", "Percentual válidos: ", voto.calculaPercentualValidos(),"%") +" ");
		System.out.println( String.format("%s%.2f%s", "Percentual brancos: ", voto.calculaPercentualBrancos(),"%") +" ");
		System.out.println( String.format("%s%.2f%s", "Percentual nulos: ", voto.calculaPercentualNulos(),"%") +" \n");
		
		
		//ordenação de array
		System.out.println("Vetor ordenado: ");
		
		int[] v = {5, 3, 2, 4, 7, 1, 0, 6};
	    BubbleSort.ordenar(v);
	    
	    for(int num : v) {
	      System.out.print(num + " ");
	    }
	    
	    System.out.println("\n");
	    

	    //calculo de fatorial
	    System.out.println("Fatorial de um número:");
	    
	    int numero = 5;
	    int fatorial = Fatorial.calculaFatorial(numero);
	    System.out.println( "O fatorial de " + numero + " é igual a " + fatorial +"\n");
	    
	    //números multiplos
	    System.out.println("Números multiplos:");
	    int multiploTresECinco = Multiplos.multiploTresECinco(10);
	    System.out.println("A soma dos multiplos de 3 e 5 é: " +multiploTresECinco);
	}
}
