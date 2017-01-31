package pack;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTable;

public class MainGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
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
	public MainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 525, 317));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//коцотупо
		JLabel label = new JLabel("\u039A\u03A4\u0395\u039B ...........");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		label.setBounds(30, 0, 132, 30);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0395\u0399\u03A3\u0399\u03A4\u0397\u03A1\u0399\u039F");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label_1.setBounds(40, 24, 62, 14);
		contentPane.add(label_1);
	
	//дяолокоциа
		JLabel label_2 = new JLabel("\u0394\u03A1\u039F\u039C\u039F\u039B\u039F\u0393\u0399\u0391");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_2.setBounds(30, 84, 88, 14);
		contentPane.add(label_2);
		
		String[] msgs = {"","ахгма - патяа", "ахгма - ацяимио", "ахгма - бокос"};
		JComboBox comboBox = new JComboBox(msgs);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(120, 84, 122, 20);
		contentPane.add(comboBox);
		
	//гл/миа
		JLabel label_8 = new JLabel("\u0397\u039C/\u039D\u0399\u0391");
		label_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_8.setBounds(260, 84, 50, 14);
		contentPane.add(label_8);
		
		textField = new JTextField();
		textField.setBounds(310, 84, 80, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
	//аяихлос кеыжояеиоу
		JLabel label_3 = new JLabel("\u0391\u03A1\u0399\u0398. \u039B\u0395\u03A9\u03A6.");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_3.setBounds(40, 137, 78, 14);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(123, 137, 49, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
	//хесг
		JLabel label_4 = new JLabel("\u0398\u0395\u03A3\u0397");
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_4.setBounds(262, 137, 46, 14);
		contentPane.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(306, 137, 45, 16);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
	//стоивеиа епибатг
		JLabel label_5 = new JLabel("\u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u0391 \u0395\u03A0\u0399\u0392\u0391\u03A4\u0397");
		label_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_5.setBounds(30, 181, 114, 14);
		contentPane.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 181, 91, 14);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
	//ейптысг
		JLabel label_6 = new JLabel("*\u0395\u039A\u03A0\u03A4\u03A9\u03A3\u0397");
		label_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_6.setBounds(266, 181, 62, 14);
		contentPane.add(label_6);
		
		String[] msgs2 = {"", "50% жоититийо", "50% покутеймо"};
		JComboBox comboBox_2 = new JComboBox(msgs2);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox_2){
					JComboBox cb = (JComboBox)e.getSource();
					String mes = (String)cb.getSelectedItem();
					switch (mes){
					case "": Label_10.setText("40,00─");
						break;
					case "50% жоититийо": Label_10.setText("20,00─");
						break;
					case "50% покутеймо": Label_10.setText("20,00─");
						break;
					default: Label_10.setText("");
					}
				}
			}
		});
		comboBox_2.setBounds(327, 178, 105, 20);
		contentPane.add(comboBox_2);
		
	//тилг
		JLabel label_7 = new JLabel("\u03A4\u0399\u039C\u0397");
		label_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		label_7.setBounds(127, 224, 34, 14);
		contentPane.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(164, 224, 51, 14);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
	//йатывгяысг
		JButton btnAdd = new JButton("\u039A\u0391\u03A4\u03A9\u03A7\u0397\u03A1\u03A9\u03A3\u0397");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passenger=textField_2.getText();
				Connection conn = null;
				String query = null;
				PreparedStatement statement = null;

				conn = Driver.Drv();
				
				try {
				query = "insert into АХГМА - ПАТЯА (стоивеиа епибатг) values (?)";
				statement = conn.prepareStatement(query);
				statement.setString(1,passenger);
				statement.execute();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(280, 220, 132, 23);
		contentPane.add(btnAdd);  
		
	//ейтупысг
		JButton btnPnt = new JButton("ейтупысг");
		btnPnt.setBounds(280, 250, 132, 23);
		contentPane.add(btnPnt);
		
	//елжамисг басгс
		JButton btnShow = new JButton("елжамисг басгс");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowDatabase frame1 = new ShowDatabase();
				frame1.setVisible(true);
			}
		});
		btnShow.setBounds(40, 250, 150, 20);
		contentPane.add(btnShow);
		
	}
}

