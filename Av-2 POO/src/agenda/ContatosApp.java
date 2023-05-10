package agenda;

import java.util.Scanner;
import contatos.Contato;
import contatos.Endereco;
import contatos.Estados;

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
				for(int index = 0; index < agenda.contatos.length; index++) {
					if(agenda.contatos[index] == null) {
						Contato contato = criarContato(scan);
						agenda.addContato(contato, index);
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
			
			private static Contato criarContato (Scanner scan) {
				String ERRO = scan.nextLine();
				System.out.print("Digite o nome do contato: ");
				String nome = scan.nextLine();
				System.out.print("Digite o telefone do contato: ");
				String telefone = scan.nextLine();
				System.out.print("Digite o email do contato: ");
				String email = scan.nextLine();
				System.out.println("Digite o endereço do contato");
				System.out.print("Rua: ");
				String rua = scan.nextLine();
				System.out.print("Número: ");
				String numero = scan.nextLine();
				System.out.print("CEP: ");
				String cep = scan.nextLine();
				System.out.print("Cidade: ");
				String cidade = scan.nextLine();
				System.out.print("Estado: ");
				Estados estado = Estados.valueOf(scan.nextLine().toUpperCase());
				Endereco endereco = new Endereco(rua, numero, cep, cidade, estado); 
				Contato contato = new Contato(nome, telefone, email, endereco);
				return contato;
			}
		
	}