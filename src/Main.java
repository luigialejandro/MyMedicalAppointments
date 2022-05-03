import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args){

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");

        myDoctor.addAvailableAppointment(new Date(), "4 PM");
        myDoctor.addAvailableAppointment(new Date(), "10 AM");
        myDoctor.addAvailableAppointment(new Date(), "1 PM");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+""+aA.getTime());
        }

        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

        /*Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());*/
    }
}
