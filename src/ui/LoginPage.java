import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.TextEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class LoginPage {

    public static void main(String[] args) {
JPanel panel = new JPanel(new BorderLayout());

JLabel titleLabel = new JLabel("Movie Ticket Booking App");

JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
headerPanel.add(titleLabel);

panel.add(headerPanel, BorderLayout.NORTH);


// LOGIN AREA
JPanel loginPanel = new JPanel();

JLabel usernameLabel = new JLabel("Username");
JTextField usernameField = new JTextField(15);

JLabel passwordLabel = new JLabel("Password");
JPasswordField passwordField = new JPasswordField(15);

JButton loginButton = new JButton("Login");

loginPanel.add(usernameLabel);
loginPanel.add(usernameField);

loginPanel.add(passwordLabel);
loginPanel.add(passwordField);

loginPanel.add(loginButton);

panel.add(loginPanel, BorderLayout.CENTER);

    }
}
