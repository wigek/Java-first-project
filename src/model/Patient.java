package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    // int id;
    // private String name;
    // private String email;
    // private String phoneNumber;
    // private String address;

    //Atributos
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email){
        super(name, email);
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + " Kg.";
    }

    public String getHeight(){
        return height+ " Mts.";
    }

    public void setHeight(Double height){
        this.height = height;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ "\nAgre: "+ birthday+ "\n Weight: "+ getWeight()+ "\n Height"+ getHeight()+ "\n Blood:  "+ blood;
    }

    @Override
    public  void showDataUser(){
        System.out.println("Paciente");
        System.out.println("Historial completo desde 2019");
    }

        //TODOS ESTOS DATOS LOS TRAJIMOS DE LA HERENCIA 
//     public int getId(){
//         return id;
//     }

//     public void setId(int id){
//         this.id = id;
//     } 

//     public String getName(){
//         return name;
//     }

//     public void setName(String name){
//         this.name = name;
//     }

//     public String getEmail(){
//         return email;
//     }

//     public void setEmail(String email){
//         this.email = email;
//     }

//     public String getBirthday(){
//         return birthday;
//     }

//     public void setBirthday(String birthday){
//         this.birthday = birthday;
//     }


//     public String getBlood(){
//         return blood;
//     }

//     public void setBlood(String blood){
//         this.blood = blood;
//     }

//     public String getPhoneNumber(){
//         return phoneNumber;
//     }

//     public void setPhoneNumber(String phoneNumber){
//         if(phoneNumber.length()>8){
//             System.out.println("El número telefonico debe ser de ocho digitos  ");
//         }else if(phoneNumber.length()==8){
//             this.phoneNumber=phoneNumber;
//         }
//     }

//     public String getAddress(){
//         return address;
//     }

//     public void setAddress(String address){
//         this.address = address;
//     }
}
