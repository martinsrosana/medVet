package Entidade;

public abstract class  Animal {
	
private int idRegistro;
private String nome;
private String especie;
private String sexo;
private String cor;
private Double peso;
private int idadeAproximada;
private String tipoPele;


public Animal(int idRegistro, String nome, String especie, String sexo, String cor, Double peso, int idadeAproximada, String tipoPele) {
	this.idRegistro = idRegistro;
	this.nome = nome;
	this.especie = especie;
	this.sexo = sexo;
	this.cor = cor;
	this.peso = peso;
	this.idadeAproximada = idadeAproximada;
	this.tipoPele = tipoPele;
}
public int getIdRegistro() {
	return idRegistro;
}
public void setIdRegistro(int idRegistro) {
	this.idRegistro = idRegistro;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEspecie() {
	return especie;
}
public void setEspecie(String especie) {
	this.especie = especie;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public Double getPeso() {
	return peso;
}
public void setPeso(Double peso) {
	this.peso = peso;
}
public int getIdadeAproximada() {
	return idadeAproximada;
}
public void setIdadeAproximada(int idadeAproximada) {
	this.idadeAproximada = idadeAproximada;
}

public String getTipoPele() {
	return tipoPele;
}
public void setTipoPele(String tipoPele) {
	this.tipoPele = tipoPele;
}
public boolean canta() {
	return true;
}
public static int late(int mamiferolate) {
	return 1;
}

public static boolean venenoso(boolean possuiVeneno) {
	return true;
}
 public boolean nada() {
	 return true;
 }
 public static void addMamifero(Object mamifero) {
	 
 }
public static void addAve(Object ave) {
	 
 }

public static void addReptil(Object reptil) {
	 
}
 
 public String toString() {
	 return " O animal" 
			 + this.getNome()
			 +"foi registrado no sistema com o ID de identificação: "
			 + idRegistro;
	  
 }

 
}
