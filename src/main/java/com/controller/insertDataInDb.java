package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertDataInDb {
   static final String DB_URL = "jdbc:mysql://localhost:3306//login21";
   static final String USER = "root";
   static final String PASS = "";

   public static void insert() {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO  table1('100', 'Zara')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO table1 ('101', 'Mahnaz')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO table1 ('102', 'Zaid')";
         stmt.executeUpdate(sql);	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
