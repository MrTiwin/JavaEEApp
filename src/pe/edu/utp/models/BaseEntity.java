package pe.edu.utp.models;

import java.sql.Connection;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class BaseEntity {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
