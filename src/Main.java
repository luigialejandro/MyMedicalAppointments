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

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");


        System.out.println(patient);
    }
}
