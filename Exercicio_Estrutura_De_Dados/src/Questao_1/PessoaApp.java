package Questao_1;

import java.text.SimpleDateFormat;

public class PessoaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		String sexo;
		double altura = 0, somaAltura = 0, maxAltura = 0, alturaMedM = 0, alturaMedF = 0;
		long rg;
		int op = 0, cont = 0, contMasc = 0, contFemi = 0;
		Pessoa aux;
		LinkPessoa listaPess;
		LinkListPessoa listaPessoa = new LinkListPessoa();

		System.out.println("============================");
		System.out.println("          CADASTRO APP          ");
		System.out.println("       MAXIMO DE 5 PESSOA!       ");
		System.out.println("============================");
		System.out.println("");
		System.out.println("1 - Cadastrar Pessoa");
		System.out.println("2 - Excluir Pessoa");
		System.out.println("3 - Buscar Pessoa");
		System.out.println("4 - Informar RELATÓRIO");
		System.out.println("5 - Sair");
		System.out.print("Digite a opção: ");
		op = Read.readInt();
		while (op != 5) {
			switch (op) {
			case 1: // Inserção
			{

				System.out.println("");
				System.out.println("INCLUSÃO");
				System.out.println(" ");
				System.out.print("Informe o RG: ");
				rg = Read.readInt();
				System.out.println("Informe nome: ");
				nome = Read.readString();
				System.out.println("Informe a altura: ");
				altura = Read.readDouble();
				//Pega a maior altura
				if (altura > maxAltura) 
					maxAltura = altura;
				//-----------------------------
				System.out.println("Informe o sexo = (M) MASCULINO | (F) FEMININO: ");
				sexo = Read.readString();
				if ((sexo.equals("M")) || (sexo.equals("F"))) {
					switch (sexo) {
					case "M":
						aux = new Pessoa(rg, nome, sexo, altura);
						if (cont <= 10) {
							listaPessoa.insertFirst(aux);
							contMasc++;
							somaAltura =+ altura; // Soma das alturas
							alturaMedM =+ altura; //Altura média Masculina
							cont++;
							break;
						} else
							System.out.println("Pilhas 1 cheia!");
						break;

					case "F":
						aux = new Pessoa(rg, nome, sexo, altura);
						if (cont <= 10) {
							listaPessoa.insertFirst(aux);
							contFemi++;
							somaAltura =+ altura; // Soma das alturas
							alturaMedF =+ altura; //Altura média Feminina
							cont++;
							break;
						} else
							System.out.println("Pilhas 1 cheia!");						
						break;

					default:
						break;
					}
				}
			}
			case 2:// Remoção
			{
				if (!listaPessoa.isEmpty()) {
					listaPessoa.deleteFirst();
					cont--;
				} else
					System.out.println("NÃO CONTEM ENGRADADO NO ESTOQUE!!");
				break;
			}
			case 3: // Busca
			{
				System.out.println("Informe o RG a ser consultado: ");
				rg = Read.readInt();
				listaPess = listaPessoa.find(rg);
				if (listaPess == null) {
					System.out.println("RG não encontrado!");
				} else
					listaPess.displayLink();
				break;
			}
			case 4: // Informa quanto resta
			{
				alturaMedM = (alturaMedM / contMasc);//média da altura Masculino
				alturaMedF = (alturaMedF / contFemi);//média da altura Feminino
				somaAltura = (somaAltura / cont);//média da altura das pessoas
				
				
				System.out.println("============================");
				System.out.println("       RELATÓRIO!       ");
				System.out.println("============================");
				System.out.println("");
				System.out.println("Altura média das pessoas: " + somaAltura);
				System.out.println("");
				System.out.println("Maior altura encontrada: " + maxAltura);
				System.out.println("");
				System.out.println("Média da altura Masculino: " + alturaMedM);
				System.out.println("");
				System.out.println("Média da altura Feminino: " + alturaMedF);
				System.out.println("");
				System.out.println("Quantidade de Homens: " + contMasc);
				
				break;
			}
			default: {
				System.out.println("Opção Inválida!");
			}
			}
			System.out.println("============================");
			System.out.println("          CADASTRO APP          ");
			System.out.println("       MAXIMO DE 5 PESSOA!       ");
			System.out.println("============================");
			System.out.println("");
			System.out.println("1 - Cadastrar Pessoa");
			System.out.println("2 - Excluir Pessoa");
			System.out.println("3 - Buscar Pessoa");
			System.out.println("4 - Informar RELATÓRIO");
			System.out.println("5 - Sair");
			System.out.print("Digite a opção: ");
			op = Read.readInt();
		}
		System.out.println("*** FIM ***");

	}

}
