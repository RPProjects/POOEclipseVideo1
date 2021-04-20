
public class Personagens {
	private String nome;
	private String categoria;
	private double forca;
	private double fatorAleatorio;
	
	
	String getNome() {
		return nome;
	}


	void setNome(String nome) {
		this.nome = nome;
	}


	String getCategoria() {
		return categoria;
	}


	void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	double getForca() {
		return forca;
	}


	void setForca(double forca) {
		this.forca = forca;
	}


	double getFatorAleatorio() {
		return fatorAleatorio;
	}


	void setFatorAleatorio(double fatorAleatorio) {
		this.fatorAleatorio = fatorAleatorio;
	}


	public Personagens(String nome, String categoria, double forca, double fatorAleatorio) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.forca = forca;
		this.fatorAleatorio = fatorAleatorio;
	}
	
	public void mostraPersonagem() {
		System.out.println("Nome: " + this.getNome() +
						   " Categoria: " + this.getCategoria() +
						   " Força: " + this.getForca() +
						   " Fator: " + this.getFatorAleatorio());
	}
}
