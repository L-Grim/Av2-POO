package contatos;

public class Endereco {
	
	private String rua;
	private String numero;
	private String cep;
	private String cidade;
	private Estados estado;
	
	//Construtor
	public Endereco(String rua, String numero, String cep, String cidade, Estados estado) {
		this.setRua(rua);
		this.setNumero(numero);
		this.setCep(cep);
		this.setCidade(cidade);
		this.setEstado(estado);	
		}
	
	// Getter e Setter (rua)
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getRua() {
		return rua;
	}

	// Getter e Setter (numero)
	public void setNumero(String num) {
		this.numero = num;
	}
	public String getNumero() {
		return numero;
	}
	
	// Getter e Setter (cep)
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCep() {
		return cep;
	}
	
	// Getter e Setter (cidade)
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return cidade;
	}
		
	// Getter e Setter (estado)
	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	public Estados getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return 	"\nRua: " + rua + 
				"\nNumero: " + numero + 
				"\nCEP: " + cep + 
				"\nCidade: " + cidade + 
				"\nEstado: " + estado;
	}
	
	
	
}
