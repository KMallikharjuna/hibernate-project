package com.lpa.ems.employee;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	Configuration config = new Configuration();
        	config.configure("hibernate.cfg.xml");
        	SessionFactory factory = config.buildSessionFactory();
        	Session session = factory.openSession();
        	System.out.println("DB Connected successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
