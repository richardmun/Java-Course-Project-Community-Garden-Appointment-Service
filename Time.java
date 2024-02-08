import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Time extends JPanel { // Create dropdown using array of timeslots
    private String[] times = {"8:00 AM - 9:00 AM", "9:00 AM - 10:00 AM", "10:00 AM - 11:00 AM", "11:00 AM - 12:00 PM", "12:00 PM - 1:00 PM", "1:00 PM - 2:00 PM", "2:00 PM - 3:00 PM", "3:00 PM - 4:00 PM"};
    private JComboBox<String> timeComboBox = new JComboBox<>(times);
    
    public Time() {
        add(timeComboBox); // Add drop-down list to the panel

    }
    
}
