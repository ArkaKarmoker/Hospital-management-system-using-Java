import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static String printDoctors() throws IOException {
        BufferedReader temp = new BufferedReader(new FileReader("doctors.txt"));

        String r = "";
        String s = temp.readLine();
        while ((s = temp.readLine()) != null) {
            String[] parts = s.split("  ");
            Doctor x = new Doctor(parts[0], parts[1], parts[2], parts[3]);
            r = r + s + "\n";
        }
        temp.close();
        return r;

    }

    public static String printPatients() throws IOException {
        BufferedReader temp = new BufferedReader(new FileReader("patients.txt"));
        Patient[] a = new Patient[20];
        Patient[] na = new Patient[20];
        int c1 = 0, c2 = 0;
        String r = "";

        String s = temp.readLine();

        while ((s = temp.readLine()) != null) {
            String[] parts = s.split("  ");
            Patient x = new Patient(parts[0], parts[1], parts[2], parts[3]);
            if (x.getStatus().equals("Admitted")) {
                a[c1] = x;
                c1++;
            } else {
                na[c2] = x;
                c2++;
            }

        }
        temp.close();

        r = "\nAdmitted Patients:\n";
        for (int i = 0; i < c1; i++) {
            r = r + a[i].getName() + "\n" + a[i].getPhone() + "\n" + a[i].getDisease() + "\n";
        }
        r = r + "Not admitted Patients:\n";
        for (int i = 0; i < c2; i++) {
            r = r + na[i].getName() + "\n" + na[i].getPhone() + "\n" + na[i].getDisease() + "\n";
        }
        return r;
    }


    public String printInformation() throws IOException {
        BufferedReader temp = new BufferedReader(new FileReader("information.txt"));

        String s, t = "";
        while ((s = temp.readLine()) != null) {
            t = t + s + "\n";
        }
        temp.close();

        return t;
    }

}
	



