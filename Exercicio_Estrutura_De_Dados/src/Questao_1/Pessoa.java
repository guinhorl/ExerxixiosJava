package Questao_1;
//Wagner Ramos Lima
public class Pessoa {
	
	private String nome;
	private char sexo;
	private double altura;
	
	public Pessoa(String nome, char sexo, double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", altura=" + altura + "]";
	}
	
	

}
