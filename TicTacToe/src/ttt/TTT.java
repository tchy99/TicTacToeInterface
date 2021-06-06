package ttt;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	@SuppressWarnings("serial")
	public class TTT extends JPanel {
		
		char playerMark = 'x';
		JButton[] buttons = new JButton[9];
		
		public TTT() {
			setLayout(new GridLayout(3,3));
			initializeButtons();	
		}
		public void initializeButtons()
	    {
	        for(int i = 0; i <= 8; i++)
	        {
	            buttons[i] = new JButton();
	            buttons[i].setText("--");
	            buttons[i].setBackground(Color.green);
	            add(buttons[i]);
	        }
	    }
	public static void main(String[] args) {
		JFrame window = new JFrame(" T T T ");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new TTT()); // adds the data
        window.setBounds(500,500,500,500); // area
        window.setVisible(true); // show the window
        window.setLocationRelativeTo(null); // center the window

	}

}
