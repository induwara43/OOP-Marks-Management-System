/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopmarks;
import java.lang.invoke.MethodHandles;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author induw
 */
public class marksCRUD{
    Connection con;
     int count;
      public int addMarks(Students student){
          
  
           con = DBconnection.createDBcConnection();
       String query = "Insert into results values(?,?,?,?,?)";
        try {
            PreparedStatement update = con.prepareStatement(query);
            update.setInt(1, student.getId());
            update.setString(2, student.getName());
            update.setInt(3, student.getCa());
            update.setInt(4, student.getPractical());
            update.setInt(5, student.getTheory());
            count = update.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    
    public ResultSet viewmarks(){
         ResultSet result=null;
    con = DBconnection.createDBcConnection();
        String query = "Select * from results";
        try {
            Statement sview = con.createStatement();
            result = sview.executeQuery(query);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public int deleteMarks(int id){
        
        con = DBconnection.createDBcConnection();
        String query = "delete from results where sid="+id;
        try {
            PreparedStatement mdelete = con.prepareStatement(query);
            count = mdelete.executeUpdate();
        } catch (Exception e) {
           e.printStackTrace();
        }
        return count;
    }
}
  

  