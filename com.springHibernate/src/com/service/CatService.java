package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DaoImpl.CatDao;
import com.entity.Cat;
@Service("catService")
public class CatService {
	@Autowired
	private CatDao catDao;

	
	public void Save(Cat cat){
		catDao.addCat(cat);
	}
	
	public List<Cat> cat(){
		return catDao.lisCat();
	}
	
	
	public CatDao getCatDao() {
		return catDao;
	}

	public void setCatDao(CatDao catDao) {
		this.catDao = catDao;
	}
	
	
}
