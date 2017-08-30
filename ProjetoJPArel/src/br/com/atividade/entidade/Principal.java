package br.com.senai.entidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pteste");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Notebook notebook = new Notebook();
		notebook  = entityManager.find(Notebook.class, 1);
		System.out.println("O item: "+notebook.toString());
		
		entityManager.remove(notebook);//remove o objeto
		//notebook.setId(1);
		//notebook.setNumeroSerial("ABCDEF");
		//notebook.setMemoriaRam(128);
		//notebook.setHD(1000);
		
		//entityManager.persist(notebook);//Inserindo o objeto
		//entityManager.merge(notebook); //Update
		
		entityManager.getTransaction().commit();
		factory.close();
		System.out.println("Executado com sucesso!");
	}

}
