package com.gl.departments;

import com.gl.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	
	@Override 
	public String departmentName() {
		 String departmentName = " Tech Department";
		 return departmentName;
	}
	
	@Override
	public String getTodaysWork() {
		 String todaysWork = "Complete coding of Module 1";
		 return todaysWork;
	}
	 
	@Override
	public String getWorkDeadline() {
		 String workDeadline = "Complete by EOD ";
		 return workDeadline;
	}
	
	public String getTechStackInformation() {
		 String techStack = "Core Java";
		 return techStack;
	}

}
