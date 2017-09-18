package com.SprHibMySQL;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.model.Employee;


	@Controller
	public class FirstController {
		
	@Autowired
	SessionFactory sf;

	
	// RETRIEVE THE DATA FROM DATABASE
	@RequestMapping("/sam")	
	public String show(HttpServletRequest request, HttpServletResponse response,ModelMap mp)
	{
		
		
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		Employee emp= (Employee)sf.openSession().get(Employee.class, i);
		
		if(emp!=null && emp.getDept()==j)
		{
		mp.put("key", emp);
		
		return "HelloSampath";
		}
		else
		return "3rd";
		
	}
	
	
	// INSERT THE DATA INTO DATABASE
/*	@RequestMapping("/akshay")	
	public String show22()
	{		
		Employee k = new Employee(0, null, 0, null);
		k.setId(3);k.setManager("CCC");
		k.setDept(30);k.setName("CAT");
		
		//(Circle)sf.openSession().save(k);
		return "NewFile";
	}*/
}


