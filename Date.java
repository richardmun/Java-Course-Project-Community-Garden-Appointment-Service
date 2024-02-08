import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Date extends JPanel { // Create dropdown using array for months
    private String[] monthsArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private JComboBox<String> monthDropdown = new JComboBox<>(monthsArray); // Dropdown for month
    private JComboBox<Integer> dayDropdown = new JComboBox<>(); // Dropdown for days
    
    public Date() {
        setLayout(new GridLayout(1, 2));
        
        monthDropdown.addActionListener(e -> monthToDay());
        add(monthDropdown);
        add(dayDropdown);
        
        monthToDay();
    }
    
    private void monthToDay() {
        int days = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH); // Receives maximum amount of days in specific month.
        for (int i = 1; i <= days; i++) { // Iteration to include every day that is within the month selected.
            dayDropdown.addItem(i);
        }
    }
    
    public String monthChosen() {
        return (String) monthDropdown.getSelectedItem();
    }
    
    public int dayChosen() {
        return (int) dayDropdown.getSelectedItem();
    }
    

}


