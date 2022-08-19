import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Account implements Account_Functions {

    private String name, phone, password;

    public Account(String a, String b, String c) {
        this.name = a;
        this.phone = b;
        this.password = c;

    }

    public Account() {
    }


    @Override
    public String login(String x, String y) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader("accounts.txt"));
        String s, r = "";
        int c = 0;


        String[] parts = new String[3];
        for (; ; ) {
            s = fr.readLine();
            if (s == null) {
                break;
            }
            parts = s.split("  ");

            if (x.equals(parts[0]) && y.equals(parts[2])) {
                r = "\nLogin successful\n";
                Account p = new Account(parts[0], parts[1], parts[2]);
                c++;
                break;
            } else if (x.equals(parts[0]) && !y.equals(parts[2])) {
                c++;
                r = "\nIncorrect Password\n";
            }
        }

        if (c == 0) {
            r = "\nUser Not Found\n";
        }
        fr.close();

        return r;

    }


    @Override
    public String signup(String x, String y, String z) throws IOException, InvalidNumberException {


        try {
            if (y.length() != 11) {

                throw new InvalidNumberException();
            }
        } catch (InvalidNumberException e) {
            return "Invalid Number";
        }


        Account p = new Account(x, y, z);
        BufferedWriter fw = new BufferedWriter(new FileWriter("accounts.txt", true));
        fw.write("\n" + x + "  " + y + "  " + z);
        fw.close();
        return "Account successfully opened";

    }
}
