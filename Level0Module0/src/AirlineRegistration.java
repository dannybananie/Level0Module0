

import javax.swing.*;

public class AirlineRegistration {
public static void main(String[] args) {
	String name = 	JOptionPane.showInputDialog("Name");
String birthdate =	JOptionPane.showInputDialog("Birthdate");
String row = JOptionPane.showInputDialog("Row #");
String seat = JOptionPane.showInputDialog("Seat #");
JOptionPane.showMessageDialog(null, name);
JOptionPane.showMessageDialog(null, birthdate);
JOptionPane.showMessageDialog(null, row);
JOptionPane.showMessageDialog(null, seat);
}
}
