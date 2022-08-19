import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ButtonHandler extends GUI implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == li) {

            Account t = new Account();
            x = textField1.getText();
            y = textField2.getText();
            try {
                String r = t.login(x, y);
                if (r == "\nLogin successful\n") {
                    jf.remove(loginPanel);
                    menue();
                }
                PopUP(r);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        //signup
        if (e.getSource() == su) {
            Account t = new Account();
            x = textField1.getText();
            y = textField2.getText();
            z = textField3.getText();
            try {
                String r = t.signup(x, z, y);
                if (r == "Account successfully opened") {
                    jf.remove(signupPanel);
                    menue();
                }
                PopUP(r);
            } catch (IOException | InvalidNumberException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == lih) {
            jf.remove(homePanel);
            login();
        }
        if (e.getSource() == suh) {
            jf.remove(homePanel);
            signup();
        }
        if (e.getSource() == a) {
            try {
                jf.remove(menuePanel);
                doctors();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        if (e.getSource() == b) {
            try {
                jf.remove(menuePanel);
                patients();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == c) {
            try {
                jf.remove(menuePanel);
                information();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }


    }
}
