package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {

	  public static void main(String[] args) {
		  
		JOptionPane.showMessageDialog(null,"To ride the rollercoaster, you need to be taller than 48 inches.");  
		  
		String height = JOptionPane.showInputDialog(null, "What is your height in inches?");
		
		
		int h = Integer.parseInt(height);
		
		
		if (h > 48) {
		JOptionPane.showMessageDialog(null, "You can ride the rollercoaster");	
		}
		
		
		else {
			JOptionPane.showMessageDialog(null,"You can come back after you grow more.");
		}
		  
	  }
}
