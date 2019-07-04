package com.altimetrik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	public static void main(String[] args) throws SQLException{
		try
        { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
               
            Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); 
  
            if (con != null)              
                System.out.println("Connected");             
            else            
                System.out.println("Not Connected"); 
              
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        } 
	}
}
