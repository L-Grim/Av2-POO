package agenda;

import contatos.Contato;

public class Agenda {
	
	Contato contatos[] = new Contato[20];
	
	public void addContato(Contato contato, int index) {
		contatos[index] = contato;
	}
	
	public void listarContatos() {
		System.out.println("------------------------------");
		for (int index = 0; index < contatos.length; index++) {
			if (contatos[0] == null) {
				System.out.println("A agenda está vazia.");
			} else if(contatos[index] == null) {}
			else {
				System.out.println(contatos[index]);
				System.out.println("------------------------------");
			}
		}
	}
}