package com.test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.entity.Cat;
import com.service.CatService;


public class TestFun {

	@Test
	public void testAddCat() {
		
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		CatService catService = (CatService)factory.getBean("CatService");
		Cat cat = new Cat();
		cat.setName("test");
		catService.Save(cat);
		
//		@SuppressWarnings("deprecation")
//		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		CatDao catDao = (CatDao)factory.getBean("catDao");
//		
//		Cat cat = new Cat();
//		cat.setName("kit4");
//		
//		catDao.show(cat);
//		
//		catDao.addCat(cat);
//		System.out.println("success");
		
//		
//		Session session = HibernateSessionFactory.getSession();
//		System.out.println(session.isOpen());
	}

}
