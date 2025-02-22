import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPage {
    private JFrame frame;
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;

    public RegistrationPage() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Registration Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Name label and field
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        nameField = new JTextField(20);
        frame.add(nameField, gbc);

        // Email label and field
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        emailField = new JTextField(20);
        frame.add(emailField, gbc);

        // Password label and field
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        passwordField = new JPasswordField(20);
        frame.add(passwordField, gbc);

        // Confirm password label and field
        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(new JLabel("Confirm Password:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        confirmPasswordField = new JPasswordField(20);
        frame.add(confirmPasswordField, gbc);

        // Register button
        gbc.gridx = 1;
        gbc.gridy = 4;
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new RegisterButtonListener());
        frame.add(registerButton, gbc);

        frame.pack();
        frame.setVisible(true);
    }

    private class RegisterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get input values
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            // Validate input values
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
                return;
            }

            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(frame, "Passwords do not match.");
                return;
            }

            // Register user (TO DO: implement registration logic)
            System.out.println("User registered successfully!");
            JOptionPane.showMessageDialog(frame, "User registered successfully!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationPage();
            }
        });
    }
                             }
          
