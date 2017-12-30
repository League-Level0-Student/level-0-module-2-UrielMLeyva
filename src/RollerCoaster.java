import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String height= JOptionPane.showInputDialog("What is your height?");
	int userHeight= Integer.parseInt(height);
	if(userHeight<48) {
		System.out.println("Come back in a few years");
	}
	else {
	System.out.println("Go ahead");
	
	
	
	}	
}
}
