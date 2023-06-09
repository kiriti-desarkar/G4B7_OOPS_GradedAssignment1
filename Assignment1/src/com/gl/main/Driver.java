package com.gl.main;

import com.gl.departments.AdminDepartment;
import com.gl.departments.HrDepartment;
import com.gl.departments.TechDepartment;
import com.gl.superdepartment.SuperDepartment;

public class Driver {

	public static void main(String[] args) {

		HrDepartment 	hrDepartment 	= new HrDepartment();
		TechDepartment 	techDepartment  = new TechDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();

		SuperDepartment[] departments = {adminDepartment,hrDepartment,techDepartment};

		display(departments);

	}

	public static void display(SuperDepartment[] departments) {
		for(SuperDepartment department: departments) {

			System.out.println("Welcome to"+ department.departmentName());

			if(department instanceof HrDepartment) {
				HrDepartment hrDepartment = (HrDepartment)department;

				System.out.println(hrDepartment.doActivity());
			}

			System.out.println(department.getTodaysWork());

			System.out.println(department.getWorkDeadline());

			if(department instanceof TechDepartment) {
				TechDepartment techDepartment = (TechDepartment)department;

				System.out.println(techDepartment.getTechStackInformation());
			}

			System.out.println(department.isTodayAHoliday());

			System.out.println();
		}
	}

}
