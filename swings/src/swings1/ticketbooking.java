package swings1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class ticketbooking {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1006, 810);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TICKET BOOKING");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(373, 11, 227, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setBounds(87, 90, 86, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(235, 86, 116, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(46, 152, 376, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setBounds(26, 174, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("SingleTicket");
		rdbtnNewRadioButton_1.setBounds(162, 174, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Adult");
		rdbtnNewRadioButton_2.setBounds(294, 174, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("First Class");
		rdbtnNewRadioButton_3.setBounds(26, 222, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Ac");
		rdbtnNewRadioButton_4.setBounds(162, 222, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Sleeper");
		rdbtnNewRadioButton_5.setBounds(294, 222, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Child");
		rdbtnNewRadioButton_6.setBounds(421, 174, 86, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TVM", "KKD", "Qlnd", "Vtk", "TSR"}));
		comboBox.setBounds(26, 282, 109, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Vtk", "KKD", "TVM", "Qlnd", "TSR"}));
		comboBox_1.setBounds(162, 282, 102, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(294, 282, 109, 22);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 328, 446, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				int tax=Integer.parseInt(textField_9.getText()+20);
				String name=textField.getText();
				String r=(textField_7.getText()+"any");
               if(rdbtnNewRadioButton.IsSelected()){
		 			 int rt=200;
		 		 }
				 if(rdbtnNewRadioButton_1.IsSelected()){
					int rt=120;
				 }
				 if(rdbtnNewRadioButton_2.IsSelected()){
					 int rt=100;
				 }
				 if(rdbtnNewRadioButton_3.IsSelected(){
					 int rt=150;
				 }
				 if(rdbtnNewRadioButton_4.IsSelected(){
					 int rt=110;
				 }
				 if(rdbtnNewRadioButton_5.IsSelected(){
					 int rt=190;
				 }
				 if(rdbtnNewRadioButton.IsSelected(){
					 int rt=80;
				 }
//				int c1=comboBox.getSelectedIndex();
//				switch(c1)
//				{
//					case 0:
//				     int  c2=comboBox_1.getSelectedIndex();
//				    
//				if(selectedItem==TVM&&Vtk||selectedItem==Vtka&&TVM){ 
//				     int tp=150;
//				}
//				     else if(selectedItem==TVM&&KKD||selectedItem==KKD&&TVM) {
//				    	 int tp=155;
//				    	 
//				     }
//				else if(selectedItem==TVM&&Qlnd||selectedItem==Qlnd&&TVM) {
//					int tp=160;
//				}
//				else if(selectedItem==TVM&&TSR||selectedItem==TSR&&TVM) {
//					int tp=165;
//				}
//				break;
//				case 1:
//					 int  c2=comboBox_1.getSelectedIndex();
//				   if(selectedItem==KKD&&Vtk||selectedItem==Vtk&&KKD) {
//					int   tp=40;
//				   }
//					else if(selectedItem==KKD&TVM||selectedItem==TVM&&KKD) {
//						int tp=155; 
//					}
//				else if(selectedItem==KKD&&Qlnd||selectedItem==Qlnd&&KKD) {
//					int tp=20;
					
//				}
//				else if(selectedItem==KKD&&TSR||selectedItem==TSR&&KKD) {
//					int tp=120;
//				}
//				else {
//				int tp=0;	 
//				}
//				break;
//				case 2:
//					 int  c2=comboBox_1.getSelectedIndex();
//				 if(selectedItem==Qlndi&&Vtk||selectedItem==Vtk&&Qlndi) {
//					 int tp=20;
//				 }
//				else if(selectedItem==Qlnd&&KKD||selectedItem==KKD&&Qlnd) {
//					int tp=10;
//				}
//				else if(selectedItem==Qlnd&&TVM||selectedItem==TVM&&Qlnd) {
//					int tp= 160;
//				}
//				else if(selectedItem==Qlnd&&TSR||selectedItem==TSR&&Qlnd) {
//					int tp=170;
//				}
//				else {
//					int tp=0;
//				}
//				break;
//				case 3:
//					 int  c2=comboBox_1.getSelectedIndex();
//					 if(selectedItem==Vtk&&KKD||selectedItem==KKD&&Vtk) {
//						 int tp=50;
//					 }
//					else if(selectedItem==Vtk&&TVM||selectedItem==TVM&&Vtk) {
//						int tp=160;
//					}
//					else if(selectedItem==Vtk&&Qlnd||selectedItem==Qlnd&&Vtk) {
//						int tp= 20;
//					}
//					else if(selectedItem==Vtki&&TSR||selectedItem==TSR&&Vtk) {
//						int tp=170;
//					}
//					else {
//						int tp=0;
//					}
//				break;
//			 case 4:
//				 int  c2=comboBox_1.getSelectedIndex();
//				 if(selectedItem==TSR&&Vtk||selectedItem==Vtk&&TSR) {
//					 int tp=150;
//				 }
//				else if(selectedItem==TSR&&KKD||selectedItem==KK&&TSR) {
//					int tp=120;
//				}
//				else if(selectedItem==TSR&&TVM||selectedItem==TVM&&TSR) {
//					int tp= 160;
//				}
//				else if(selectedItem==TSR&&Qlnd||selectedItem==Qlnd&&TSR) {
//					int tp=140;
//				}
//				else {
//					int tp=0;
//				}
//				break;
					
//				     }
//				int subt=rt+tp;
//				String sub=String.format("%.2f",subt);
//				textField_10.setText(sub);
//				int total=subt+20;
//				String totalp=String.format("%.2f",total);
//				textField_11.setText(totalp);
//			}
//			 DefaultTableModel model=(DefaultTableModel)table.getModel();
//				{
//					model.addRow(new String[]{
//				textField.getText(),
				
//				(String)comboBox.getSelectedItem(),
//				(String)comboBox_1.getSelectedItem(),
//				(String)comboBox_2.getSelectedItem(),
//				textField_12.getText(),
				
				
				
			 }
		});
		btnNewButton.setBounds(46, 506, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_9.setText(null);
				textField_11.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_8.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				
				
				
			}
		});
		btnNewButton_1.setBounds(215, 506, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnNewButton_2.setBounds(373, 506, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setBounds(46, 359, 109, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subtotal");
		lblNewLabel_3.setBounds(46, 404, 109, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setBounds(46, 450, 109, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(26, 483, 446, 2);
		frame.getContentPane().add(separator_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(31, 607, 916, 160);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name","Booking-no","From","To","No.of.seats","Ac/nonAc","Tax","Type","price"}
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 896, 138);
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(519, 144, 461, 426);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_5.setBounds(54, 49, 71, 27);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("From");
		lblNewLabel_6.setBounds(54, 130, 71, 27);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("To");
		lblNewLabel_6_1.setBounds(54, 157, 71, 27);
		panel_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Date");
		lblNewLabel_6_1_1.setBounds(54, 217, 71, 27);
		panel_1.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("Time");
		lblNewLabel_6_1_2.setBounds(54, 255, 71, 27);
		panel_1.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("Ticket No");
		lblNewLabel_6_1_3.setBounds(335, 146, 80, 27);
		panel_1.add(lblNewLabel_6_1_3);
		
		JLabel lblNewLabel_6_1_3_1 = new JLabel("Price");
		lblNewLabel_6_1_3_1.setBounds(335, 217, 80, 27);
		panel_1.add(lblNewLabel_6_1_3_1);
		
		JLabel lblNewLabel_7 = new JLabel("Rout");
		lblNewLabel_7.setBounds(335, 300, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		JButton btnNewButton_9 = new JButton("Confirm");
		btnNewButton_9.setBounds(184, 373, 89, 23);
		panel_1.add(btnNewButton_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 55, 211, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 133, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(164, 160, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(164, 220, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(164, 258, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(312, 255, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(312, 325, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(312, 184, 86, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Only 4 Ticket per person at a time");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(97, 127, 294, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(195, 484, 86, -104);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(198, 405, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(195, 451, 86, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(195, 360, 86, 20);
		frame.getContentPane().add(textField_12);
	}
}
