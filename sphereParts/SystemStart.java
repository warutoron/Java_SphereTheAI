package sphereParts;
import javax.swing.JFrame;

public class SystemStart extends JFrame{
	public static void main(String[] args){
		MainView frame = new MainView();
		frame.setTitle("AI-Sphere");
		frame.setLayout(null);
		frame.setBounds(0,0,375,380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}