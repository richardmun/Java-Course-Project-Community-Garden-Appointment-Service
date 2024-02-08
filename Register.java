import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Register {

    // Starting with frontend development
    public static void main(String args[]) { // Welcome page
        JFrame frame = new JFrame("MVC Garden");
        JLabel label1 = new JLabel("Welcome to the Community Garden");
        JLabel label2 = new JLabel("Register below to visit...");
        JButton registerButton = new JButton("Register");

        // Initiate positioning system of elements
        JPanel panel = new JPanel(new GridBagLayout());

        // Utilize GridBag Layout for elements
        GridBagConstraints gbc = new GridBagConstraints();

        panel.add(label1, gbc); // Position frame string

        gbc.gridy = 1; // Position label1
        panel.add(label2, gbc);

        gbc.gridy = 2; //Position label2
        panel.add(registerButton, gbc);

        // Register button
        registerButton.addActionListener(new ActionListener() { // EventListener for register button
            public void actionPerformed(ActionEvent e) { // called when button is clicked
                JFrame frame2 = new JFrame("Information"); 
                contactInfo(frame2); 
                frame.dispose(); // Delete frame after button to proceed to next window has been clicked
            }
        });

        frame.add(panel); // Setup for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    private static void contactInfo(JFrame nextFrame) { // User enters name and phone number
        JLabel label3 = new JLabel("Full Name");
        JTextField textField = new JTextField(20);
        JLabel label4 = new JLabel("Phone Number");
        JTextField textField2 = new JTextField(20);
        JButton nextButton = new JButton("Next");

        JPanel panel = new JPanel(new GridBagLayout());

        // Layout for Contact Information
        GridBagConstraints gbc = new GridBagConstraints();

        panel.add(label3, gbc); // Position label3

        gbc.gridy = 1; // Position textfield
        panel.add(textField, gbc);

        gbc.gridy = 2; // Position label4
        panel.add(label4, gbc);

        gbc.gridy = 3; // Position textfield
        panel.add(textField2, gbc);

        gbc.gridy = 4; // Position button
        panel.add(nextButton, gbc);

        // Next button
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame3 = new JFrame("Appointment"); // create frame for appointment
                appointment(frame3); // Pass to appointment frame
                nextFrame.dispose();
            }
        });

        nextFrame.add(panel);
        nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nextFrame.setSize(600, 500);
        nextFrame.setLocationRelativeTo(null);
        nextFrame.setVisible(true);
    }


    private static void appointment(JFrame nextFrame) { // User selects month, day, and time for appointment
        JLabel label5 = new JLabel("Make an appointment to visit the garden"); // Body label
        JLabel label6 = new JLabel("Enter a month:");
        Date dateSelection = new Date();
        JLabel label7 = new JLabel("Choose a time:");
        Time timeComponent = new Time();
        JButton nextButton = new JButton("Next");

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        panel.add(label5, gbc); // Position label5

        gbc.gridy = 1; // Position label6
        panel.add(label6, gbc);
        
        gbc.gridy = 2; // Position month dropdown selection
        panel.add(dateSelection, gbc);

        gbc.gridy = 3; // Position label7
        panel.add(label7, gbc);

        gbc.gridy = 4; // Position time dropdown selection
        panel.add(timeComponent, gbc);

        gbc.gridy = 5; // Position button
        panel.add(nextButton, gbc);

        // Next button
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame4 = new JFrame("Confirmation");
                confirmation(frame4, dateSelection);
                nextFrame.dispose();
            }
        });

        nextFrame.add(panel);
        nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nextFrame.setSize(600, 500);
        nextFrame.setLocationRelativeTo(null);
        nextFrame.setVisible(true);
    }


    private static void confirmation(JFrame nextFrame, Date date) { // Confirmation page for user appointment
        String userMonth = date.monthChosen();
        int userDay = date.dayChosen();

        JLabel labelConfirmed = new JLabel("Appointment Confirmed...");
        JLabel label8 = new JLabel("Month Selected: " + userMonth);
        JLabel label9 = new JLabel("Day Selected: " + userDay);
        // JLabel label10 = new JLabel("Selected time: " + );
        JButton nextButton = new JButton("Next");
        

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        panel.add(labelConfirmed, gbc); // Position labelConfirmed

        gbc.gridy = 1; // Position label8
        panel.add(label8, gbc);

        gbc.gridy = 2; // Position label9
        panel.add(label9, gbc);

        gbc.gridy = 3; // Position button
        panel.add(nextButton, gbc);

        // Next button
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame5 = new JFrame("Confirmation");
                donations(frame5);
                nextFrame.dispose();
            }
        });

        nextFrame.add(panel);
        nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nextFrame.setSize(600, 500);
        nextFrame.setLocationRelativeTo(null);
        nextFrame.setVisible(true);
    }

    private static void donations(JFrame nextFrame) { // Checkboxes for optional donation
        JLabel label11 = new JLabel("For donations, select any of the following:");
        JButton nextButton = new JButton("Next");

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        panel.add(label11, gbc);

        // Create checkbox elements
        JCheckBox firstCheckbox = new JCheckBox("Monetary");
        JCheckBox secondCheckbox = new JCheckBox("Supplies");
        JCheckBox thirdCheckbox = new JCheckBox("Volunteer");

        gbc.gridy++; // Position checkbox
        panel.add(firstCheckbox, gbc);

        gbc.gridy++; // Position checkbox
        panel.add(secondCheckbox, gbc);

        gbc.gridy++; // Position checkbox
        panel.add(thirdCheckbox, gbc);

        gbc.gridy = 3; // Position button
        panel.add(nextButton, gbc);

        // Next button
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame6 = new JFrame("Summary");
                summary(frame6);
                nextFrame.dispose();
            }
        });
    

        nextFrame.add(panel);
        nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nextFrame.setSize(600, 500);
        nextFrame.setLocationRelativeTo(null);
        nextFrame.setVisible(true);
    }

    private static void summary(JFrame nextFrame) { // Farewell user section
        JLabel label12 = new JLabel("Thank you");

        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        panel.add(label12, gbc); // Position label12

        nextFrame.add(panel);
        nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nextFrame.setSize(600, 500);
        nextFrame.setLocationRelativeTo(null);
        nextFrame.setVisible(true);
    }
}

