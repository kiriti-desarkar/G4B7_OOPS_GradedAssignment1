package com.gl.departments;

import com.gl.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment{
	
	@Override 
	public String departmentName() {
		 String departmentName = " Hr Department";
		 return departmentName;
	}
	
	@Override
	public String getTodaysWork() {
		 String todaysWork = "Fill Today's timesheet and mark your attendance";
		 return todaysWork;
	}
	 
	@Override
	public String getWorkDeadline() {
		 String workDeadline = "Complete by EOD ";
		 return workDeadline;
	}
	
	public String doActivity() {
		 String activity = "team Lunch";
		 return activity;
	}

}
