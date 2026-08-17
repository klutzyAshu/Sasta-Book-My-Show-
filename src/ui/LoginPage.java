import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class LoginPage {

    public static void main(String[] args) {

    JFrame window = new JFrame();
    window.setTitle("Movie ticket booking app");
    window.setSize(1920, 1080);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JLabel title = new JLabel("Movie ticket booking app ");
        title.setFont(new Font("Arial", Font.BOLD ,30));

        panel.add(title);
        Window.add(panel);

        window.setVisible(true);
    }
}