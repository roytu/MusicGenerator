import java.awt.*;
import javax.swing.*;

public class MusicGenerator {
	MusicGenerator(){
		System.out.println("hey thur \nthis is new line");
		JFrame frame = new JFrame("this is  frame");
		frame.setSize(1000,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		new MusicGenerator();
	}
}
