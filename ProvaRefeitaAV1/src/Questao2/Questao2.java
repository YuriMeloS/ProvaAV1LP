package Questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDs;
	private JTextField txtClasses;
	private JTextField txtTags;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao2 frame = new Questao2();
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
	public Questao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeletores = new JLabel("Qtde de Seletores IDs");
		lblSeletores.setBounds(31, 23, 158, 14);
		contentPane.add(lblSeletores);
		
		JLabel lblClasses = new JLabel("Qtde de Seletores de Classes");
		lblClasses.setBounds(31, 70, 158, 14);
		contentPane.add(lblClasses);
		
		JLabel lblTags = new JLabel("Qtde de Seletores de Tags");
		lblTags.setBounds(31, 121, 147, 14);
		contentPane.add(lblTags);
		
		txtIDs = new JTextField();
		txtIDs.setBounds(226, 20, 86, 20);
		contentPane.add(txtIDs);
		txtIDs.setColumns(10);
		
		txtClasses = new JTextField();
		txtClasses.setBounds(226, 67, 86, 20);
		contentPane.add(txtClasses);
		txtClasses.setColumns(10);
		
		txtTags = new JTextField();
		txtTags.setBounds(226, 118, 86, 20);
		contentPane.add(txtTags);
		txtTags.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ids = Integer.parseInt(txtIDs.getText());
				int classe = Integer.parseInt(txtClasses.getText());
				int tags = Integer.parseInt(txtTags.getText());
				
				int idsNew = ids * 100;
				int classeNew = classe * 10;
				int tagsNew = tags * 1;
				
				int btnCalcular = idsNew + classeNew + tagsNew;
				
				JOptionPane.showMessageDialog(null, "A quantidade total de pontos é de: "+btnCalcular);
				
			}
		});
		btnCalcular.setBackground(new Color(0, 0, 255));
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setBounds(153, 174, 89, 23);
		contentPane.add(btnCalcular);
	}
}
