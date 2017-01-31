package pack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class ShowDatabase extends Jframe {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowDatabase frame = new ShowDatabase();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ShowDatabase() {
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDb = new JLabel("»≈”≈…” À≈Ÿ÷œ—≈…œ’");
		lblDb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblDb.setBounds(12, 13, 245, 36);
		contentPane.add(lblDb);
		
		table = new JTable();
		table.setBounds(12, 83, 408, 159);
		contentPane.add(table);
		ShowDb.showT(table);
	}
}
