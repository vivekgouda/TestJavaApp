package com.altimetrik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataUpdate {

	public static void main(String[] args) {
		String id = "id1"; 
        String pwd = "password";  
        String newPwd = "vivek"; 
        try
        { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = con.createStatement(); 
           
            String q1 = "UPDATE userid set pwd = '" + newPwd + "' WHERE id = '" +id+ "' AND pwd = '" + pwd + "'"; 
            int x = stmt.executeUpdate(q1); 
              
            if (x > 0)             
                System.out.println("Password Successfully Updated");             
            else            
                System.out.println("ERROR OCCURED :("); 
              
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        }

	}

}
