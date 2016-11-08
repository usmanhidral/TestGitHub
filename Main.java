import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		//MyClass c1 = new MyClass();
		//c1.setVisible(true);
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100,50);
		frame.setTitle("1st GUI");
		ImageIcon icon=new ImageIcon("o.jpg");
		frame.setIconImage(icon.getImage());
		
	}

}
