import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public abstract class GUI implements ActionListener {
	static JFrame jf=new JFrame();
	static JPanel homePanel=new JPanel();
	static JPanel loginPanel=new JPanel();
	static JPanel signupPanel=new JPanel();
	static JPanel menuePanel=new JPanel();
	static JPanel doctorPanel=new JPanel();
	static JPanel patientPanel=new JPanel();
	static JPanel infoPanel=new JPanel();
    static String x,y,z;
    static JLabel userLabel = new JLabel();  
   
    static JTextField textField1 = new JTextField(15); 
    
    static JLabel phoneLabel = new JLabel();  
    
    static JTextField textField3 = new JTextField(15); 
    
    static JLabel passLabel = new JLabel();  

    static JTextField  textField2 = new JPasswordField(15);
    
    static JButton lih=new JButton("Log in");
	static JButton suh=new JButton("Sign up");
	static JButton li=new JButton("SUBMIT");
	static JButton su=new JButton("SUBMIT");
	static JButton a=new JButton("Doctors");
	static JButton b=new JButton("Patients");
	static JButton c=new JButton("Hospital");
	static ButtonHandler handler = new ButtonHandler();
	

	public static void main(String[] args) throws IOException {
 
		home();
	}
	
	public static void login() {
		
		
		 	userLabel.setText("Username"); 
		    passLabel.setText("Password");
	        loginPanel.add(userLabel);
	        loginPanel.add(textField1);
	        loginPanel.add(passLabel);
	        loginPanel.add(textField2);
	       
	        li.addActionListener(handler);
	        loginPanel.add(li);
  
        jf.add(loginPanel, BorderLayout.CENTER);  



        jf.setTitle("LOGIN FORM");  
        jf.setSize(500,500);
        jf.setVisible(true);
	}
	
	public static void signup() {

	 	userLabel.setText("Username"); 
	    passLabel.setText("Password");
	    phoneLabel.setText("Phone");
        signupPanel.add(userLabel);
        signupPanel.add(textField1);
        signupPanel.add(phoneLabel);
        signupPanel.add(textField3);
        signupPanel.add(passLabel);
        signupPanel.add(textField2);
       
        su.addActionListener(handler);
        signupPanel.add(su);

    jf.add(signupPanel, BorderLayout.CENTER);  
      

    jf.setTitle("SIGNUP FORM");  
    jf.setSize(500,500);
    jf.setVisible(true);
}
	
	public static void doctors() throws IOException {
		Test t=new Test();
		JTextArea doc=new JTextArea();
		doc.setText(t.printDoctors());
		doctorPanel.add(doc);
		jf.add(doctorPanel, BorderLayout.CENTER);
		jf.setTitle("Doctors");  
	    jf.setSize(500,500);
	    jf.setVisible(true);
	}
	
	public static void information() throws IOException {
		Test t=new Test();
		JTextArea hos=new JTextArea();
		hos.setText(t.printInformation());
		infoPanel.add(hos);
		jf.add(infoPanel, BorderLayout.CENTER);
		jf.setTitle("Hospital");  
	    jf.setSize(500,500);
	    jf.setVisible(true);
	}
	
	public static void patients() throws IOException {
		Test t=new Test();
		JTextArea pat=new JTextArea();
		pat.setText(t.printPatients());
		patientPanel.add(pat);
		jf.add(patientPanel, BorderLayout.CENTER);
		jf.setTitle("Patients");  
	    jf.setSize(500,500);
	    jf.setVisible(true);
	}
	

	public static void home()
	{
		
		homePanel.add(lih);
		homePanel.add(suh);
		lih.addActionListener(handler);
		suh.addActionListener(handler);
		jf.add(homePanel);
		jf.setTitle("HOME");
		jf.setSize(500,500);
		jf.setVisible(true);
		
	}
	
	public static void menue() {
		
		menuePanel.add(a);
		menuePanel.add(b);
		menuePanel.add(c);
		a.addActionListener(handler);
		b.addActionListener(handler);
		c.addActionListener(handler);
		jf.add(menuePanel);
		jf.setTitle("MENUE");
		jf.setSize(500,500);
		jf.setVisible(true);
	}

	 
	
	public void PopUP(String s) {
		JFrame p=new JFrame();
		p.setSize(300, 300);
		p.getContentPane().setBackground(Color.BLUE);
		
		p.setTitle("Message");

		JTextArea em=new JTextArea();
		em.setText(s);
		JPanel x=new JPanel();
		x.add(em);
		
		p.add(x);
		p.setVisible(true);
	}
	
}
