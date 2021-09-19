package br.com.questoes.atividade.votoeleitores;

import java.util.Objects;

/**
 * Classe responsável por calcular votos válidos, brancos e nulos  
 * @author jairoleite
 */
public class Voto {

	private Integer totalDeEleitores;
	private Double validos;
	private Double brancos;
	private Double nulos;
	
	public Voto(Integer totalDeEleitores, Double validos, Double brancos, Double nulos) {
		
		validaParametros(totalDeEleitores, validos, brancos, nulos);
		
		this.totalDeEleitores = totalDeEleitores;
		this.validos = validos;
		this.brancos = brancos;
		this.nulos = nulos;
	}

	private void validaParametros(Integer totalDeEleitores, Double validos, Double brancos, Double nulos) {
		
		if( Objects.isNull(totalDeEleitores) || 
		    Objects.isNull(validos) ||
		    Objects.isNull(brancos) ||
		    Objects.isNull(nulos) ) {
			
			throw new IllegalArgumentException("Todos os parâmetros são obrigatórios para instãnciar a classe voto");
		}
	}

	public Double getValidos() {
		return validos;
	}

	public Double getBrancos() {
		return brancos;
	}

	public Double getNulos() {
		return nulos;
	}

	/**
	 * Calcula percentual de votos válidos em relação ao total de eleitores 
	 * @return
	 */
	public double calculaPercentualValidos() {
		return (this.validos / this.totalDeEleitores); 
	}
	
	/**
	 * Calcula percentual de votos brancos em relação ao total de eleitores 
	 * @return
	 */
	public double calculaPercentualBrancos() {
		return (this.brancos / this.totalDeEleitores);
	}
	
	/**
	 * Calcula percentual de nulos brancos em relação ao total de eleitores 
	 * @return
	 */
	public double calculaPercentualNulos() {
		return (this.nulos / this.totalDeEleitores);
	}
	
	
}
