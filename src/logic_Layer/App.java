package logic_Layer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button_test;
    private JPanel panel_main;

    public App() {
        //When event click occurs, its displays a message
        button_test.addActionListener(event -> JOptionPane.showMessageDialog(null, "Hello App"));
    }

    //Main method
    public static void main(String[] args) {
        JFrame frame_main = new JFrame("App");
        frame_main.setContentPane(new App().panel_main);
        frame_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_main.pack();
        frame_main.setVisible(true);
    }
}
