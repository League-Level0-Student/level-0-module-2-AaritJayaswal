package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_numbers {
	public static void main(String[] args) {
	
		int num1 = new Random().nextInt(10);
		int num2 = new Random().nextInt(10);
		int num3 = new Random().nextInt(10);
		int num4 = new Random().nextInt(10);
		int num5 = new Random().nextInt(10);
		
		JOptionPane.showMessageDialog(null,num1+""+num2+""+num3+""+num4+""+num5);
		
		
}
}