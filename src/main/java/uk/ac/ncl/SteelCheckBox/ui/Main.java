package uk.ac.ncl.SteelCheckBox.ui;

import uk.ac.ncl.SteelCheckBox.custom.SteelCheckBox;

import javax.swing.*;

public class Main {
    static JFrame jFrame = new JFrame();
    static JPanel jPanel = new JPanel();
    static SteelCheckBox steelCheckBox = new SteelCheckBox();

    public static void main(String[] args) {
        steelCheckBox.setText("Test");
        jPanel.add(steelCheckBox);
        jFrame.add(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setSize(200, 100);
    }
}
