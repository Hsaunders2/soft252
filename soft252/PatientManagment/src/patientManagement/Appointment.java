/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientManagement;
import java.io.*;
/**
 *
 * @author Hsaun
 */
public class Appointment implements Serializable{
    private int doctorID;
    private int patientID;
    private String date;
        
    public static class CreateAppointment
    {
        private int doctorID;
        private int patientID;
        private String date;
        
        public CreateAppointment(int doctorID,int patientID, String date)
        {
            this.doctorID = doctorID;
            this.patientID = patientID;
            this.date= date;
        }
        public Appointment build(){
            return new Appointment(this);
        }
    }    
    
    private Appointment(CreateAppointment createAppointment)
    {
        this.doctorID = createAppointment.doctorID;
        this.patientID = createAppointment.patientID;
        this.date = createAppointment.date;
    }
    public int getDoctorID(){
        return this.doctorID;
    }
    public int getPatientID() {
        return this.patientID;
    }
    public String getDate() {
        return this.date;
    }
}