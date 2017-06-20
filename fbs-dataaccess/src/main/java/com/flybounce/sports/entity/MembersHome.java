package com.flybounce.sports.entity;
// Generated Jun 18, 2017 11:38:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Members.
 * @see com.flybounce.sports.dataaccess.fbs_dataaccess.entity.Members
 * @author Hibernate Tools
 */
public class MembersHome {

	private static final Log log = LogFactory.getLog(MembersHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Members transientInstance) {
		log.debug("persisting Members instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Members instance) {
		log.debug("attaching dirty Members instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Members instance) {
		log.debug("attaching clean Members instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Members persistentInstance) {
		log.debug("deleting Members instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Members merge(Members detachedInstance) {
		log.debug("merging Members instance");
		try {
			Members result = (Members) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Members findById(com.flybounce.sports.entity.MembersId id) {
		log.debug("getting Members instance with id: " + id);
		try {
			Members instance = (Members) sessionFactory.getCurrentSession()
					.get("com.flybounce.sports.dataaccess.fbs_dataaccess.entity.Members", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Members instance) {
		log.debug("finding Members instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.flybounce.sports.dataaccess.fbs_dataaccess.entity.Members")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
