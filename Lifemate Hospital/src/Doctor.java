public class Doctor extends Person {

    private String name, phone, email, department;

    public Doctor(String a, String b, String c, String d) {
        this.name = a;
        this.phone = b;
        this.email = c;
        this.department = d;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return email;
    }


    public String getDepartment() {
        return department;
    }
}
