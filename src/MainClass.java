import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainClass {

    public static void main(String[] args) {
        JFrame f = new JFrame("Draw Line");
        f.setSize(300, 300);
        f.setLocation(300, 300);
        f.setResizable(false);
        JPanel p = new JPanel() {
            int x,y = 0;
            {

                addMouseMotionListener(new MouseMotionAdapter() {


                    public void mouseDragged(MouseEvent e) {
                        x = e.getX();
                        y = e.getY();
                        Graphics g = getGraphics();
                        g.setColor(Color.BLACK);
                        g.fillOval(x,y,10,10);

                    }
                });
            }

        };
        f.add(p);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    }



