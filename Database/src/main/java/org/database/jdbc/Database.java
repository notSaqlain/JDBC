/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package org.database.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author khalid.saq.2005
 */
public class Database {

    public static void connect() {
        // connection string
        var url = "jdbc:sqlite:Data/italia.db";

        try (var conn = DriverManager.getConnection(url)) {
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        connect();
    }
}



