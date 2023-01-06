/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopmarks;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author induw
 */
public class DBconnection {
    static Connection con;
    public static Connection createDBcConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/oopresults?useSSL=false";
            String username="root";
            String password="sql1234";
            con = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }return con;
    }
}
