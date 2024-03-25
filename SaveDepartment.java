package com.java.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class SaveDepartment {


	public static void main(String[] args) throws SQLException{
		
		 
		Department department_obj = new Department(1,"IT");
		
		try {

            Connection connection = null;
			

			Connection connection = DatabaseConnection.getDBConnection();
			
			
			//string query for insert
			
			String query = "insert into department(department_id,department_name) values (?,?)";
		    
			PreparedStatement preparedStatement1 = connection.prepareStatement(query);
			
			preparedStatement1.setInt(1, department_obj.getDepartment_id());
			
			preparedStatement1.setString(2, department_obj.getDepartment_name());
			
			//query statement object
			PreparedStatement prepareStatement  = connection.prepareStatement(query);
			
			
			//execute query statement
			int status = prepareStatement.executeUpdate(query);
			System.out.println(status+"employee object stored in the database table");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
		
			connection.close();
			
		}
	}
}
