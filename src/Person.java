import java.util.ArrayList;

public class Person {
    private String name;
    private String phone_number;
    private String email;
    private Address address;

    public Person() {
    }

    public Person(String name, String phone_number, String email) {
        this.name=name;
        this.phone_number = phone_number;
        this.email = email;
    }

    public Person(Address address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return new Address(address.getPlace(),address.getCity(),address.getState());
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + "\n"+
                "Phone_number: " + phone_number + "\n" +
                "email:" + email + address.toString()+ " "+ address.getPlace()+ address.getCity();
    }
}