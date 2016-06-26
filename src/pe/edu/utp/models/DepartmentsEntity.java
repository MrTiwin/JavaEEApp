package pe.edu.utp.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class DepartmentsEntity extends BaseEntity{
    private static String DEFAULT_QUERY = "SELECT * FROM departments";

    public List<Departments> findAll() {
        String query = DEFAULT_QUERY;
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            List<Departments> departments = new ArrayList<>();
            while(rs.next()) {
                Departments department = new Departments(
                        rs.getString("dept_no"),
                        rs.getString("dept_name")
                );
                departments.add(department);
            }
            return departments;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
