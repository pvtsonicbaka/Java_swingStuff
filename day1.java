import javax.swing.JFrame;
import javax.swing.JLabel;

class day1{
    public static void main(String[] args) {
        sjj s = new sjj();
    }
}
class sjj extends JFrame{
    sjj(){
        JLabel jb = new JLabel("hello world?");
        add(jb);

        setVisible(true);
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}