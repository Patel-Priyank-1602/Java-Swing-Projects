import javax.swing.*;
import java.awt.event.*;

public class Window {
    public static void main(String[] args) {
        
        JFrame J = new JFrame("Hello In Windows");

        J.setSize(400,200);
        J.setVisible(true);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel L1 = new JLabel("Hello",SwingConstants.CENTER);
        J.add(L1);

        J.addWindowListener(new WindowListener () {
            public void windowOpened(WindowEvent e){
                System.out.println("Window Opening");
                L1.setText("Window Opening");
            }
        
            public void windowClosing(WindowEvent e){
                System.out.println("Window Closing");
                L1.setText("Window Closing");
            }
        
            public void windowClosed(WindowEvent e){
                System.out.println("Window Closed");
                L1.setText("Window Closed");
            }
        
            public void windowIconified(WindowEvent e) {
                System.err.println("Window Minimized");
                L1.setText("Window Minimized");
            }
        
            public void windowDeiconified(WindowEvent e) {
                System.err.println("Window Restored");
                L1.setText("Window Restored");
            }
        
            public void windowActivated(WindowEvent e) {
                System.err.println("Window Activated");
                L1.setText("Window Activated");
            }
        
            public void windowDeactivated(WindowEvent e) {
                System.err.println("Window Deactivated");
                L1.setText("Window Deactivated");
            }
            
        });
    }

}

