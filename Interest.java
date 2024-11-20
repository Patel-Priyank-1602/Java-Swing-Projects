import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interest{
    public static void main(String[] args) {
        
        JFrame J = new JFrame("Welcome");

        J.setSize(700,300);
        J.setLayout(null);

        Font font = new Font("Arial", Font.PLAIN, 20);

        JLabel L1 = new JLabel("Amount : ");
        L1.setBounds(50, 50, 100, 30);
        J.add(L1);
        JLabel L2 = new JLabel("Interest Rate : ");
        L2.setBounds(50, 100, 150, 30);
        J.add(L2);
        JLabel L3 = new JLabel("Year : ");
        L3.setBounds(50, 150, 100, 30);
        J.add(L3);

        JTextField T1 = new JTextField();
        T1.setBounds(160, 50, 100, 30);
        J.add(T1);
        JTextField T2 = new JTextField();
        T2.setBounds(160, 100, 100, 30);
        J.add(T2);
        JTextField T3 = new JTextField();
        T3.setBounds(160, 150, 100, 30);
        J.add(T3);

        JButton B1 = new JButton("Calculate");
        B1.setBounds(0,230,700,30);
        J.add(B1);

        JLabel L4 = new JLabel("");
        L4.setBounds(350, 50, 200, 50);
        J.add(L4);

        B1.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent e){
                try{
                    float x = Float.parseFloat(T1.getText());
                    float y = Float.parseFloat(T2.getText());
                    float z = Float.parseFloat(T3.getText());

                    float Result = (x*y*z)/100 ;
                    String c = Float.toString(Result);
                    L4.setText("Interest : "+c);
                    L4.setFont(font);
                }
                catch(Exception ex){
                    L4.setText("Enter Proper Value");
                }
            }
        });

        J.setVisible(true);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}