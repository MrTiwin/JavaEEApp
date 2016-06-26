package pe.edu.utp.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class JavaEEService {
    //private RegionsEntity regionsEntity;
    //private JobsEntity jobsEntity;
    //private CountriesEntity countriesEntity;
    Connection connection;
    DataSource dataSource;
    private static String DATA_SOURCE = "jdbc/EmpsDataSource";

    public JavaEEService(InitialContext context) {
        try {
            dataSource = (DataSource) context.lookup(DATA_SOURCE);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public boolean connect() {
        if(connection == null) {
            try {
                connection = dataSource.getConnection();
                return(connection != null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public Connection getConnection() {
        if(connection== null) {
            if(!connect()) {
                return null;
            };
        }
        return connection;
    }
}
