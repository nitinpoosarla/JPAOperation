package com.telsuko.AppdemoJPA;

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
        System.out.println( "Hello World!" );
        
      /*  Employee e=new Employee();
        e.setId("333");
        e.setName("softeng");
        e.setDesignation("ececec");
        e.setExpertise("esb");*/
       EntityManagerFactory ref=Persistence.createEntityManagerFactory("pu"); 
       EntityManager em=ref.createEntityManager();
       em.getTransaction().begin();  
       Department d1=new Department();
       d1.setDepartmentId(456);
      // d1.setDepartmentName("ece");
     
       
       Student s1=new Student();
       s1.setStudentId(21);
       s1.setStudentName("nitn");
       s1.setDepartment(d1);
       
       
       Student s2=new Student();
       s2.setStudentId(22);
       s2.setStudentName("hasrha");
       s2.setDepartment(d1);
       	
   //    d1.addStudent(s1);
       
      em.persist(d1);
       em.persist(s1);
       em.persist(s2);
       em.getTransaction().commit();  
       em.close();  
       ref.close();
       
    }
}
