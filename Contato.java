package ListaSequencial;

public class Contato {


private String nome;
private String numero;

public Contato() {
	
}


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String toString(){
	return "Nome: " + nome + "\n" + "Telefone: " + numero + "\n";
 }
public boolean equals(Contato contato){
return this.nome.equals(contato.nome) ; 
	
}

}
