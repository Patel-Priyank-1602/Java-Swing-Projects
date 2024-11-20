import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;

public class Add_Sub{
    public static void main(String[] args) {
        
        JFrame J = new JFrame();
        J.setSize(600,400);
        J.setLayout(new GridLayout(4,2));

        Font F = new Font("Arial",Font.PLAIN,30);

        JLabel L5 = new JLabel("1st",SwingConstants.CENTER); 
        JLabel L6 = new JLabel("2nd",SwingConstants.CENTER);
        L5.setFont(F);
        L6.setFont(F);

        L5.setLayout(new GridLayout(1,1));
        L5.setLayout(new GridLayout(1,2));
        
        J.add(L5);
        J.add(L6);

        JTextField T1 = new JTextField("");
        JTextField T2 = new JTextField("");
        T1.setFont(F);
        T2.setFont(F);

        JButton B1 = new JButton("+"); 
        JButton B2 = new JButton("-");
        B1.setFont(F);
        B2.setFont(F);

        JLabel L1 = new JLabel("SUM",SwingConstants.CENTER); 
        JLabel L2 = new JLabel("SUB",SwingConstants.CENTER);
        L1.setFont(F);
        L2.setFont(F);

        J.add(T1);
        T1.setLayout(new GridLayout(2,1));
        J.add(T2);
        T2.setLayout(new GridLayout(2,2));

        J.add(B1);
        B1.setLayout(new GridLayout(3,1));
        B1.addActionListener(e->{
            try{
                String a = T1.getText();
                int a1 = Integer.parseInt(a);
                String b = T2.getText();
                int b1 = Integer.parseInt(b);
                int W = a1 + b1;
                L1.setText("SUM : "+W);
            }
            catch(Exception ex){
                JFrame J2 = new JFrame("ERROR");
                J2.setSize(300,200);

                JLabel L3 = new JLabel("Enter Valid Number Only",SwingConstants.CENTER);
                L3.setBounds(20,100,100,20);
                J2.add(L3);

                J2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                J2.setVisible(true);
            }
        });

        J.add(B2);
        B2.setLayout(new GridLayout(3,2));
        B2.addActionListener(e->{
            try{
                String x = T1.getText();
                int x1 = Integer.parseInt(x);
                String y = T2.getText();
                int y1 = Integer.parseInt(y);
                int Z = x1 - y1;
                L2.setText("SUB : "+Z);
            }
            catch(Exception ex){
                JFrame J3 = new JFrame("ERROR");
                J3.setSize(300,200);

                JLabel L4 = new JLabel("Enter Valid Number Only",SwingConstants.CENTER);
                L4.setBounds(20,100,100,20);
                J3.add(L4);

                J3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                J3.setVisible(true);
            }
        });

        J.add(L1);
        L1.setLayout(new GridLayout(4,2));
        J.add(L2);
        L2.setLayout(new GridLayout(4,2));

        J.setVisible(true);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}