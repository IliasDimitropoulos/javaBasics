package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            String dbName = "databasetest1";
            String url = "jdbc:mysql://127.0.0.1:3306/" + dbName;
            String username = "root";
            String password = "password";
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnn = DriverManager.getConnection(url, username, password);
            Statement stmt = cnn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bonus");

            while (rs.next()) {
                System.out.println(rs.getString("WORKER_REF_ID"));
            }


            cnn.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
