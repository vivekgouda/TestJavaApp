package com.altimetrik;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataInsert {
	public static void main(String[] args) {

        String id = "id2"; 
        String pwd = "password"; 
        String fullname = "Akshay A"; 
        String email = "akshay@altimetrik.com"; 
          
        try
        { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); 
            Statement stmt = con.createStatement(); 
              
            String q1 = "insert into userid values('" +id+ "', '" +pwd+ "', '" +fullname+ "', '" +email+ "')"; 
            int x = stmt.executeUpdate(q1); 
            if (x > 0)             
                System.out.println("Successfully Inserted");             
            else            
                System.out.println("Insert Failed"); 
              
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 

	}
}
