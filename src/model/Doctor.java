package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;



public  class Doctor extends User  {
    // static int id=0; //Tiene que ser autoincrementado
    // private String name;
    // private String phoneNumber;
    // private String address;
    // private String email;

    //Atributo ùnico sin heredar
    private String speciality;
    private ArrayList<AvailableAppointament>availableAppointaments= new ArrayList<>();

    public Doctor(String name, String email){
        super(name, email);
    }

    // //metodos
    // public void showName(){
    //     System.out.println(name);
    // }

    // public void showId(){
    //     System.out.println("ID doctor: "+ id);
    // }

    public String getSpeciality(){
        return this.speciality;
    }
    public void setSpeciality(String speciality){
        this.speciality=speciality;
    }

    //colleción
    
    //este metodo es para añadir las citas en base a la clase que creamos abajo
    public void addAvailableAppointment(String date, String time){

        availableAppointaments.add(new Doctor.AvailableAppointament(date, time));
    }
    //este metodo nos ayuda a devolver las citas creadas arriba
    public ArrayList<AvailableAppointament> getAvailableAppointments(){
        return availableAppointaments;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ "\n Speciality:"+ speciality+"\n Avalable: "+ availableAppointaments.toString();
    }

    @Override
    public void showDataUser(){
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Cancerología");
    }

    //clase anidada estatica
    public static class AvailableAppointament{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointament(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }    
            this.time = time;
        }

        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id=id;
        }

        public Date getDate(String DATE){
            return date;
        }

        public String getDate(){
            return format.format(date);
        }

        public void setDate(Date date){
            this.date=date;
        }

        public String getTime(){
            return time;
        }
        public void setTime(String time){
            this.time=time;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Available Appointments \n Date:"+ date+"\n Time: "+ time;
        }

    }

}
