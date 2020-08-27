/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientManagement;

/**
 *
 * @author Hsaun
 */

public class User {
    public static User[] users;
    
    private String ID;
    private String Permissions;
    private String Forename;
    private String Surname;
    private String Address;
    private String Gender;
    private String DOB;

    public User(String ID, String Permissions, String Forename, String Surname, String Address, String Gender, String DOB) {
        this.ID = ID;
        this.Permissions = Permissions;
        this.Forename = Forename;
        this.Surname = Surname;
        this.Address = Address;
        this.Gender = Gender;
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPermissions() {
        return Permissions;
    }

    public void setPermissions(String Permissions) {
        this.Permissions = Permissions;
    }

    public String getForename() {
        return Forename;
    }

    public void setForename(String Forename) {
        this.Forename = Forename;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }  
    
    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    public void addUser(User addeduser){
        int i = users.length;
        users[i] = addeduser;
}
}

