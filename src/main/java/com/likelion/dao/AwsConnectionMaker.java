package com.likelion.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class AwsConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws SQLException {
        Map<String, String> env = System.getenv();
        String dbHost=env.get("DB_HOST");
        String dbUser=env.get("DB_USER");
        String dbPw=env.get("DB_PASSWORD");

        Connection conn = DriverManager.getConnection(dbHost,dbUser,dbPw);
        return conn;


    }
}
