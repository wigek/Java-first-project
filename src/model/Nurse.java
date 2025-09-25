package model;


public class Nurse  extends User{
    private String speciality;


    public String getSpeciality() {
        return speciality;
    }

    @Override
    public  void showDataUser(){
        System.out.println("Hospital: Cruz verde");
        System.out.println("Departamentos: cancerología, nutreología, pedriatría");
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Nurse(String name,String email){
        super(name,email);
    }
    
}
