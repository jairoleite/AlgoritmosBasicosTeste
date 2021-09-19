package br.com.questoes.atividade.fatorial;

/**
 * Classe responsável por calcular fatorial de um número 
 * @author jairoleite
 */
public final class Fatorial {

	private Fatorial() {}

	public static int calculaFatorial(int numero) {
		int fat = 1;

		for( int i = 2; i <= numero; i++ ){
			fat *= i;
		}
		
		return fat;
	}
}
