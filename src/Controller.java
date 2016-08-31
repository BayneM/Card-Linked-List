import java.awt.event.*;
import java.io.IOException;

public class Controller implements ActionListener{
	static Model m = new Model();
	boolean showCards = false;
	public Controller(){
		
	}

	public static void main(String[] args) throws IOException {
		m.build();
		m.update();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(m.addf)){
			//FIND CARD IN FILE (returns a card object)
			//FIND CARD PICTURE (returns a picture)
			//ADD TO FRONT		(adds card object to linked list)
			System.out.println(m.suitc.getSelectedItem()+" "+m.cardc.getSelectedItem());
		}
		if(e.getSource().equals(m.addb)){
			//FIND CARD IN FILE (returns a card object)
			//FIND CARD PICTURE (returns a picture)
			//ADD TO FRONT		(adds card object to linked list)
		}
		if(e.getSource().equals(m.remf)){
			//REMOVE FIRST CARD
			//REMOVE FIRST PICTURE
		}
		if(e.getSource().equals(m.remb)){
			//REMOVE LAST CARD
			//REMOVE LAST PICTURE
		}
		if(e.getSource().equals(m.sh)){
			if(showCards == false){
				showCards = true;
			}
			else{
				showCards = false;
			}
		}
		
	}
	
	
	
}
