import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class day2AddGUI {
        public static void main(String[] args) {
            add a = new add();
        }
}
class add extends JFrame{
    add(){
        JTextField jField = new JTextField(20);
        JTextField jField2 = new JTextField(30);
        JButton jb = new JButton("ok");
        JLabel jlLabel= new JLabel("result");

        add(jField);
        add(jField2);
        add(jb);
        add(jlLabel);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
