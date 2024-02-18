import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;

class day2{
    public static void main(String[] args) {
        sjj s = new sjj();
    }
}
class sjj extends JFrame{//card layour like stack
    sjj(){
        setLayout(new FlowLayout());

        JLabel jb2 = new JLabel("new text");
        JLabel jb = new JLabel("hel world?");
        add(jb);
        add(jb2);

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}