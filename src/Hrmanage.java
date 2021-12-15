package JavaProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hrmanage extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_4;
	private JTable table_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_3;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_8;

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
					Hrmanage frame = new Hrmanage();
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
	public Hrmanage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 21, 669, 617);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 104, 238));
		tabbedPane.addTab("Home", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("HUMAN RESOURCE MANAGEMENT");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel_2.setBounds(26, 164, 611, 109);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("WELCOME");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_3.setBounds(123, 80, 378, 74);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("TO");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel_3_1.setBounds(157, 130, 292, 63);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("SYSTEM");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel_3_2.setBounds(123, 242, 378, 74);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\vinay\\eclipse-workspace\\JavaProject"));
		lblNewLabel_4.setBounds(175, 328, 292, 109);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		tabbedPane.addTab("Emp_Details", null, panel_1, null);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(246, 86, 223, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(246, 142, 223, 32);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(246, 249, 223, 32);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Employee_ID");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel.setBounds(78, 93, 120, 22);
		panel_1.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 444, 516, 91);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Employee_id", "Employee_Name", "DOB", "Phone_no", "Designation"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Float.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE DETAILS");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 34));
		lblNewLabel_1.setBounds(105, 10, 424, 43);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblEmployeeName.setBounds(78, 151, 120, 22);
		panel_1.add(lblEmployeeName);
		
		JLabel lblPhoneNo = new JLabel("Phone no");
		lblPhoneNo.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblPhoneNo.setBounds(78, 256, 120, 22);
		panel_1.add(lblPhoneNo);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblDesignation.setBounds(78, 321, 120, 22);
		panel_1.add(lblDesignation);
		
		JLabel lblPhoneNo_1 = new JLabel("DOB");
		lblPhoneNo_1.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblPhoneNo_1.setBounds(78, 199, 120, 22);
		panel_1.add(lblPhoneNo_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(246, 192, 223, 32);
		panel_1.add(textField_4);
		
		JButton btnNewButton = new JButton("ADD DATA");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.setFont(new Font("Palatino Linotype", Font.BOLD, 13));
		btnNewButton.setBounds(356, 383, 113, 32);
		panel_1.add(btnNewButton);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(30, 144, 255));
		desktopPane_1.setBounds(0, 0, 664, 53);
		panel_1.add(desktopPane_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(246, 313, 220, 32);
		panel_1.add(comboBox);
		comboBox.addItem("");
		comboBox.addItem("Manager");
		comboBox.addItem("Supervisor");
		comboBox.addItem("Staff");
		comboBox.addItem("Trainee");
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(216, 191, 216));
		tabbedPane.addTab("Training", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(172, 23, 2, 2);
		panel_2.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(69, 391, 527, 106);
		panel_2.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Upcoming_Training_Section", "Event_Date", "Company_Name"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Float.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.getColumnModel().getColumn(0).setPreferredWidth(140);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(87);
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblUpcomingtrainingsection = new JLabel("Upcoming_Training_Section");
		lblUpcomingtrainingsection.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblUpcomingtrainingsection.setBounds(32, 118, 221, 22);
		panel_2.add(lblUpcomingtrainingsection);
		
		JLabel lblNewLabel_5_1 = new JLabel("Event_Date");
		lblNewLabel_5_1.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(32, 170, 120, 22);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Company_Name");
		lblNewLabel_5_2.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(32, 223, 142, 22);
		panel_2.add(lblNewLabel_5_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(297, 113, 299, 28);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(297, 165, 299, 28);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(297, 218, 299, 28);
		panel_2.add(textField_7);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setFont(new Font("Palatino Linotype", Font.BOLD, 13));
		btnNewButton_1.setBounds(498, 314, 98, 28);
		panel_2.add(btnNewButton_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(30, 144, 255));
		desktopPane.setBounds(0, 0, 664, 51);
		panel_2.add(desktopPane);
		
		JLabel lblNewLabel_1_1 = new JLabel("TRAINING DETAILS");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(179, 10, 312, 39);
		desktopPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 34));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(233, 150, 122));
		tabbedPane.addTab("Payment", null, panel_3, null);
		panel_3.setLayout(null);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(new Color(30, 144, 255));
		desktopPane_2.setBounds(0, 0, 664, 55);
		panel_3.add(desktopPane_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PAYMENT");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 34));
		lblNewLabel_1_1_1.setBounds(151, 10, 312, 39);
		desktopPane_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Payment Requirements :");
		lblNewLabel_5.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblNewLabel_5.setBounds(79, 100, 211, 30);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_3 = new JLabel("Hours Worked");
		lblNewLabel_5_3.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(79, 140, 211, 30);
		panel_3.add(lblNewLabel_5_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(79, 177, 201, 36);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Length of Employment");
		lblNewLabel_5_3_1.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_5_3_1.setBounds(79, 234, 211, 30);
		panel_3.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_5_3_2 = new JLabel("FMLA Entitlement");
		lblNewLabel_5_3_2.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_5_3_2.setBounds(410, 100, 211, 30);
		panel_3.add(lblNewLabel_5_3_2);
		
		JLabel lblNewLabel_5_3_3 = new JLabel("Standard Hours");
		lblNewLabel_5_3_3.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_5_3_3.setBounds(410, 140, 211, 30);
		panel_3.add(lblNewLabel_5_3_3);
		
		JLabel lblNewLabel_5_3_4 = new JLabel("Military Hours");
		lblNewLabel_5_3_4.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_5_3_4.setBounds(410, 234, 211, 30);
		panel_3.add(lblNewLabel_5_3_4);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(410, 177, 201, 36);
		panel_3.add(textField_9);
		
		JButton btnNewButton_3 = new JButton("Submit");
		btnNewButton_3.setBackground(new Color(255, 99, 71));
		btnNewButton_3.setFont(new Font("Palatino Linotype", Font.BOLD, 12));
		btnNewButton_3.setBounds(450, 485, 122, 36);
		panel_3.add(btnNewButton_3);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(410, 274, 201, 36);
		panel_3.add(textField_10);
		
		JLabel lblNewLabel_5_3_1_1 = new JLabel("Leave Calender");
		lblNewLabel_5_3_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_5_3_1_1.setBounds(79, 340, 211, 30);
		panel_3.add(lblNewLabel_5_3_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(79, 370, 201, 36);
		panel_3.add(textField_11);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("");
		comboBox_1.addItem("Days");
		comboBox_1.addItem("Month");
		comboBox_1.addItem("Year");
		comboBox_1.setBounds(79, 274, 201, 36);
		panel_3.add(comboBox_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(210, 180, 140));
		tabbedPane.addTab("Department", null, panel_4, null);
		panel_4.setLayout(null);
		
		JDesktopPane desktopPane_2_1 = new JDesktopPane();
		desktopPane_2_1.setBackground(new Color(30, 144, 255));
		desktopPane_2_1.setBounds(0, 0, 664, 55);
		panel_4.add(desktopPane_2_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("DEPARTMENT");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 34));
		lblNewLabel_1_1_1_1.setBounds(151, 10, 312, 39);
		desktopPane_2_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblDepartmentid = new JLabel("Department_ID");
		lblDepartmentid.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblDepartmentid.setBounds(56, 138, 221, 22);
		panel_4.add(lblDepartmentid);
		
		JLabel lblDepartmenttype = new JLabel("Department_Type");
		lblDepartmenttype.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblDepartmenttype.setBounds(56, 200, 221, 22);
		panel_4.add(lblDepartmenttype);
		
		JLabel lblRequirements = new JLabel("Requirements");
		lblRequirements.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblRequirements.setBounds(56, 259, 221, 22);
		panel_4.add(lblRequirements);
		
		textField_8 = new JTextField();
		textField_8.setBounds(261, 122, 168, 34);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(261, 255, 325, 152);
		panel_4.add(textArea);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem("");
		comboBox_2.addItem("Accounting");
		comboBox_2.addItem("Marketing");
		comboBox_2.addItem("Service");
		comboBox_2.addItem("Advertising");
		comboBox_2.addItem("Purchasing");
		comboBox_2.setBounds(261, 191, 168, 34);
		panel_4.add(comboBox_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Yes");
		chckbxNewCheckBox.setBackground(new Color(210, 180, 140));
		chckbxNewCheckBox.setBounds(261, 447, 93, 21);
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNo = new JCheckBox("No");
		chckbxNo.setBackground(new Color(210, 180, 140));
		chckbxNo.setBounds(393, 447, 93, 21);
		panel_4.add(chckbxNo);
		
		JButton btnNewButton_4 = new JButton("Submit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hrmanage hopage = new Hrmanage();
				hopage.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBackground(new Color(255, 127, 80));
		btnNewButton_4.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		btnNewButton_4.setBounds(499, 516, 85, 21);
		panel_4.add(btnNewButton_4);
		
		JLabel lblRequired = new JLabel("Required");
		lblRequired.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblRequired.setBounds(56, 449, 221, 22);
		panel_4.add(lblRequired);
		
		JButton btnNewButton_2 = new JButton("LOG OUT");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Palatino Linotype", Font.BOLD, 10));
		btnNewButton_2.setBounds(576, 0, 85, 26);
		contentPane.add(btnNewButton_2);
	}
}
