package JavaProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	protected Object frame;
	private JTextField textField_4;
	private JTextField textField_5;
	private final JDesktopPane desktopPane = new JDesktopPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String jdbcURL = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "";
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
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 668);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(286, 104, 244, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(286, 162, 244, 35);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(286, 265, 244, 35);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(286, 325, 244, 35);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(78, 111, 128, 26);
		lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(67, 536, 155, 35);
		btnNewButton_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("Last Name");
		lblNewLabel_1_5.setBounds(78, 169, 128, 26);
		lblNewLabel_1_5.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Gender");
		lblNewLabel_1_5_1.setBounds(78, 223, 128, 26);
		lblNewLabel_1_5_1.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1_5_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBackground(new Color(255, 182, 193));
		rdbtnNewRadioButton.setBounds(287, 223, 61, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(255, 182, 193));
		rdbtnFemale.setBounds(382, 223, 69, 21);
		contentPane.add(rdbtnFemale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBackground(new Color(255, 182, 193));
		rdbtnOther.setBounds(471, 223, 59, 21);
		contentPane.add(rdbtnOther);
		
		JLabel lblNewLabel_1_5_1_1 = new JLabel("Phone no");
		lblNewLabel_1_5_1_1.setBounds(78, 276, 128, 26);
		lblNewLabel_1_5_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1_5_1_1);
		
		JLabel lblNewLabel_1_5_1_1_1 = new JLabel("Email");
		lblNewLabel_1_5_1_1_1.setBounds(78, 336, 128, 26);
		lblNewLabel_1_5_1_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1_5_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(286, 384, 244, 35);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(286, 445, 244, 35);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_5_1_1_1_1 = new JLabel("Password");
		lblNewLabel_1_5_1_1_1_1.setBounds(78, 395, 128, 26);
		lblNewLabel_1_5_1_1_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1_5_1_1_1_1);
		
		JLabel lblNewLabel_1_5_1_1_1_2 = new JLabel("Confirm Password");
		lblNewLabel_1_5_1_1_1_2.setBounds(78, 456, 161, 26);
		lblNewLabel_1_5_1_1_1_2.setFont(new Font("Palatino Linotype", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1_5_1_1_1_2);
		
		JButton btnNewButton_1_1 = new JButton("Submit");
		btnNewButton_1_1.setBounds(409, 536, 155, 35);
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		btnNewButton_1_1.setBackground(new Color(244, 164, 96));
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("REGISTER");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 43));
		lblNewLabel.setBounds(201, -6, 235, 68);
		contentPane.add(lblNewLabel);
		desktopPane.setBackground(new Color(255, 140, 0));
		desktopPane.setBounds(0, -6, 638, 67);
		contentPane.add(desktopPane);
	}
}
