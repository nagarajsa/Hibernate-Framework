package Hybernate_Dynamic;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Mainclass 
{

	public static void main(String[] args) 
	{
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
        EntityTransaction  et=em.getTransaction();
        
        Simple s=new Simple();
        Scanner sc=new Scanner(System.in);
        //1]ADDING OBJECTS TO DB
//        System.out.println("Enter your ID:");
//        s.setID(sc.nextInt());
//        System.out.println("Enter your Name:");
//        s.setNAME(sc.next());
//        System.out.println("Enter your Phone_No:");
//        s.setPHONE_NO(sc.nextLong());
//        System.out.println("Enter your Gender:");
//        s.setGENDER(sc.next());
        
        
        //2] FETCHING DATA TO DB
//            System.out.println("Enter Your ID:");
//            Simple n=em.find(Simple.class, sc.nextInt());
//            System.out.println(n);

        //FETCHING ALL DATA FROM DB
//          Query r=em.createQuery("select t from Simple t");
//          List  l=r.getResultList();
//          for(Object x:l)
//          {
//        	  System.out.println(x);
//          }
     
        
        
        //3]UPDATE
//        System.out.println("Enter your ID:");        
//        Simple u=em.find(Simple.class, sc.nextInt());
//        System.out.println("Enter Your New Number:");
//        u.setPHONE_NO(sc.nextLong());
       
        
        
        
        
        et.begin();
        
       // em.merge(u);
       // em.persist(s);
        
       
        
        
        
        
        
        
        //4]REMOVE
//        System.out.println("Enter your ID:");
//        Simple r=em.find(Simple.class, sc.nextInt());
//        em.remove(r);
        
        
        
        //remove All Object
//        Query d=em.createQuery("delete from Simple");
//        d.executeUpdate();
        
        
        et.commit();
        
        System.out.println("project done...!");
	}

}
