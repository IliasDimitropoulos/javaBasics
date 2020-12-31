package com.company;

import java.sql.Connection;

public class ConnectionToDB {
    Connection cnn;
    String dbName = "TestDatabase";
    String url="jdbc:mysql://localhost:3386" + dbName;
    String username = "root";
    String password = "password";

}
