package org.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.login.SignIn;

public class SignInservice {
	
public static void signIn(String firstName,String lastName,String rollNo,String emailId,String phoneNo,String userName,String passWord)
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	session.beginTransaction();
	SignIn signin = new SignIn();
	signin.getFirstName();
	signin.getLastName();
	signin.getRollNo();
	signin.getEmailId();
	signin.getPhoneNo();
	signin.getUserName();
	signin.getPassWord();
	session.save(signin);
	session.getTransaction().commit();
	session.close();
	
}
}
