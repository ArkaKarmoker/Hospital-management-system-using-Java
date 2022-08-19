public class Patient extends Person {

    private String name, phone, disease, status;

    public Patient(String a, String b, String c, String d) {
        this.name = a;
        this.phone = b;
        this.disease = c;
        this.status = d;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }

    public String getDisease() {
        return disease;
    }

    public String getStatus() {
        return status;
    }

}
