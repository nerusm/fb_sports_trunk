package com.flybounce.sports.dataaccess;
import org.apache.logging.log4j.*;
import org.hibernate.Session;

import com.flybounce.sports.dataaccess.HibernateDAOUtil;
/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Session session = HibernateDAOUtil.getSessionFactory().openSession();
        runMe("Suren");
    }
    
    public static void runMe(String parameter) {
    	
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}

		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		
	}
}
