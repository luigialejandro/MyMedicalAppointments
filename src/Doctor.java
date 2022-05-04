import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //atributos

    private String speciality;

    Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del Doctor asignado es: " +name);
        //id++;  //este identificador se usaba antes
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //quito esta alternativa de constructor, pues acabo de aplicar herencia
    //Doctor(){
    //    System.out.println("Construyendo el Objeto Doctor");
    //}



    //Comportamientos




    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    //mi clase anidada estática
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
