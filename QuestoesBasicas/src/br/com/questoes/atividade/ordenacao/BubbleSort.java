package br.com.questoes.atividade.ordenacao;

/**
 * Algoritmo de ordenação bubble sorte 
 * @author jairoleite
 */
public final class BubbleSort {

	private BubbleSort() {}
	
	public static void ordenar(int[] v) {

		for(int i = 0; i < v.length - 1; i++) {
			boolean estaOrdenado = true;
			for(int j = 0; j < v.length - 1 - i; j++) {
				if(v[j] > v[j + 1]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
					estaOrdenado = false;
				}
			}

			if(estaOrdenado) {
				break;
			}
		}
	}

}
