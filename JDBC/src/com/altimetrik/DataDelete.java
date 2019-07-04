package com.altimetrik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataDelete {

	public static void main(String[] args) {
		String id = "id1"; 
        String pwd = "vivek"; 
        try
        { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = con.createStatement(); 
                   
            String q1 = "DELETE from userid WHERE id = '" + id + "' AND pwd = '" + pwd + "'"; 
                      
            int x = stmt.executeUpdate(q1); 
              
            if (x > 0)             
                System.out.println("One User Successfully Deleted");             
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
