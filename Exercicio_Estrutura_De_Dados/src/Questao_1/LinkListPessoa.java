package Questao_1;

public class LinkListPessoa {

	private LinkPessoa first; // ref to first item on list
	// -------------------------------------------------------------

	public LinkListPessoa() // constructor
	{
		first = null;
	} // no items on list yet
	// -------------------------------------------------------------

	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

	// -------------------------------------------------------------
	public void insertFirst(Pessoa pessoa) // insert at start of list
	{ // make new link
		LinkPessoa newLink = new LinkPessoa(pessoa);
		newLink.nextPessoa = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	// -------------------------------------------------------------
	public long deleteFirst() // delete first item
	{ // (assumes list not empty)
		LinkPessoa temp = first; // save reference to link
		first = first.nextPessoa; // delete it: first-->old next
		return temp.pessoa.getRg(); // return deleted link
	}

	// -------------------------------------------------------------
	public void displayList() {
		LinkPessoa current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.nextPessoa; // move to next link
		}
		System.out.println("");
	}

	// -------------------------------------------------------------
	public LinkPessoa find(int key) {
		LinkPessoa current = first;
		while (current.pessoa.getRg() != key) {
			if (current.nextPessoa == null)
				return null;
			else
				current = current.nextPessoa;
		}
		return current;
	}

	// -------------------------------------------------------------
	// Deletando da lista
	/*public LinkCadastro deleteFind(int key) {
		LinkCadastro current = first;
		while (current.cadastro.getCod() != key) {
			if (current.nextCadastro == null)
				return null;
			else
				// current = current.nextCadastro;
				deleteFirst();
		}
		return null;
	}*/

}
