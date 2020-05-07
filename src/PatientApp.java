import java.util.*;

public class PatientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer,String>smptom= new HashMap<>();
        List listOfSmp = new ArrayList<>();
        ArrayList<Visited>visit = new ArrayList<>();
        ArrayList<Visited> locationVisited = new ArrayList<>();
        ArrayList<Person>people = new ArrayList<>();
        int i = 0;
        // String meet = "yes";
        String has_vesited = "yes";
        int stay;
        String[] symp = {"Fever", "Cough", "Shortness of breath or difficulty breathing", "Tiredness", "Aches", "Chills",
                "Sore throat",
                "Loss of smell",
                "Loss of taste",
                "Headache",
                "Diarrhea",
                "Severe vomiting"};
        listOfSmp = Arrays.asList(symp);
        Address address= new Address();
        Patient patient = new Patient();
        System.out.println("Contact Tracing Program");
        System.out.println("Enter a newly infected person's information");

        System.out.println("What is a patient's name?");
        patient.setName(scanner.nextLine());

        System.out.println("What is a patient's phone number?");
        patient.setPhone_number(scanner.nextLine());
        //scanner.nextLine();
        System.out.println("What is a patient's email?");
        patient.setEmail(scanner.nextLine());
        System.out.println("What place the patient live in");
        address.setPlace(scanner.nextLine());
        System.out.println("What city does a patient live in?");
        address.setCity(scanner.nextLine());
        //patient.getHas_been().setCity(scanner.nextLine());
        System.out.println("What state does a patient live in?");
        address.setState(scanner.nextLine());
        //Person patient1= new Person(address);
        System.out.println();
        patient.setAddress(address);


        while (i < listOfSmp.size()) {
            System.out.println("Does " + patient.getName() + " have any symptom for " + listOfSmp.get(i) + " ?(yes/no)");
            Person person = new Person();
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("How long has  "+patient.getName()+  " had this symptom for?");
                stay = scanner.nextInt();
                smptom.put(stay, (String) listOfSmp.get(i));
                scanner.nextLine();
            }
            i++;
        }
        System.out.println("Has " + patient.getName() + " met or run into anyone? (yes/nes)");
        String meet=scanner.nextLine();
        while (meet.equalsIgnoreCase("yes")) {
            Address address1 = new Address();
            Person person = new Person();
            Visited contact = new Visited();
            if (meet.equalsIgnoreCase("yes")) {
                System.out.println("What is his/her name?");
                person.setName(scanner.nextLine());
                System.out.println("What is his/her phone number?");
                person.setPhone_number(scanner.nextLine());
                System.out.println("What is his/her email?");
                person.setEmail(scanner.nextLine());
                System.out.println("What place he/she live in");
                address1.setPlace(scanner.nextLine());
                System.out.println("What city does he/her live in?");
                address1.setCity(scanner.nextLine());
                System.out.println("What state does he/her live in?");
                address1.setState(scanner.nextLine());
                System.out.println("What city did " + patient.getName() + " see him/her?");
                address1.setCity(scanner.nextLine());
                System.out.println("What state did " + patient.getName() + " see him/her?");
                address1.setState(scanner.nextLine());
                System.out.println("When did Elsa see him/her? (mm/dd/yyyy)");
                address1.setContactDate(scanner.nextLine());

            }
            person.setAddress(address1);
            people.add(person);
            // locationVisited.add(contact);
            System.out.println("Have " + patient.getName() + " met or run into anyone else? (y/n)");
            meet = scanner.nextLine();

        }
        while (has_vesited.equalsIgnoreCase("yes")) {
            Visited visited = new Visited();
            System.out.println("Did " +patient.getName()+ " visited anywhere in pass 14 days? (yes/no)");
            has_vesited=scanner.nextLine();
            if (has_vesited.equalsIgnoreCase("yes")) {
                System.out.println("What is the name of a visited place?");
                visited.setPlace(scanner.nextLine());
                System.out.println("Which city is "+ visited.getPlace() +" located in ?");
                visited.setCity(scanner.nextLine());
                System.out.println("Which state is "+ visited.getPlace() +" located in ?");
                visited.setState(scanner.nextLine());
                System.out.println("When did "+ patient.getName()  +" went to "+ visited.getPlace() +" ? (mm / dd / yyyy)");
                visited.setDate(scanner.nextLine());
                visit.add(visited);
                //patient.setAddress(visited);
                System.out.println("Did "+ patient.getName() +" visited anywhere else in pass 14 days ? (yes / no)");
                has_vesited=scanner.nextLine();
                locationVisited.add(visited);

            }

        }

        System.out.println("***** Contact Tracing Report *****");
        System.out.println(patient.toString());
        System.out.println();
        for (Map.Entry<Integer, String> sm:smptom.entrySet()) {
            System.out.println("had "+ sm.getValue()+ " for "+ sm.getKey()+" days");
        }
        System.out.println();
        System.out.println("**      Contacts:");
        for (Person p:people) {
            System.out.println(p.toString());
            System.out.println();
        }
        System.out.println("**       Locations:\n");
        for (Visited l: locationVisited) {
            System.out.println(l.toString());
        }
    }
}

