package swings1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;

public class studentdetails {

	private JFrame frame;
	private JTextField textField;
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
	private JTextField textField_13;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentdetails window = new studentdetails();
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
	public studentdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 931, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 442, 326);
		panel.setBackground(Color.CYAN);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setBounds(10, 11, 108, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student_Id");
		lblNewLabel_1.setBounds(10, 55, 94, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First name");
		lblNewLabel_1_1.setBounds(10, 90, 94, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setBounds(10, 125, 94, 24);
		panel.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(114, 57, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 92, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(114, 127, 86, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Coursecode");
		lblNewLabel_1_2_1.setBounds(10, 160, 94, 24);
		panel.add(lblNewLabel_1_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1101E", "1102B", "1101C", "1101D"}));
		comboBox.setBounds(114, 161, 86, 22);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 195, 173, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Total score");
		lblNewLabel_2.setBounds(10, 208, 86, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Average");
		lblNewLabel_2_1.setBounds(10, 249, 86, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Rankig");
		lblNewLabel_2_2.setBounds(10, 286, 86, 14);
		panel.add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(114, 208, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(114, 283, 86, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(114, 246, 86, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_3 = new JLabel("Maths");
		lblNewLabel_1_3.setBounds(235, 20, 94, 24);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("English");
		lblNewLabel_1_4.setBounds(235, 55, 94, 24);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Biology");
		lblNewLabel_1_5.setBounds(235, 90, 94, 24);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Computer");
		lblNewLabel_1_6.setBounds(235, 125, 94, 24);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Chemistry");
		lblNewLabel_1_7.setBounds(235, 160, 94, 24);
		panel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Physics");
		lblNewLabel_1_8.setBounds(235, 203, 94, 24);
		panel.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Thamil");
		lblNewLabel_1_9.setBounds(235, 244, 94, 24);
		panel.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_9_1 = new JLabel("Malayalam");
		lblNewLabel_1_9_1.setBounds(235, 281, 94, 24);
		panel.add(lblNewLabel_1_9_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(330, 22, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(330, 57, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(330, 92, 86, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(330, 127, 86, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(330, 162, 86, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(330, 205, 86, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(330, 244, 86, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(330, 283, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(474, 11, 431, 326);
		panel_1.setBackground(Color.PINK);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 23, 85, 2);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Student Report");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(26, 11, 145, 14);
		panel_1.add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 39, 395, 249);
		panel_1.add(textArea);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
			
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBounds(181, 299, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Report");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m=Integer.parseInt(textField_6.getText());
				int eng=Integer.parseInt(textField_7.getText());
			 int bio=Integer.parseInt(textField_8.getText());
				int com=Integer.parseInt(textField_9.getText());
				int ph=Integer.parseInt(textField_10.getText());
				int Th=Integer.parseInt(textField_11.getText());
				int mal=Integer.parseInt(textField_13.getText());
//				int total=Integer.parseInt(textField_3.getText());
//				int avg=Integer.parseInt(textField_5.getText());
//				int rank=Integer.parseInt(textField_4.getText());
				double total=m+eng+bio+com+ph+Th+mal;
				double avg=total/8;
				String st=String.format("%.2f",total);
				textField_3.setText(st);
				String avrg=String.format("%.2f",avg);
				textField_5.setText(avrg);
//				textField_4.setText("1");

				if(total>=700)
				{
					textField_4.setText("1");
					
				}
				else if(total>=600&&total<700) {
					textField_4.setText("2");
				
				}
				else if(total>=500&&total<600) {
					textField_4.setText("3");
				}
				else	if(total>=400&&total<500) {
					textField_4.setText("4");
		
				}
				else if(total>=300&&total<400) {
					textField_4.setText("5");
				}
				else if(total>=200&&total<300) {
					textField_4.setText("6");
				}
				else {
					textField_4.setText("");
				}
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				{
					model.addRow(new String[]{
							textField.getText(),
							(String)comboBox.getSelectedItem(),
							textField_6.getText(),
							textField_7.getText(),
							textField_8.getText(),
							textField_9.getText(),
							textField_10.getText(),
							textField_11.getText(),
							textField_12.getText(),
							textField_13.getText(),
							textField_3.getText(),
							textField_5.getText(),
							textField_4.getText()
		});
			}
			}
		});
				
		btnNewButton_1.setBounds(36, 522, 89, 23);
		btnNewButton_1.setForeground(Color.GREEN);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow (row);
			}
		});
		btnNewButton_1_1.setBounds(135, 522, 89, 23);
		btnNewButton_1_1.setForeground(Color.RED);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Show report");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
						+"Student Name:\t\t"+textField.getText()+textField_1.getText()
						+"\n=========================================================\n"
						+"Maths:\t\t"+textField_6.getText()
						+"\nEnglish:\t\t"+textField_7.getText()
						+"\nBiology:\t\t"+textField_8.getText()
						+"\nComputer:\t\t"+textField_9.getText()
						+"\nChemistry:\t\t"+textField_10.getText()
						+"\nPhysics:\t\t"+textField_11.getText()
						+"\nThamil:\t\t"+textField_12.getText()
						+"\nMalayalam:\t\t"+textField_13.getText()
						+"\n=======================================\n"
						+"\nTotal:\t\t"+textField_3.getText()
						+"\nAverage:\t\t"+textField_5.getText()
						+"\nBiology:\t\t"+textField_4.getText());
				
				         
				
			}
		});
		btnNewButton_1_2.setBounds(234, 522, 89, 23);
		btnNewButton_1_2.setForeground(Color.ORANGE);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Exit");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnNewButton_1_3.setBounds(459, 522, 89, 23);
		btnNewButton_1_3.setForeground(Color.MAGENTA);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Reset");
		btnNewButton_1_4.setBounds(574, 522, 89, 23);
		btnNewButton_1_4.setForeground(Color.CYAN);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				
				
			}
		});
		frame.getContentPane().add(btnNewButton_1_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(10, 368, 895, 112);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_id", "Coursecode","Maths","English","Biology","Computer","Chemistry","Physics","Thamil","Malayalam","Total","Average","Ranking"}
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 875, 60);
		panel_2.add(table);
	}
}
