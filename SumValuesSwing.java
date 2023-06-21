package PBO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumValuesSwing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("pertambahan");

        // Create two JLabels
        JLabel label1 = new JLabel("angka pertama:");
        JLabel label2 = new JLabel("angka kedua :");

        // Create two JTextFields
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        // Create a JButton
        JButton button = new JButton("jumlahkan");

        // Create a ActionListener for the button
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the values from the text fields
                String input1 = textField1.getText();
                String input2 = textField2.getText();

                // Convert the values to integers
                int value1 = Integer.parseInt(input1);
                int value2 = Integer.parseInt(input2);

                // Calculate the sum
                int sum = value1 + value2;

                // Display the sum in a JOptionPane
                JOptionPane.showMessageDialog(null, "Sum: " + sum);
            }
        };

        // Add the ActionListener to the button
        button.addActionListener(listener);

        // Create a JPanel and set the layout
        JPanel panel = new JPanel(new GridLayout(3, 2));

        // Add the components to the panel
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
