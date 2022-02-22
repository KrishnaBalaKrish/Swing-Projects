package swings1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double n1,n2,result;
	String op,ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 936, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple calculator");
		lblNewLabel.setBounds(52, 11, 193, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setForeground(Color.GREEN);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(10, 38, 596, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					b=str.toString();
					textField.setText(b);
				}
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(10, 94, 55, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			textField.setText(null);
			}
		});
		btnCe.setBackground(Color.LIGHT_GRAY);
		btnCe.setBounds(74, 94, 55, 37);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(139, 94, 55, 37);
		frame.getContentPane().add(btnC);
		
		JButton btnNewButton_1 = new JButton("+/-");
		btnNewButton_1.setBounds(204, 94, 55, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		 JButton btn2 = new JButton("7");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
String Number=textField.getText()+"7";
				textField.setText(Number);
			}
		});
		btn2.setBounds(10, 141, 55, 37);
		frame.getContentPane().add(btn2);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"8";
				textField.setText(Number);
			}
		});
		btnNewButton_3.setBounds(75, 141, 55, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"9";
				textField.setText(Number);
			}
			
		});
		btnNewButton_4.setBounds(139, 142, 55, 37);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("/");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="/";
			}
		});
		btnNewButton_5.setBounds(204, 142, 55, 37);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"4";
				textField.setText(Number);
			}
		});
		btnNewButton_6.setBounds(10, 189, 55, 37);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"5";
				textField.setText(Number);
			}
		});
		btnNewButton_7.setBounds(75, 189, 55, 37);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"6";
				textField.setText(Number);
			}
		});
		btnNewButton_8.setBounds(139, 190, 55, 37);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("*");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="+";
			}
		});
		btnNewButton_9.setBounds(204, 190, 55, 37);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"0";
				textField.setText(Number);
			}
		});
		btnNewButton_10.setBounds(9, 289, 120, 37);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton(".");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+".";
				textField.setText(Number);
				
			}
			
		});
		btnNewButton_11.setBounds(139, 289, 55, 37);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="+";
			}
		});
		btnNewButton_12.setBounds(204, 289, 55, 37);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.sqrt(n1);
				textField.setText(String.valueOf(n1));
				
			}
		});
		btnSqrt.setBounds(269, 94, 69, 37);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.log(n1);
				textField.setText(String.valueOf(n1));
			}
		});
		btnL.setBounds(337, 94, 69, 37);
		frame.getContentPane().add(btnL);
		
		JButton btnSqrt_1_1 = new JButton("sin");
		btnSqrt_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.sin(n1);
				textField.setText(String.valueOf(n1));
			}
		});
		btnSqrt_1_1.setBounds(405, 94, 69, 37);
		frame.getContentPane().add(btnSqrt_1_1);
		
		JButton btnSqrt_1_2 = new JButton("sinh");
		btnSqrt_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.sinh(n1);
				textField.setText(String.valueOf(n1));
			}
		});
		btnSqrt_1_2.setBounds(473, 94, 69, 37);
		frame.getContentPane().add(btnSqrt_1_2);
		
		JButton btnSqrt_2 = new JButton("%");
		btnSqrt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=n1/100;
				textField.setText(String.valueOf(n1));
			}
		});
		btnSqrt_2.setBounds(269, 141, 69, 37);
		frame.getContentPane().add(btnSqrt_2);
		
		JButton btnPi = new JButton("pi");
		btnPi.setBounds(337, 141, 69, 37);
		frame.getContentPane().add(btnPi);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.cos(n1);
				textField.setText(String.valueOf(n1));
			}
		});
		btnCos.setBounds(405, 141, 69, 37);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			n1=Double.parseDouble(textField.getText());
			n1=Math.cosh(n1);
			textField.setText(String.valueOf(n1));
			}
		});
		btnCosh.setBounds(473, 141, 69, 37);
		frame.getContentPane().add(btnCosh);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=1/n1;
				textField.setText(String.valueOf(n1));
			}
		});
		btnx.setBounds(269, 189, 69, 37);
		frame.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXy.setBounds(337, 189, 69, 37);
		frame.getContentPane().add(btnXy);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.tan(n1);
				textField.setText(String.valueOf(n1));
			}
		});
		btnTan.setBounds(405, 189, 69, 37);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.tanh(n1);
				textField.setText(String.valueOf(n1));
			}
		});
		btnTanh.setBounds(473, 189, 69, 37);
		frame.getContentPane().add(btnTanh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=n1/100;
				textField.setText(String.valueOf(n1));
			}
		});
		btnMod.setBounds(541, 94, 69, 37);
		frame.getContentPane().add(btnMod);
		
		JButton btnInx = new JButton("Inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.log(n1);
				textField.setText(String.valueOf(n1));
				
			}
		});
		btnInx.setBounds(541, 141, 69, 37);
		frame.getContentPane().add(btnInx);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC_1.setBounds(541, 189, 69, 37);
		frame.getContentPane().add(btnC_1);
		
		JButton btnNewButton_13 = new JButton("1");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"1";
				textField.setText(Number);
			}
		});
		btnNewButton_13.setBounds(10, 237, 55, 37);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("2");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"2";
				textField.setText(Number);
			}
		});
		btnNewButton_14.setBounds(74, 237, 55, 37);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("3");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+"3";
				textField.setText(Number);
			}
		});
		btnNewButton_15.setBounds(139, 238, 55, 37);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("-");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="-";
			}
		});
		btnNewButton_16.setBounds(204, 238, 55, 37);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnSqrt_6_1 = new JButton("=");
		btnSqrt_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2=Double.parseDouble(textField.getText());
			if(op=="+") {
				result=n1+n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			if(op=="-") {
				result=n1-n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			if(op=="*") {
				result=n1*n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			if(op=="/") {
				result=n1/n2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			if(op=="^") {
				result=Math.pow(n1, n2);
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			if(op=="cbr") {
				result=(n1/n2)*100;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
			}
		});
		btnSqrt_6_1.setBounds(269, 237, 69, 89);
		frame.getContentPane().add(btnSqrt_6_1);
		
		JButton btnSqrt_6_2 = new JButton("x^2");
		btnSqrt_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.pow(n1,2);
				textField.setText(String.valueOf(n1));
			}
		});
		btnSqrt_6_2.setBounds(337, 237, 69, 37);
		frame.getContentPane().add(btnSqrt_6_2);
		
		JButton btnSqrt_6_3 = new JButton("Cbr");
		btnSqrt_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="cbr";
			}
		});
		btnSqrt_6_3.setBounds(405, 237, 69, 37);
		frame.getContentPane().add(btnSqrt_6_3);
		
		JButton btnSqrt_6_4 = new JButton("Rund");
		btnSqrt_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.round(n1);
				textField.setText(String.valueOf(n1));
			}
		});
		btnSqrt_6_4.setBounds(473, 237, 69, 37);
		frame.getContentPane().add(btnSqrt_6_4);
		
		JButton btnSqrt_6_5 = new JButton("2pi");
		btnSqrt_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=2*3.14;
				textField.setText(String.valueOf(n1));
			}
		});
		btnSqrt_6_5.setBounds(541, 237, 69, 37);
		frame.getContentPane().add(btnSqrt_6_5);
		
		JButton btnSqrt_6_6 = new JButton("x^3");
		btnSqrt_6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				n1=Math.pow(n1,3);
				textField.setText(String.valueOf(n1));
			}
		});
		btnSqrt_6_6.setBounds(337, 289, 69, 37);
		frame.getContentPane().add(btnSqrt_6_6);
		
		JButton btnSqrt_6_7 = new JButton("Bin");
		btnSqrt_6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n1=Integer.parseInt(textField.getText());
		        textField.setText(Integer.toBinaryString(n1));
				
			}
		});
		btnSqrt_6_7.setBounds(405, 289, 69, 37);
		frame.getContentPane().add(btnSqrt_6_7);
		
		JButton btnSqrt_6_8 = new JButton("Hexa");
		btnSqrt_6_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(textField.getText());
		        textField.setText(Integer.toHexString(n1));
			}
		});
		btnSqrt_6_8.setBounds(473, 289, 69, 37);
		frame.getContentPane().add(btnSqrt_6_8);
		
		JButton btnSqrt_6_9 = new JButton("Oct");
		btnSqrt_6_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(textField.getText());
		        textField.setText(Integer.toOctalString(n1));
			}
		});
		btnSqrt_6_9.setBounds(541, 289, 69, 37);
		frame.getContentPane().add(btnSqrt_6_9);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(624, 38, 269, 288);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Converter");
		lblNewLabel_1.setBounds(75, 11, 125, 34);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 142, 103, 34);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("INDIA   =");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(39, 146, 89, 24);
		panel.add(lblNewLabel_2);
		
		 final JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBackground(new Color(148, 0, 211));
		lblNewLabel_3.setBounds(94, 187, 71, 25);
		panel.add(lblNewLabel_3);
		JButton btnNewButton_17 = new JButton("Convert to Indian rs");btnNewButton_17.setBounds(10, 223, 130, 54);
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_17_1 = new JButton("Clear");
		btnNewButton_17_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_17_1.setBounds(170, 233, 89, 34);
		panel.add(btnNewButton_17_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"America", "Dubai", "Soudi", "Canada"}));
		comboBox.setBounds(78, 71, 103, 34);
		panel.add(comboBox);
		
	

		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     String n="";

