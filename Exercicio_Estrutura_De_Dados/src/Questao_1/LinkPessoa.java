package Questao_1;

public class LinkPessoa {
	
	public Pessoa pessoa; // pessoa item
	public LinkPessoa nextPessoa; // next link in list
	// -------------------------------------------------------------

	public LinkPessoa(Pessoa pessoa) // constructor
	{
		this.pessoa = pessoa;
	}

	// -------------------------------------------------------------
	public void displayLink() // display ourself
	{
		System.out.println("RG: " + pessoa.getRg() + "\nNome: " + pessoa.getNome() + "\nSexo: " + pessoa.getSexo() + "\nAltura: " + pessoa.getAltura());

	}

}
