package com.jlogics.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_mysql_dbwork");
        EntityManager em = emf.createEntityManager();
        Student s1 = em.find(Student.class, 10);
        System.out.println(s1);
        
        Student s2 = new Student(20, "Pokri");
        
        em.getTransaction().begin();
        em.persist(s2);
        em.getTransaction().commit();
                
        Student s3 = em.find(Student.class, 20);
        System.out.println(s3);
        
        
    }
}
