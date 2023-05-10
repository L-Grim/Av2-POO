package agenda;

import java.util.Scanner;
import contatos.Contato;

public class ContatosApp {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Digite 1 para adicionar um contato, digite 2 para listar contatos, digite 0 para sair do programa.");
			int opcao = scan.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("Obrigado por utilizar a agenda de contatos");
				return;
			case 1:
				for(int index = 0; index <= agenda.contatos.length; index++) {
					if(agenda.contatos[index] == null) {
						Contato contato = Contato.criarContato(scan);
						agenda.addContato(contato, index);
						break;
					} else if(index == agenda.contatos.length-1 && agenda.contatos[index] != null) {
						System.out.println("Sua agenda esta cheia");
						break;
					}
				}
				break;
			case 2:
				agenda.listarContatos();
				break;
			default: 
				System.out.println("ERRO - Opção inválida.");
				break;
			}
		}
	}	
}