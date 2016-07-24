package com.superAction;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

public class SuperAction  extends HttpServlet implements ServletRequestAware,ServletContextAware,ServletResponseAware {
	
	protected HttpServletResponse response;
	protected ServletContext applicaction;
	protected HttpServletRequest request;
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletContext(ServletContext applicaction) {
		this.applicaction = applicaction;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	

}
