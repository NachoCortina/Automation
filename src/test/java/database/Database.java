package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.UsuarioDataBase;

public class Database {

    public static UsuarioDataBase conexiondb() throws ClassNotFoundException, SQLException {

        UsuarioDataBase usuarioDB = new UsuarioDataBase();

        String dbUrl = "jdbc:mysql://localhost:3306/db";
        String username = "Nacho";
        String passwordDB = "8356";
        String query = "select * from employee;";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(dbUrl, username, passwordDB);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {

            usuarioDB.setSimpleName((rs.getString(1)));
            usuarioDB.setName(rs.getString(2));
            usuarioDB.setPassword(rs.getString(3));
            usuarioDB.setDay(rs.getString(4));
            usuarioDB.setMonth(rs.getString(5));
            usuarioDB.setYear(rs.getString(6));
            usuarioDB.setLastName(rs.getString(7));
            usuarioDB.setStreet(rs.getString(8));
            usuarioDB.setCountry(rs.getString(9));
            usuarioDB.setState(rs.getString(10));
            usuarioDB.setCity(rs.getString(11));
            usuarioDB.setZipcode(rs.getString(12));
            usuarioDB.setNumber(rs.getString(13));

        }

        con.close();
        return usuarioDB;

    }
}
