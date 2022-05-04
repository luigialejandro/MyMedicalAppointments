public class Patient extends User {

    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name, email);
        this.weight = 54.5;
        System.out.println(weight + "kg");
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + "kg";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + "m";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
