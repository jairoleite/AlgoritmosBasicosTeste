package br.com.questoes.atividade.multiplos;

/**
 * Classe responsável por fazer a soma números multiplos
 * @author jairoleite
 */
public final class Multiplos {
	
	private Multiplos() {}
	
	public static int multiploTresECinco(int numero) {
		
		int n1 = 3;
		int n2 = 5;
		int resultado = 0;
		
		for( int i = 1; i < numero; i++){
			resultado = (i % n1 == 0 || i % n2 == 0)? resultado += i : resultado;
		}
		
		return resultado;
	}
}
