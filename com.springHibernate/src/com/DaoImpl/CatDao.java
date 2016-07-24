package com.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Cat;
/**
 * 
 * @author Kone
 *
 */

public class CatDao{
	SessionFactory sessionFactory;
	Session session;
	/**
	 * 添加猫
	 * @author Kone
	 * @param Cat cat
	 * @return 无
	 */
	public void addCat(Cat cat){
		session = this.sessionFactory.openSession();;
		session.saveOrUpdate(cat);
		session.close();
		
	}
	/**
	 * 查找所有的猫
	 * @author Kone
	 * @Time 
	 * @return list<Cat>
	 */
	public List<Cat> lisCat(){
		session = this.sessionFactory.openSession();;
		List<Cat> catList = null;
		catList = session.createQuery("from Cat").list();
		session.close();
		return catList;
	}
	public void show(Cat cat){
		System.out.println(cat.getName());
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
