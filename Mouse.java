import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class Mouse{
    public static void main(String[] args) {
        
        JFrame J = new JFrame("Hello in Mouse");
        J.setSize(500,250);
        J.setVisible(true);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Mouse Command",SwingConstants.CENTER);
        J.add(label);

        J.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse Clilked : "+ e.getX() + "," + e.getY());
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered the window");
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited the window");
            }

            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }
}