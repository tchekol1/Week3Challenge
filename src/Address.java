public class Address {
    private String place;
    private String city;
    private String state;
    private String contactDate;

    public Address() {
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public Address(String place, String city, String state) {
        this.place = place;
        this.city = city;
        this.state = state;
    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                "\nplace: " + place + "\n" +
                "City: " + city + "\n" +
                "State: " + state;
    }


}
