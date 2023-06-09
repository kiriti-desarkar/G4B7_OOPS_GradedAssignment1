package com.gl.departments;

import com.gl.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment{

	@Override 
	public String departmentName() {
		 String departmentName = " Admin Department";
		 return departmentName;
	}
	
	@Override
	public String getTodaysWork() {
		 String todaysWork = "Complete your document submission";
		 return todaysWork;
	}
	 
	@Override
	public String getWorkDeadline() {
		 String workDeadline = "Complete by EOD ";
		 return workDeadline;
	}
	 
}
