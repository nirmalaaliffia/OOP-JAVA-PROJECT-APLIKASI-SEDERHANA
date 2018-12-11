package com.project.medical;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class HasilInput extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane_tab1;

	
	public HasilInput() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 627);
		setResizable(false);
		contentPane_tab1 = new JPanel();
		contentPane_tab1.setBackground(new Color(204, 153, 255));
		contentPane_tab1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_tab1);
		contentPane_tab1.setLayout(null);
		
		JLabel labelHasilCek = new JLabel("Hasil Check Tekanan Darah & Kolesterol");
		labelHasilCek.setForeground(new Color(51, 0, 102));
		labelHasilCek.setFont(new Font("Monotype Corsiva", Font.BOLD, 40));
		labelHasilCek.setBounds(149, 13, 692, 52);
		contentPane_tab1.add(labelHasilCek);
		
		
		JLabel Label_TekananDarah = new JLabel("TEKANAN DARAH");
		Label_TekananDarah.setFont(new Font("Tequilla Sunrise", Font.BOLD, 18));
		Label_TekananDarah.setBounds(23, 90, 295, 52);
		contentPane_tab1.add(Label_TekananDarah);
		
		JLabel Label_Kolesterol = new JLabel("KOLESTEROL");
		Label_Kolesterol.setFont(new Font("Tequilla Sunrise", Font.BOLD, 18));
		Label_Kolesterol.setBounds(480, 101, 256, 30);
		contentPane_tab1.add(Label_Kolesterol);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainClass MC = new MainClass();			
				dispose();
				MC.setupGUI1();
				MC.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 27));
		btnNewButton.setBounds(826, 78, 120, 35);
		contentPane_tab1.add(btnNewButton);
		
	
	}
	
	public void KolesterolNormal() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(480, 144, 470, 423);
		contentPane_tab1.add(scrollPane);
	
		JTextArea textAreakolesterol = new JTextArea();		
		textAreakolesterol.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {				
				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HasilNormalKolesterol.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textAreakolesterol.read(bf, null);
					bf.close();
					textAreakolesterol.requestFocus();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			public void ancestorMoved(AncestorEvent event) {
		
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textAreakolesterol.setBackground(new Color(204, 255, 255));
		textAreakolesterol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreakolesterol);
	}
	
	public void KolesterolRendah() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(480, 144, 470, 423);
		contentPane_tab1.add(scrollPane);
	
		JTextArea textAreakolesterol = new JTextArea();		
		textAreakolesterol.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {				
				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HasilRendahKolesterol.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textAreakolesterol.read(bf, null);
					bf.close();
					textAreakolesterol.requestFocus();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			public void ancestorMoved(AncestorEvent event) {
		
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textAreakolesterol.setBackground(new Color(204, 255, 255));
		textAreakolesterol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreakolesterol);
	}
	
	public void KolesterolHatiHati() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(480, 144, 470, 423);
		contentPane_tab1.add(scrollPane);
	
		JTextArea textAreakolesterol = new JTextArea();		
		textAreakolesterol.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {				
				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HasilHatiHatiKolesterol.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textAreakolesterol.read(bf, null);
					bf.close();
					textAreakolesterol.requestFocus();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			public void ancestorMoved(AncestorEvent event) {
		
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textAreakolesterol.setBackground(new Color(204, 255, 255));
		textAreakolesterol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreakolesterol);
	}
	
	public void KolesterolTinggi() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(480, 144, 470, 423);
		contentPane_tab1.add(scrollPane);
	
		JTextArea textAreakolesterol = new JTextArea();		
		textAreakolesterol.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {				
				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HasilTinggiKolesterol.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textAreakolesterol.read(bf, null);
					bf.close();
					textAreakolesterol.requestFocus();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			public void ancestorMoved(AncestorEvent event) {
		
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textAreakolesterol.setBackground(new Color(204, 255, 255));
		textAreakolesterol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreakolesterol);
	}
	
	public void Kolesterolbahaya() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(480, 144, 470, 423);
		contentPane_tab1.add(scrollPane);
	
		JTextArea textAreakolesterol = new JTextArea();		
		textAreakolesterol.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {				
				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/KOLESTEROLBAHAYA.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textAreakolesterol.read(bf, null);
					bf.close();
					textAreakolesterol.requestFocus();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			public void ancestorMoved(AncestorEvent event) {
		
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		textAreakolesterol.setBackground(new Color(204, 255, 255));
		textAreakolesterol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreakolesterol);
	}
	
	
	public void NormalDarah() {		
				
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 144, 437, 423);
		contentPane_tab1.add(scrollPane_1);
	
		
		JTextArea textAreadarah = new JTextArea();
		textAreadarah.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent ev) {
				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HasilNormalDarah.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textAreadarah.read(bf, null);
					bf.close();
					textAreadarah.requestFocus();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		textAreadarah.setBackground(new Color(255, 204, 255));
		textAreadarah.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane_1.setViewportView(textAreadarah);
	}
   
	public void hasilHipertensi() {
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 144, 437, 423);
		contentPane_tab1.add(scrollPane_1);
	
		
		JTextArea textAreadarah = new JTextArea();
		textAreadarah.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent ev) {
				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HasilHipertensi.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textAreadarah.read(bf, null);
					bf.close();
					textAreadarah.requestFocus();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		textAreadarah.setBackground(new Color(255, 204, 255));
		textAreadarah.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane_1.setViewportView(textAreadarah);
	}
	
	public void hasilHipotensi() {
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 144, 437, 423);
		contentPane_tab1.add(scrollPane_1);
	
		
		JTextArea textAreadarah = new JTextArea();
		textAreadarah.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent ev) {
				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HasilHipotensi.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textAreadarah.read(bf, null);
					bf.close();
					textAreadarah.requestFocus();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		textAreadarah.setBackground(new Color(255, 204, 255));
		textAreadarah.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane_1.setViewportView(textAreadarah);
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HasilInput Hasiltab1frame = new HasilInput();
					Hasiltab1frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
