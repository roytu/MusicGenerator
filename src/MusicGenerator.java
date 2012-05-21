import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import org.jfugue.*;

public class MusicGenerator {
	MusicGenerator(){
		char[] Tones={'C','D','E','F','G','A','B'};
		Random random = new Random();
		
		ArrayList<Note> notes=new ArrayList();
		
		Note note=new Note();
		note.tone=Tones[random.nextInt(7)];
		note.octave=random.nextInt(3)+3;
		notes.add(note);
		
		String result=buildString(notes);
		
		System.out.println(result);
		
		Player player = new Player();
		Pattern pattern = new Pattern(result);
		player.play(pattern);
	}
	
	public static void main(String[] args){
		new MusicGenerator();
	}
	
	public static String buildString(ArrayList<Note> notes){
		//TODO: Build string based on NoteArray
		String fin="";
		for(int i=0;i<notes.size();i++){
			Note cnote=notes.get(i);
			fin+=cnote.tone;
			fin+=cnote.octave;
			fin+=" ";
		}
		
		return fin;
	}
}