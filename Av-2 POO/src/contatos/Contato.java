package contatos;

public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	private Endereco endereco;
	
	//Construtor
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
		return 	"-----------Contato------------" + 
				"\nNome: " + nome + 
				"\nTelefone: " + telefone + 
				"\nE-mail: " + email + 
				"\nEndereço" + endereco;
	}
	
}