package pe.edu.utp.models;

import java.util.Date;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class Employee {
    private int id;
    private Date birth_date;
    private String f_name;
    private String l_name;
    private String gender;
    private Date hire_date;

    public Employee(int id, Date birth_date, String f_name, String l_name, String gender, Date hire_date) {
        this.setId(id);
        this.setBirth_date(birth_date);
        this.setF_name(f_name);
        this.setL_name(l_name);
        this.setGender(gender);
        this.setHire_date(hire_date);
      }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
}
