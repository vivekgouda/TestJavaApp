package com.altimetrik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		String id = "id1"; 
        String pwd = "password"; 
        try
        { 
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); 
            Statement stmt = con.createStatement(); 
              
            // SELECT query 
            String q1 = "select * from userid WHERE id = '" + id + "' AND pwd = '" + pwd + "'"; 
            ResultSet rs = stmt.executeQuery(q1); 
            if (rs.next()) 
            { 
                System.out.println("User-Id : " + rs.getString(1)); 
                System.out.println("Full Name :" + rs.getString(3)); 
                System.out.println("E-mail :" + rs.getString(4)); 
            } 
            else
            { 
                System.out.println("No such user id is already registered"); 
            } 
            con.close(); 
        } 
        catch(Exception e) 
        { 
            System.out.println(e); 
        }

	}

}
