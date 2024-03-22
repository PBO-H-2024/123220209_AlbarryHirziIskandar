package display;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class display extends JFrame implements ActionListener {
    
    private JTextField fieldNama, fieldNIM, fieldMenulis, fieldKoding, fieldWawancara;
    private JButton tombolHitung;
    private JLabel labelHasil;

    public display() {
        setTitle("PT.OOP Internship Program");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(15, 10));

        JLabel labelNama = new JLabel("Full Name:");
        JLabel labelNIM = new JLabel("Student Number:");
        JLabel labelMenulis = new JLabel("Writing Test:");
        JLabel labelKoding = new JLabel("Coding Test:");
        JLabel labelWawancara = new JLabel("Interview Test:");
        JLabel labelKosong = new JLabel("");
        JLabel labelJudulHasil = new JLabel("Result:");
        labelHasil = new JLabel("");

        fieldNama = new JTextField();
        fieldNIM = new JTextField();
        fieldMenulis = new JTextField();
        fieldKoding = new JTextField();
        fieldWawancara = new JTextField();

        tombolHitung = new JButton("find out!");
        tombolHitung.addActionListener(this);

        add(labelNama);
        add(fieldNama);
        add(labelNIM);
        add(fieldNIM);
        add(labelMenulis);
        add(fieldMenulis);
        add(labelKoding);
        add(fieldKoding);
        add(labelWawancara);
        add(fieldWawancara);
        add(labelKosong);
        add(tombolHitung);
        add(labelJudulHasil);
        add(labelHasil);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String nama = fieldNama.getText();
            String nim = fieldNIM.getText();
            double nilaiMenulis = Double.parseDouble(fieldMenulis.getText());
            double nilaiKoding = Double.parseDouble(fieldKoding.getText());
            double nilaiWawancara = Double.parseDouble(fieldWawancara.getText());

            double skorAndroid = (nilaiMenulis * 0.2 + nilaiKoding * 0.5 + nilaiWawancara * 0.3);
            double skorWeb = (nilaiMenulis * 0.4 + nilaiKoding * 0.35 + nilaiWawancara * 0.25);

            String hasil;
            if (skorAndroid >= 85) {
                hasil = "CONGRATULATION!, you ACCEPTED as Android Developer";
            } else if (skorWeb >= 85) {
                hasil = "CONGRATULATION!, you ACCEPTED as Web Developer";
            } else {
                hasil = "SORRY you were not accepted this time, but don't give up!"
                ;
            }

            labelHasil.setText(hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,  "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
