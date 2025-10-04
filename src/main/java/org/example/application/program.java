package org.example.application;

import org.example.entity.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class program {
    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa("Gui", null, "Gui@gmail.com");
//        Pessoa p3 = new Pessoa("Gusta", null, "Gusta@gmail.com");
//        Pessoa p2 = new Pessoa("Gab", null, "Gab@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin(); //iniciar uma transaçao com o bd
//
//        em.persist(p1); //pega um obj e salva no banco
//        em.persist(p2);
//        em.persist(p3);
//
//        em.getTransaction().commit(); //confirma transaçoes

//        Pessoa p = em.find(Pessoa.class, 1);
//        System.out.println(p);

        Pessoa p = em.find(Pessoa.class, 2);

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pessoa Criado com sucesso!");
        em.close();
        emf.close();


    }
}
