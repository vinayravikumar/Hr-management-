package JavaProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "2353303";
		try {
		Connection connection = DriverManager.getConnection(jdbcURL, username, password);
		System.out.print("DBMS Connected Successfully");
		}
		catch(SQLException e) {
		System.out.println("Error in connection");
		e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 665);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 34));
		lblNewLabel.setBounds(286, 172, 160, 70);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(227, 316, 314, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(227, 418, 314, 52);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_1.setBounds(227, 282, 114, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register regpage = new Register();
				regpage.setVisible(true);
			}
			
		});
		btnNewButton.setBounds(418, 512, 123, 21);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Hrmanage homepage = new Hrmanage();
					homepage.setVisible(true);
					dispose();
			}
		});
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnLogin.setBounds(227, 512, 123, 21);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(227, 395, 114, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\vinay\\eclipse-workspace\\JavaProject"));
		lblNewLabel_2.setBounds(266, 30, 216, 147);
		contentPane.add(lblNewLabel_2);
	}

}
