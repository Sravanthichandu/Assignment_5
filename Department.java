package com.java.Department;

public class Department {
	private int Department_id;
	private String Department_name;

    public Department(int Department_id,String Department_name )
    {
    	this.Department_id=Department_id;
	    this.Department_name=Department_name;
    }
	public int getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(int department_id) {
		Department_id = department_id;
	}
	public String getDepartment_name() {
		return Department_name;
	}
	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}
	@Override
	public String toString() {
		return "Department [Department_id=" + Department_id + ", Department_name=" + Department_name + "]";
	}
    
}
