import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age= JOptionPane.showInputDialog("Enter your age");
		int userAge= Integer.parseInt(age);
		if(userAge<18) {
			System.out.println("Come back in a few years");
	}
		else {
			
				System.out.println("Who would you like to vote for");
		}
}
}
 
	
	
