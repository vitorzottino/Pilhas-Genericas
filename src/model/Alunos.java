package model;

public class Alunos {

	int rm;
	String nome;
	double media;
	
	public Alunos() {

	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "\n RM:" + rm + "\n Nome: " + nome + "\n Media: " + media;
	}
	

}
