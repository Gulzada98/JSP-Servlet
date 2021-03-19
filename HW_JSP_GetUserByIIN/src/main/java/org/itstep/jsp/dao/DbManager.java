package org.itstep.jsp.dao;

import org.itstep.jsp.entity.User;

import java.sql.*;

public class DbManager {

    private static Connection connection;

    private static final String URL = "jdbc:sqlite:C:/Users/Sten/Desktop/STEP/HW_JSP_GetUserByIIN/identifier.sqlite";

    private static final String GET_USER_BY_IIN = "SELECT * FROM USERS where iin = ?";

    static {
        try {
            Class.forName("org.sqlite.JDBC"); // определяем драйвер
            connection = DriverManager.getConnection(URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static User getUserByIIN(String iin) throws SQLException {

        User user = null;

        PreparedStatement statement = connection.prepareStatement(GET_USER_BY_IIN);
        statement.setString(1, iin);
        ResultSet set = statement.executeQuery();

        if (set.next()) {
            user = new User(
                    set.getLong(1),
                    set.getString(2),
                    set.getString(3),
                    set.getString(4),
                    set.getString(5),
                    set.getString(6)
            );
        }

        set.close();
        statement.close();

        return user;
    }
}
