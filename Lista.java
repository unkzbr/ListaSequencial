package ListaSequencial;





public class Lista {

	Contato[] contatos = new Contato[100];
	int n=0;


private void deslocarDireita(int pos){
		
		for (int i = n; i > pos; i--) {
			contatos[i] = contatos[i-1];
		}
	}
	
	private void deslocarEsquerda(int pos){
		for (int i = pos; i < n-1; i++) {
			contatos[i] = contatos[i+1];
		}
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public boolean isFull() {
		return n == contatos.length;
	}

	public boolean inserir(Contato contato) {
		if (isFull()) {
			return false;
		}
	    
		contatos[n++] = contato;
		
		
		return true;

	}

	public void listar() {
	
		if (isEmpty())
			System.out.println("Lista Vazia");
		else
		
			for (int i = 0; i < n; i++) {
				Contato c = contatos[i];
				System.out.println("Index: "+i);
				System.out.println(c.toString());
						
			}

	}

	public boolean inserir(Contato contato, int pos) {
		if (isFull()) {
			return false;
		}
		if (isEmpty()) {
			System.out.println("Você não pode adicionar em um local específico com a lista vazia.\n");
			System.out.println("Favor inserir alguns contatos.\n");
			System.out.println("Favor utilizar uma posição válida.");
		
		}
		else {
		deslocarDireita(pos);
		contatos[pos] = contato;
		n++;
		}
		return true;
		
	}

	public boolean remover() {
		if(isEmpty()) {
			System.out.println("Lista Vazia.");
			return false;
		}
		n--;
		System.out.println("Último contato removido com sucesso.");
		return true;

	}

	public boolean remover(int pos) {
		if (isEmpty()) {
			System.out.println("Lista Vazia.");
			return false;
		}
		deslocarEsquerda(pos);
		n--;
		System.out.println("Contato removido com sucesso.");
		return true;
	}

	public boolean remover(Contato contato) {
		for (int i = 0; i < n; i++) {
			if (contatos[i].equals(contato)) {
				remover(i);
				n--;
				return true;
			}

		}
		return false;
	}

	public int tamanho() {
	
		
		return n;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < n; i++) {
			str += contatos[i].toString();

		}
		return str;
	}
	public void find(String string){
		int cont = 0;
		for (int i = 0; i < n; i++) {			
			if (contatos[i].getNome().equalsIgnoreCase(string) || contatos[i].getNumero().equals(string)){
				System.out.println("Index:"+cont);
				System.out.println("Nome :"+contatos[i].getNome());
				System.out.println("Telefone: "+contatos[i].getNumero());
			}
			cont++;
		}		
	}
}


