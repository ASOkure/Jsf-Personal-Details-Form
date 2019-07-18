/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import java.util.List;

/**
 *
 * @author ao475
 */
public class PersonalDetailManagedBean {
    
    private List title;
    private String  forename;
    private String forename_2;
    private String surname;
    private String professionalSurname;
    private List facultyDepartment;
    private List college;
    private String email; 

    public List getTitle() {
        return title;
    }

    public void setTitle(List title) {
        this.title = title;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getForename_2() {
        return forename_2;
    }

    public void setForename_2(String forename_2) {
        this.forename_2 = forename_2;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfessionalSurname() {
        return professionalSurname;
    }

    public void setProfessionalSurname(String professionalSurname) {
        this.professionalSurname = professionalSurname;
    }

    public List getFacultyDepartment() {
        return facultyDepartment;
    }

    public void setFacultyDepartment(List facultyDepartment) {
        this.facultyDepartment = facultyDepartment;
    }

    public List getCollege() {
        return college;
    }

    public void setCollege(List college) {
        this.college = college;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
