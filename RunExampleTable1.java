package table;

import javax.swing.*;

public class RunExampleTable1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        JFrame jframe = new JFrame("Sorting Data Array");
        jframe.setContentPane(new ExampleTable1().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500,400);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}

