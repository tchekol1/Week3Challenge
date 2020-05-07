import java.util.Date;

public class Visited extends Address {

    String date;

public Visited(){
    super();
}

    public Visited(String date) {
        this.date = date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String has_met(){
    return date;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nDate:" + date;
    }
}
