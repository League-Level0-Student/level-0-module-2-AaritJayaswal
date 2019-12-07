package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting_booth {

	  public static void main(String[] args) {
		  
		  String age = JOptionPane.showInputDialog(null, "What is your age?");
		  int a = Integer.parseInt(age);
		  if(a<18) {
			  JOptionPane.showMessageDialog(null, "You can't vote");
		  }
		  
		  else {
			  
			  JOptionPane.showInputDialog(null,"Who should be the next president?");
			  
		  }
				 
	  }
}
