package Questao_1;
//Wagner Ramos Lima
public class Pessoa {
	
	private long rg;
	private String nome;
	private String sexo;
	private double altura;
	
	public Pessoa(long rg, String nome, String sexo, double altura) {
		this.rg = rg;
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
	}

	
	
	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
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
