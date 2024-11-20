import javax.swing.*;
import java.awt.event.*;

public class KeyBoard{
    public static void main(String[] args) {
        
        JFrame J = new JFrame("Hello");
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setVisible(true);
        J.setSize(500,250);

        JLabel L = new JLabel("KeyPressed",SwingConstants.CENTER);

        J.add(L);

        J.addKeyListener(new KeyAdapter() {
            
            public void  keyPressed(KeyEvent e){
                L.setText("Key Pressed : "+KeyEvent.getKeyText(e.getKeyCode()));
            }

            public void keyReleased(KeyEvent e) {
                L.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            public void keyTyped(KeyEvent e) {
                L.setText("Key Typed: " + e.getKeyChar());
            }
        });

    }
}