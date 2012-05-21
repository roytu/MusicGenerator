import java.awt.*;
import java.util.Random;
import javax.swing.*;
import org.jfugue.*;

public class MusicGenerator {
	MusicGenerator(){
		char[] Notes={'C','D','E','F','G','A','B'};
		Random random = new Random();
		System.out.println(Notes[random.nextInt(7)]);
		
		String result="";
		for(int i=0;i<10;i++){
			result+=Notes[random.nextInt(7)]+" ";
		}
		
		Player player = new Player();
		Pattern pattern = new Pattern(result);
		player.play(pattern);
	}
	
	public static void main(String[] args){
		new MusicGenerator();
	}
}