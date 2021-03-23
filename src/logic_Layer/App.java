package logic_Layer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel_main;
    private JLabel phone_label;
    private JButton button_test;


    public App() {
        //When event click occurs, its displays a message
        button_test.addActionListener(event -> JOptionPane.showMessageDialog(null, "Hello App"));
    }

    //Main method
    public static void main(String[] args) {
        // Instantiate App controller
        App app = new App();
        //Load UI Elements
        ImageIcon phoneTransparent = new ImageIcon("lib/phone/phone_transparent.png");
        ImageIcon scaledImage = new ImageIcon(phoneTransparent.getImage().getScaledInstance(440,720,java.awt.Image.SCALE_SMOOTH));

        // Assign Components
        MyFrame frame_main = new MyFrame();
        frame_main.setContentPane(app.panel_main);


        app.phone_label.setOpaque(false);
        app.phone_label.setIcon(scaledImage);
        app.phone_label.setHorizontalAlignment(JLabel.CENTER);
        app.phone_label.setVerticalAlignment(JLabel.CENTER);

    }
}

