package com.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   public static void main(String[] args) {
      // Open a connection
	   System.out.print(true && true);
	   Connection conn=null;
	   Statement stmt=null;
	   
	   try {
           //STEP 2: Register JDBC driver
		   
           Class.forName("com.mysql.cj.jdbc.Driver");
           //STEP 3: Open a connection
           String DB_URL ="jdbc:mysql://127.0.0.1:3306/login21?useSSL=false";
           //  Database credentials
           String USER1 = "root";
           String PASS ="o@geng2000";
           conn = DriverManager.getConnection(DB_URL, USER1, PASS);
           System.out.print("CONNECTED SUCCESFULLY");
           //STEP 4: Execute a query
           stmt = conn.createStatement();
           String query1 = "INSERT INTO table1 " + "VALUES ('user541', 'peace')";
          stmt.execute(query1);
          System.out.print("done for the day");
       } catch (SQLException se) {//Handle errors for JDBCse.printStackTrace();
       } catch (Exception e) {
           e.printStackTrace();
       } finally {//finally block used to close resources
           try {
               if (stmt != null)
                   conn.close();
           } catch (SQLException se) {se.printStackTrace();
           }// do nothing
           try {
               if (conn != null)
                   conn.close();
           } catch (SQLException se) {
               se.printStackTrace();
           }//end finally try
       }
   }
}