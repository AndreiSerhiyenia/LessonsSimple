package LessonsSimple.CKZiU.Vadzim18_02_2023;

import javax.swing.*;
import java.awt.*;

public class MainPeople {
    private static JPanel topPanel() {
        JPanel panel = new JPanel();




        return panel;
    }

    private static JPanel centerPanel() {
        JPanel panel = new JPanel();



        return panel;
    }


    private static JPanel buildPanel() {
        JPanel panel = new JPanel();
        panel.add(BorderLayout.NORTH,topPanel());
        panel.add(BorderLayout.CENTER,centerPanel());
        return panel;

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getRootPane().add(buildPanel());
        frame.setSize(300, 200);
        frame.pack();
        frame.setVisible(true);
    }
}
