package com.flybounce.sports.dataaccess;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDAOUtil {
	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		// TODO Auto-generated method stub
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			// TODO: handle exception
			System.err.println("Initial SessionFactory creation failed" + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}
	
	
}

