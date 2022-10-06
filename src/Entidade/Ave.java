package Entidade;

public class Ave extends Animal {

	private int aveVoando;
	private int aveNadando;
	private int cabeçaDentroTerra;

	public Ave(int idRegistro, String nome, String especie, String sexo, String cor, Double peso, int idadeAproximada, String tipoPele, int aveVoando, int aveNadando, int cabeçaDentroTerra) {
		super(idRegistro, nome, especie, sexo, cor, peso, idadeAproximada, tipoPele);
		this.aveVoando = aveVoando;
		this.aveNadando = aveNadando;
		this.cabeçaDentroTerra = cabeçaDentroTerra;
	}
	
	
	public Ave(int idRegistro, String nome, String especie, String sexo, String cor, Double peso, int idadeAproximada,
			String tipoPele) {
		super(idRegistro, nome, especie, sexo, cor, peso, idadeAproximada, tipoPele);
	}



	public int getAveVoando() {
		return aveVoando;
	}

	public void setAveVoando(int aveVoando) {
		this.aveVoando = aveVoando;
	}

	public int getAveNadando() {
		return aveNadando;
	}

	public void setAveNadando(int aveNadando) {
		this.aveNadando = aveNadando;
	}

	public int getCabeçaDentroTerra() {
		return cabeçaDentroTerra;
	}

	public void setCabeçaDentroTerra(int cabeçaDentroTerra) {
		this.cabeçaDentroTerra = cabeçaDentroTerra;
	}

	

	
	
}