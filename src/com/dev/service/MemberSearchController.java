package com.dev.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberSearchController implements Controller {

	
	public void excute(HttpServletRequest request, HttpServletResponse response)

	String id = request.getParameter("id");
	String job = request.getParameter("job");
	String path = null;
	
	if(job.equals("search"))
		path ="/result/memberSearchOutput.jsp";
	else if (job.equls("update"))
		path = "/memberUpdate.jsp"
}
