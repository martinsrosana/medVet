package Entidade;

public class Reptil extends Animal {
	
	private int comprimento;
    private String rasteja;
	
	public Reptil(int idRegistro, String nome, String especie, String sexo, String cor, Double peso,
			int idadeAproximada, String tipoPele, int comprimento, String rasteja) {
		super(idRegistro, nome, especie, sexo, cor, peso, idadeAproximada, tipoPele);
		this.comprimento = comprimento;
		this.rasteja = rasteja;
	}
	
	public Reptil(int idRegistro, String nome, String especie, String sexo, String cor, Double peso,
			int idadeAproximada, String tipoPele) {
		super(idRegistro, nome, especie, sexo, cor, peso, idadeAproximada, tipoPele);
	}
	
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public String getRateja() {
		return rasteja;
	}
	public void setRateja(String rateja) {
		this.rasteja = rateja;
	}	
}