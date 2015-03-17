package ListaSequencial;

import java.util.Scanner;

public class Main {
	
	public static void menu() {
		System.out.println("");
		System.out
		.println("::: Digite os números dos comandos que deseja executar. :::");
	System.out.println("::: 1. Adicionar :::	");
	System.out.println("::: 2. Buscar contato :::	");
	System.out.println("::: 3. Remover último contato ::: ");
	System.out.println("::: 4. Remover contato pelo index ::: ");
	System.out.println("::: 5. Listar :::");
	System.out.println("::: 6. Quantidade de contatos :::");
	System.out.println("::: 7. Sair :::");
	System.out.println("");
	}
	public static void main(String[] args) {
		int opt;
		//int index =0;
		String str;
		String num;
		Scanner read = new Scanner(System.in);
		Lista lista = new Lista();
		
		
		System.out.println("::: AGENDA 1.0 :::");
		
		do {
			menu();
			opt = read.nextInt();
			read.nextLine();
			switch (opt) {
			case 1:
				System.out.println("::: Deseja adicionar um contato na próxima posição ou em uma posição específica?::: \n");
				System.out.println("::: Digite 1 para última posição ou 2 para posição específica. :::");
				int opt2 = read.nextInt();
				read.nextLine();
				//Contato contato = new Contato();
				if (opt2 == 1 ) {
					Contato contato = new Contato();
				System.out.println("::: Digite o nome do contato :::");
				str = read.nextLine();
				contato.setNome(str);
				System.out.println("::: Digite o numero do contato :::");
				num = read.nextLine();
				contato.setNumero(num);
				lista.inserir(contato);
				}
				else if (opt2 == 2 ){
				Contato contato = new Contato();
				System.out.println("::: Digite o nome do contato :::");
				str = read.nextLine();
				contato.setNome(str);
				System.out.println("::: Digite o numero do contato :::");
				num = read.nextLine();
				contato.setNumero(num);
				System.out.println("::: Digite a posição :::");
				int pos2 = read.nextInt();
				read.nextLine();
				lista.inserir(contato,pos2);
						
				}
			
				break;
			case 2:
				System.out.println("::: Digite o nome ou telefone do contato do contato :::");
				String str2 = read.nextLine();
				lista.find(str2);
				
				
				break;
			case 3:
				
				lista.remover();
				
				break;
			case 4:
				System.out.println("::: Digite o index do item que deseja remover :::");
				int pos = read.nextInt();
				read.nextLine();
				lista.remover(pos);
				
				break;
			
			case 5:
				lista.listar();
				
							
				
				break;
			case 6:
				if(lista.tamanho() == 0) System.out.println("::: Lista Vazia :::");
				else System.out.println("::: Quantidade de contatos ::: "+lista.tamanho());
				break;
			case 7:
				System.out.println("::: Saindo do programa :::");
				read.close();
				break;
			default:
				
				opt = read.nextInt();
				read.close();
				
				break;
			}
		
		} while (opt != 7);

	}

}
