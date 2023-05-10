package contatos;

import java.util.Scanner;

public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	private Endereco endereco;
	
	// Construtor usando Scanner
	public static Contato criarContato (Scanner scan) {
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
	
	// Construtor
	public Contato(String nome, String telefone, String email, Endereco endereco) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.endereco = endereco;
	}
	
	// Getter e Setter (nome)
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	// Getter e Setter (telefone)
	public void setTelefone(String tel) {
		this.telefone = tel;
	}
	public String getTelefone() {
		return telefone;
	}
	
	// Getter e Setter (email)
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return	"-----------Contato------------" + 
				"\nNome: " + nome + 
				"\nTelefone: " + telefone + 
				"\nE-mail: " + email + 
				"\nEndereço" + endereco;
	}
	
}