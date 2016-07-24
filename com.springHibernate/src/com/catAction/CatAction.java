package com.catAction;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.entity.Cat;
import com.service.CatService;
import com.superAction.SuperAction;
public class CatAction extends SuperAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	@Autowired
	CatService catService;
	public CatAction() {
		super();
		
	}
	
	public String SaveCat(){
		System.out.println(name);
		Cat cat = new Cat();
		cat.setName(name);
		catService.Save(cat);
		return "success";
	}
	
	/**
	 * 获取数据库数据
	 * @return
	 */
	public String listCat(){
		List<Cat> list = catService.cat();	
		request.getSession().setAttribute("list", list);
		for(Cat lt : list){
			System.out.println(lt.getName());
		}
		return "success";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public CatService getCatService() {
		return catService;
	}

	public void setCatService(CatService catService) {
		this.catService = catService;
	}
	
	
}
