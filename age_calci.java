import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class age_calci extends JFrame {

    private JTextField dobField;
    private JButton calculateButton;

    public age_calci() {
        // 1. Setup the Window (Front End)
        setTitle("Age Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on screen
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        // 2. Create UI Components
        JLabel label = new JLabel("Enter DOB (YYYY-MM-DD): ");
        dobField = new JTextField(15); // Input field
        calculateButton = new JButton("Calculate Age");

        // 3. Add Components to Window
        add(label);
        add(dobField);
        add(calculateButton);

        // 4. Add Button Logic
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowAge();
            }
        });
    }

    private void calculateAndShowAge() {
        String dobString = dobField.getText();

        try {
            // Parse input string to Date
            LocalDate birthDate = LocalDate.parse(dobString);
            LocalDate currentDate = LocalDate.now();

            // Calculate Age
            if (birthDate.isAfter(currentDate)) {
                // Error Pop-up
                JOptionPane.showMessageDialog(this,
                        "Birth date cannot be in the future!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                Period age = Period.between(birthDate, currentDate);

                String message = "You are: \n" +
                        age.getYears() + " years, " +
                        age.getMonths() + " months, and " +
                        age.getDays() + " days old.";

                // Result Pop-up
                JOptionPane.showMessageDialog(this,
                        message,
                        "Exact Age",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (DateTimeParseException ex) {
            // Format Error Pop-up
            JOptionPane.showMessageDialog(this,
                    "Invalid format! Use YYYY-MM-DD (e.g., 1995-12-25)",
                    "Format Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Start the Application
        SwingUtilities.invokeLater(() -> {
            new age_calci().setVisible(true);
        });
    }
}