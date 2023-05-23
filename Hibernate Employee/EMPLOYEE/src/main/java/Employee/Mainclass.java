package Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Mainclass 
{

	public static void main(String[] args) 
	{
		//Hibernate steps for loading persistence file and CRUD operation
	   EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	   EntityManager entityManager=entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction=entityManager.getTransaction();
       
       //Insert
//        Emp emp=new Emp();
//            emp.setEmp_name("NAVEEN");
//            emp.setEmp_id(1);
//       
//       Emp emp1=new Emp();
//           emp1.setEmp_name("NAGU");
//           emp1.setEmp_id(2);
//       
//       Emp emp2=new Emp();
//          emp2.setEmp_name("RAJU");
//          emp2.setEmp_id(3);
          
        
       
      //update
      //Emp s=entityManager.find(Emp.class, "RAJU");
      //s.setEmp_id(7);
      
       
       
       //remove
//       Emp s=entityManager.find(Emp.class, "NAGU");
//       entityManager.remove(s);
       
       
       
         
         //fetch
//       Emp s1=entityManager.find(Emp.class, "NAGU");
//       System.out.println(s1);  
      
   
      
       
       //fetchALL
         Query q=entityManager.createQuery("Select t from Emp t");
         List r=q.getResultList();
         for(Object x:r)
         {
        	 System.out.println(x);
         }

//       entityTransaction.begin();
//       entityManager.persist(s);
//       entityTransaction.commit();
 
	}

}
