package model;
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El número telefonico debe ser de ocho digitos  ");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }


    //sobre escritura de metodos
    //el @override es como que traemos un metodo de una clase padre por defecto que se llama Objects
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "User: " +name + ", Email:"+ email+ "\nAddreess: "+ address+ ". Phone:"+ phoneNumber ;
    }

    public abstract void showDataUser();


}

