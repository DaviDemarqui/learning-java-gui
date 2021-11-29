package com.demarqui;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //Creating the frame
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100,900);

        //Creating the menuBar
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Menu");
        JMenu m2 = new JMenu("Save");
        JMenu m3 = new JMenu("Settings");
        JMenu m4 = new JMenu("Quit");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        JMenuItem m30 = new JMenuItem("Add");
        JMenuItem m31 = new JMenuItem("Import");
        JMenuItem m32 = new JMenuItem("export");
        JMenuItem m33 = new JMenuItem("Close");
        JMenuItem m22 = new JMenuItem("save");
        JMenuItem m23 = new JMenuItem("save as");
        JMenuItem m24 = new JMenuItem("Save n Quit");
        m1.add(m30);
        m1.add(m31);
        m1.add(m32);
        m1.add(m33);
        m2.add(m22);
        m2.add(m23);
        m4.add(m24);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea ta = new JTextArea();

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
