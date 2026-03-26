package org.database.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;


public class sql {
    public static void main(String[] args) {
        var url = "jdbc:sqlite:Data/italia.db";
        var sql = "SELECT cod, des FROM comune";

        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.createStatement();
             var rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.printf("%d - %s \n",
                        rs.getInt("cod"),
                        rs.getString("des")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}