//				JComboBox comboBox = null;
				double str=comboBox.getSelectedIndex();
			     String s=String.format("%f",str);
//			     lblNewLabel_3.setText(s);
			 n=textField.getText();
			double n4=Double.parseDouble(n); 
			
//		     ans="dfghj";
		     
		     if(str==0.0) {
		    	 result=n1/61.06;
		    	 ans=String.format("%2f",result);
		    	 lblNewLabel_3.setText(ans);
		     }
//		     if(str==1) {
//		    	 result=n1/58.54;
//		    	 ans=String.format("%2f",result);
//		    	 lblNewLabel_3.setText(ans);
//		     }
//		     if(str==2) {
//		    	 result=n1/20.42;
//		    	 ans=String.format("%2f",result);
//		    	 lblNewLabel_3.setText(ans);
//		     }
//		     if(str==3) {
//		    	 result=n1/19.98;
//		    	 ans=String.format("%2f",result);
//		    	 lblNewLabel_3.setText(ans);
//		     }
		     
		     
			
//				if(comboBox.getSelectedItem().equals("America"))
//				{
//				result=n1/61.06;
//				ans=String.format("%.2f",result);
//				textField.setText(ans);
//				
//				}
//
//				if(comboBox.getSelectedItem().equals("Canada")) {
//					result=n1/58.54;
//					ans=String.format("%.2f",result);
//					lblNewLabel_3.setText(ans);
//				}
//				if(comboBox.getSelectedItem().equals("Dubai")) {
//				result=n1/20.42;
//				ans=String.format("%.2f",result);
//				lblNewLabel_3.setText(ans);
//			}
//				if(comboBox.getSelectedItem().equals("Soudi")) {
//			result=n1/19.98;
//			ans=String.format("%.2f",result);
//			lblNewLabel_3.setText(ans);
//				}
			}
		});
	}
}
