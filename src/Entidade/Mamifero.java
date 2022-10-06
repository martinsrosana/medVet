package Entidade;

public class Mamifero extends Animal {
	
	private int mama;
	
	

	public Mamifero(int idRegistro, String nome, String especie, String sexo, String cor, Double peso,
			int idadeAproximada, String tipoPele, int mama) {
		super(idRegistro, nome, especie, sexo, cor, peso, idadeAproximada, tipoPele);
		this.mama = mama;
	}
	public Mamifero(int idRegistro, String nome, String especie, String sexo, String cor, Double peso,
			int idadeAproximada, String tipoPele) {
		super(idRegistro, nome, especie, sexo, cor, peso, idadeAproximada, tipoPele);
	}

	public int getMama() {
		return mama;
	}

	public void setMama(int mama) {
		this.mama = mama;
	}

	
}