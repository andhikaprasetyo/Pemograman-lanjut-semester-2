import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lingkaran {
    private JPanel LingkaranPanel;
    private JTextField tfJariJari;
    private JTextField tfLuas;
    private JButton hitungButton;
    private JButton batalButton;
    private JButton keluarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lingkaran");
        frame.setContentPane(new Lingkaran().LingkaranPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Lingkaran() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //membuat variabel
            double jariJari,Luas;
            double pi = 3.14;

            //mengambil inputan dari text field
            jariJari = Double.parseDouble(tfJariJari.getText());

            //hitung luas
            Luas = pi * (jariJari * jariJari);

            //menaruh hasil
            tfLuas.setText(String.valueOf(Luas));

            }
        });

        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfJariJari.setText("");
                tfLuas.setText("");
                tfJariJari.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
