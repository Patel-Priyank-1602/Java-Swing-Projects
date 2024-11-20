//Simplest Login Form

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login{
    public static void main(String[] args) {
        
        JFrame J1 = new JFrame("Login Please");

        Font F = new Font("Times of Roman", Font.PLAIN, 20);

        J1.setSize(600,270);
        J1.setLayout(null);
        
        JLabel L1 = new JLabel("Username : ");
        L1.setBounds(20,50,150,20);
        L1.setFont((F));
        J1.add(L1);

        JLabel L2 = new JLabel("Password : ");
        L2.setBounds(20,100,150,20);
        L2.setFont((F));
        J1.add(L2);

        Font F3 = new Font("Arial", Font.PLAIN, 17);

        JTextField T1 = new JTextField();
        T1.setBounds(180,50,200,25);
        T1.setFont((F3));
        J1.add(T1);

        JPasswordField T2 = new JPasswordField();
        T2.setBounds(180,100,200,25);
        T2.setFont((F3));
        J1.add(T2);

        Font F2 = new Font("Times of Roman", Font.PLAIN, 25);
        JButton B1 = new JButton("Login");
        B1.setBounds(0,195,600,35);
        B1.setFont((F2));
        J1.add(B1);

        J1.setVisible(true);
        J1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        B1.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent e){
                if((T1.getText().equals("admin") && T2.getText().equals("Password"))){
                    JFrame J2 = new JFrame("Login Request");
                    J2.setSize(300,200);

                    JLabel L3 = new JLabel("Login Request SUCCESS",SwingConstants.CENTER);
                    L3.setBounds(20,100,100,20);
                    J2.add(L3);

                    J2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    J2.setVisible(true);
                }
                else{
                    JFrame J3 = new JFrame("Login Request");
                    J3.setSize(300,200);

                    JLabel L4 = new JLabel("ERROR",SwingConstants.CENTER);
                    L4.setBounds(20,100,100,20);
                    J3.add(L4);

                    J3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    J3.setVisible(true);
                }
            }
        });
    }
}