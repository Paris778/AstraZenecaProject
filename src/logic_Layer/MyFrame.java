package logic_Layer;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    MyFrame(){
        this.getContentPane().setBackground(Color.gray);
        this.pack();
        //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Hackathon App");
        this.setSize(580,820);
        this.setVisible(true);
        //
        ImageIcon windowIcon = new ImageIcon("lib/slime_icons/Slime_RPG_Healer.png");
        this.setIconImage(windowIcon.getImage());
    }
}
