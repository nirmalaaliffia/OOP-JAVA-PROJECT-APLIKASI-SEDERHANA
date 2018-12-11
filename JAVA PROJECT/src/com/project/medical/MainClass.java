package com.project.medical;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;

import java.io.FileReader;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainClass extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tab;
	private JLabel gambar1Label, Judul1Label,Judul1bLabel,NameLabel, AgeLabel, SistoleLabel, DiastoleLabel, Judul2Label, Judul2bLabel, KolesterolLabel;
	private JPanel Panel1, Panel2, Panel3;
	public static JTextField NameTF, AgeTF, SistoleTF,DiastoleTF, KolesterolTF;
	private JTextField BTinggiTF, BBeratTF, BUmurTF, BNamaTF, BGenderTF;
	private JButton SubmitButton;
	private ImageIcon gambar1;
	
	public MainClass() {
		super("CEK KESEHATAN");
	
		
		tab = new JTabbedPane();
		Panel1 = new JPanel();
		Panel2 = new JPanel(new GridLayout());
		Panel3 = new JPanel( new GridLayout());
		
		
		Panel1.setLayout(null);
	
		Panel1.setBackground(Color.PINK);
		Panel2.setBackground(Color.ORANGE);
		Panel3.setBackground(Color.CYAN);
		
		SubmitButton = new JButton("SUBMIT");
		SubmitButton.setFont(new Font("Copperplate Gothic Bold", Font.BOLD,24));
		gambar1 = new ImageIcon("E:/ECLIPSE/WORKSPACE/JAVA PROJECT/imagesmario.png");
		gambar1Label = new JLabel(gambar1);
		
		Judul1Label = new JLabel("CEK KESEHATAN ");
		Judul1bLabel = new JLabel("TEKANAN DARAH");
		
		NameLabel = new JLabel("Nama       " );
		NameTF = new JTextField(60);
		NameTF.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 20));
		
	    AgeLabel = new JLabel( "Umur       ");
	    AgeTF = new JTextField(2);
	    AgeTF.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 20));
	    
	    SistoleLabel = new JLabel(  "Sistole      ");
	    SistoleTF = new JTextField(5);
	    SistoleTF.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 20));
	   
	    DiastoleLabel = new JLabel ("Diastole    ");
	    DiastoleTF = new JTextField(5);
	    DiastoleTF.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 20));
	    
	    Judul2Label = new JLabel("CEK KESEHATAN");
	    Judul2bLabel = new JLabel("KOLESTEROL");
	    
	    KolesterolLabel = new JLabel("Kolesterol Total    ");
	    KolesterolTF = new JTextField(5);
	   KolesterolTF.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 20));
	    
	    Judul1bLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD,24));
	    Judul1Label.setFont(new Font("Copperplate Gothic Bold", Font.BOLD,24));
		NameLabel.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		
		AgeLabel.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		SistoleLabel.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		DiastoleLabel.setFont(new Font("Britannic Bold", Font.PLAIN,20));
		
		Judul2Label.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 24));
		Judul2bLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 24));
		KolesterolLabel.setFont(new Font("Britannic Bold", Font.PLAIN, 24));
		
		Panel1.add(gambar1Label);
		
	    Panel1.add(Judul1Label);
	    Panel1.add(Judul1bLabel);
	    Panel1.add(NameLabel);
	    Panel1.add(NameTF);
	    
	    
	    Panel1.add(AgeLabel);
	    Panel1.add(AgeTF);
	    Panel1.add(SistoleLabel);
	    Panel1.add(SistoleTF);
	    Panel1.add(DiastoleLabel);
	    Panel1.add(DiastoleTF);
	 
	    Panel1.add(Judul2Label);
	    Panel1.add(Judul2bLabel);
	    Panel1.add(KolesterolLabel);
	    Panel1.add(KolesterolTF);
	    
	    Panel1.add(SubmitButton);
	    
	    gambar1Label.setBounds(600, 70, 400, 400);
	    
	    Judul1Label.setBounds(30, 20, 300, 30);
	    Judul1bLabel.setBounds(300, 20, 300, 30);
	    NameLabel.setBounds(30, 90, 300, 30);
	    AgeLabel.setBounds(30, 160, 300, 30);
	    SistoleLabel.setBounds(30, 230, 300, 30);
	    DiastoleLabel.setBounds(30, 300, 300, 30);
	    
	    NameTF.setBounds(140, 90, 300, 30);
	    AgeTF.setBounds(140, 160, 300, 30);
	    SistoleTF.setBounds(140, 230, 300, 30);
	    DiastoleTF.setBounds(140, 300, 300, 30);
	 
		Judul2Label.setBounds(30, 380, 300, 30);
		Judul2bLabel.setBounds(300, 380, 300, 30);
		KolesterolLabel.setBounds(30, 450, 300, 30);
		KolesterolTF.setBounds(300, 450, 300, 30);
		
		SubmitButton.setBounds(400, 530, 150, 90);
		

	    tab.addTab("Cek Kesehatan", Panel1);
	    
	    Panel2.setLayout(null);
	    Panel2.setBorder(new EmptyBorder(5,5,5,5));
	   // setContentPane(Panel2);
	    JLabel labelJudulDiet = new JLabel("DIET PLAN");
	    labelJudulDiet.setForeground(new Color(51, 0, 102));
		labelJudulDiet.setFont(new Font("Tequilla Sunrise", Font.BOLD, 40));
		labelJudulDiet.setBounds(247, 37, 423, 63);
		Panel2.add(labelJudulDiet);
		
		
		JScrollPane scrollPaneIIsiDiet = new JScrollPane();
		scrollPaneIIsiDiet.setBounds(247, 134, 700, 505);
		Panel2.add(scrollPaneIIsiDiet);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPaneIIsiDiet.setViewportView(textArea);
		
		JButton btnDietHipotensi = new JButton("DIET HIPOTENSI");
		btnDietHipotensi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent hipo) {

				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HIPOTENSI.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textArea.read(bf, null);
					bf.close();
					textArea.requestFocus();
			
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,e1);
					
				}
				
			}
	
		});
		
		btnDietHipotensi.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		btnDietHipotensi.setBounds(36, 156, 182, 40);
		Panel2.add(btnDietHipotensi);
		
		JButton btnDietHipertensi = new JButton("DIET HIPERTENSI");
		btnDietHipertensi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent hiper) {

				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/HIPERTENSI.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textArea.read(bf, null);
					bf.close();
					textArea.requestFocus();
			
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,e1);
					
				}
			}
		});
		
		btnDietHipertensi.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 13));
		btnDietHipertensi.setBounds(36, 292, 182, 40);
		Panel2.add(btnDietHipertensi);
		
		JButton btnDietKolesterol = new JButton("DIET KOLESTEROL");
		btnDietKolesterol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent kol) {

				try {
					FileReader inputdokumen = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP PROJECT/KOLESTEROL.txt");
					BufferedReader bf = new BufferedReader(inputdokumen);
					textArea.read(bf, null);
					bf.close();
					textArea.requestFocus();
			
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,e1);
					
				}
			}
		});
		
		btnDietKolesterol.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 12));
		btnDietKolesterol.setBounds(36, 422, 182, 40);
		Panel2.add(btnDietKolesterol);
	
	    
	    tab.addTab("Diet Plan", Panel2);
	    
	    
	    
	    Panel3.setLayout(null);
	    Panel3.setBorder(new EmptyBorder(5,5,5,5));
	  
	    JLabel lblCheckBeratBadan = new JLabel("CHECK BERAT BADAN");
		lblCheckBeratBadan.setFont(new Font("Tequilla Sunrise", Font.BOLD, 31));
		lblCheckBeratBadan.setBounds(150, 27, 664, 92);
		Panel3.add(lblCheckBeratBadan);
		
		JLabel lblNama = new JLabel("NAMA");
		lblNama.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblNama.setBounds(26, 148, 109, 35);
		Panel3.add(lblNama);
		
		JLabel lblNewLabel = new JLabel("UMUR");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblNewLabel.setBounds(26, 236, 99, 42);
		Panel3.add(lblNewLabel);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblGender.setBounds(26, 329, 143, 35);
		Panel3.add(lblGender);
		
		JLabel lblBeratBadan = new JLabel("BERAT BADAN");
		lblBeratBadan.setFont(new Font("Rockwell", Font.BOLD, 23));
		lblBeratBadan.setBounds(26, 420, 176, 63);
		Panel3.add(lblBeratBadan);
		
		JLabel lblTinggiBadan = new JLabel("TINGGI BADAN");
		lblTinggiBadan.setFont(new Font("Rockwell", Font.BOLD, 23));
		lblTinggiBadan.setBounds(26, 522, 188, 28);
		Panel3.add(lblTinggiBadan);
		
		BTinggiTF = new JTextField();
	/*	BTinggiTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});*/
		
		BTinggiTF.setFont(new Font("Tahoma", Font.PLAIN, 22));
		BTinggiTF.setBounds(226, 511, 310, 42);
		Panel3.add(BTinggiTF);
		BTinggiTF.setColumns(10);
		
		BBeratTF = new JTextField();

		
		BBeratTF.setFont(new Font("Tahoma", Font.PLAIN, 21));
		BBeratTF.setBounds(226, 431, 310, 40);
		Panel3.add(BBeratTF);
		BBeratTF.setColumns(10);
		
		BUmurTF = new JTextField();

		BUmurTF.setFont(new Font("Tahoma", Font.PLAIN, 22));
		BUmurTF.setBounds(226, 239, 310, 42);
		Panel3.add(BUmurTF);
		BUmurTF.setColumns(10);
		
		
		BGenderTF = new JTextField();

		BGenderTF.setBounds(226, 320, 310, 42);
		BGenderTF.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Panel3.add(BGenderTF);
		BGenderTF.setColumns(10);		

		
		BNamaTF = new JTextField();

		BNamaTF.setFont(new Font("Tahoma", Font.PLAIN, 22));
		BNamaTF.setBounds(226, 150, 313, 35);
		Panel3.add(BNamaTF);
		BNamaTF.setColumns(10);
		
		JButton btnCheckIt = new JButton("CHECK IT");
		btnCheckIt.addActionListener(new ActionListener() {
			String nama, umur, gen, BB, TB;
			public void actionPerformed(ActionEvent e) {
				try {
				nama = BNamaTF.getText();
				umur = BUmurTF.getText();
				gen = BGenderTF.getText();
				BB = BBeratTF.getText();
				TB = BTinggiTF.getText();
			
				
				if(nama.isEmpty() || umur.isEmpty() || BB.isEmpty() || TB.isEmpty() || gen.isEmpty() ) {
					JOptionPane.showMessageDialog(SubmitButton, " <!> Input cannot be blank <!>", "Error Message", JOptionPane.WARNING_MESSAGE);
				}
				
				double BBNum = Double.parseDouble(BB);
				double TBNum = Double.parseDouble(TB);
				
			
				
				double convertTB=0; 
				convertTB += TBNum/100;

				double BMI=0;
				BMI += (BBNum)/Math.pow(convertTB, 2);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(556, 119, 400, 450);
				Panel3.add(scrollPane);
				
				JTextArea textAreaBerat = new JTextArea();
				textAreaBerat.setFont(new Font("Monospaced", Font.PLAIN, 21));
				scrollPane.setViewportView(textAreaBerat);
				
				if(BMI < 18.5) {
					//kekurangan berat badan

						// FileReader input = new FileReader("D:/INFORMATIKA/SEMESTER 3/OOP/OOP
						// PROJECT/HIPOTENSI.txt");
						// BufferedReader buffer = new BufferedReader(input);
						textAreaBerat.setText("============================== RESULT ==============================\n"
								+ "  \n" + " + Berat Badan anda KURANG. \n" + " \n" + "+ Cara menambah berat badan : \n"
								+ "   - Tambahkan kalori yang sehari \n" + "   - Pilih makanan padat gizi \n"
								+ "   - Ngemil \n" + "   - Makan dalam porsi kecil \n"
								+ "   - Makan makanan bergizi setiap 3 jam \n"
								+ "   - Makan banyak makanan berprotein dan berlemak \n" + "   - Latihan aerobik \n");
						textAreaBerat.getText();
						// textAreaBerat.read(buffer, null);

						// buffer.close();
						textAreaBerat.requestFocus();

					} else if (BMI >= 18.5 && BMI <= 24.9) {
						// ideal
						textAreaBerat.setText("============= RESULT ===================\n"
								+ "  \n" + " + Berat Badan anda sudah IDEAL. \n" + " \n"
								+ "+ Jagalah kesehatan dan pola makan \n" + "+ Rutin berolahraga \n"
								+ "+ Menjaga Pola hidup sehat. \n");
						textAreaBerat.getText();
						// textAreaBerat.read(buffer, null);

						// buffer.close();
						textAreaBerat.requestFocus();

					} else if (BMI <= 25.0 && BMI <= 29.9) {
						// kelebihan
						textAreaBerat.setText("============= RESULT ===================\n"
								+ "  \n" + " + Berat Badan anda KELEBIHAN dan melewati IDEAL \n" + "  \n"
								+ "+ beberapa cara yang bisa dilakukan agar berat badan turun, \n"
								+ "   namun Anda tidak merasa tersiksa karena kelaparan, meliputi : \n"
								+ "   - Makan pakai piring kecil \n"
								+ "   - Pilih karbohidrat yang mengandung banyak serat \n"
								+ "   - Kurangi makanan berlemak \n" + "   - Makan dalam porsi kecil \n"
								+ "   - Hindari Junk Food dan ganti makanan manis dengan yang lebih sehat \n"
								+ "   - Minum dua gelas air sebelum makan \n" + "   - Olaharaga rutin. \n");

						textAreaBerat.getText();
						// textAreaBerat.read(buffer, null);

						// buffer.close();
						textAreaBerat.requestFocus();

					} else {
						// kegemukan
						textAreaBerat.setText("============= RESULT ===================\n"
								+ "  " + " + Anda mengalami OBESITAS \n" + "  \n" + "+ Cara mengatasi OBESITAS : \n"
								+ "   - Lakukan Olahraga giat dan rutin \n"
								+ "   - Periksakan ke Dokter kesehatan badan anda. \n"
								+ "   - Hentikan kebiasaan nyemil \n" + "   - Ganti polah hidup yang sehat \n"
								+ "   - Lakukan diet intensif dengan panduan dokter \n");

						textAreaBerat.getText();
						// textAreaBerat.read(buffer, null);

						// buffer.close();
						textAreaBerat.requestFocus();
					}

				} catch (NumberFormatException error) {
					JOptionPane.showMessageDialog(SubmitButton, "Age OR Berat badan OR Tinggi Badan must be a number !",
							"Error Message", JOptionPane.ERROR_MESSAGE);
				} /*
					 * catch (FileNotFoundException e1) { // TODO Auto-generated catch block
					 * e1.printStackTrace(); } catch (IOException e1) { // TODO Auto-generated catch
					 * block e1.printStackTrace(); }
					 */

			}
		});

		btnCheckIt.setFont(new Font("Tekton Pro Cond", Font.PLAIN, 28));
		btnCheckIt.setBounds(226, 603, 201, 42);
		Panel3.add(btnCheckIt);
		
	    tab.addTab("Cek Berat Badan", Panel3);
	    
	   getContentPane().add(tab);
	   setSize(970,730);
	   setLocationRelativeTo(null);
	   setVisible(true);
	   setResizable(false);
		
	}
	

	
	public void setupGUI1() {
		SubmitButton.addActionListener(new Button1());
	}
	
	public class Button1 implements ActionListener{
		String name, age, message, sistole, diastole, kolesterol;
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				
				name = NameTF.getText();
				age = AgeTF.getText();
				sistole = SistoleTF.getText();
				diastole = DiastoleTF.getText();
				kolesterol = KolesterolTF.getText();
		//	System.out.println(name + age + sistole + diastole + kolesterol);
				
				if(name.isEmpty() || age.isEmpty() || kolesterol.isEmpty() || sistole.isEmpty() || diastole.isEmpty()) {
					JOptionPane.showMessageDialog(SubmitButton, " <!> Input cannot be blank <!>", "Error Message", JOptionPane.WARNING_MESSAGE);
				}
				
	//			int ageNum = Integer.parseInt(age);
				int sistoleNum = Integer.parseInt(sistole);
				int diastoleNum = Integer.parseInt(diastole);
				int kolesterolNum = Integer.parseInt(kolesterol);
				

				if(sistoleNum > 300 || diastoleNum > 300 || kolesterolNum > 700) {
					JOptionPane.showMessageDialog(SubmitButton, " <!> TEKANAN DARAH DAN KOLESTEROL LANGKAH <!>"
							+ "\n Periksakan Ke Dokter segera", "Error Message", JOptionPane.WARNING_MESSAGE);
				}
				
				else  if(sistoleNum <= diastoleNum) {
					JOptionPane.showMessageDialog(SubmitButton, "Diastole cannot be higher than Sistole", "Error Message", JOptionPane.ERROR_MESSAGE);
				}
			    else if(sistoleNum >= 90 && diastoleNum >= 60 ) {
					if(sistoleNum <= 120 || diastoleNum <= 80) {
						  if(kolesterolNum >= 160) {
						    	if(kolesterolNum <= 200) {
						    		//kolesterol dan jantung normal
						    		HasilInput TD = new HasilInput();
									dispose();
									TD.setVisible(true);
									TD.NormalDarah();
									TD.KolesterolNormal();
									TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
									TD.setResizable(false);
									
									message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "." + "\n"
											+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : " + kolesterolNum;
									JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
						    	}
					    }if(kolesterolNum > 200) {
						    	if(kolesterolNum <= 400) {
						    		//kolesterol hati-hati
						    		HasilInput TD = new HasilInput();
									dispose();
									TD.setVisible(true);
									TD.NormalDarah();
									TD.KolesterolHatiHati();
									TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
									TD.setResizable(false);
									
									message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "."  + "\n"
											+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : " + kolesterolNum;
									JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
						    	}
						    }if(kolesterolNum>400) {
						    	HasilInput TD = new HasilInput();
								dispose();
								TD.setVisible(true);
								TD.NormalDarah();
								TD.KolesterolTinggi();
								TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
								TD.setResizable(false);
								
								message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "."  + "\n"
										+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : " + kolesterolNum;
								JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
						    }
						    if(kolesterolNum <160) {
						    	HasilInput TD = new HasilInput();
								dispose();
								TD.setVisible(true);
								TD.NormalDarah();
								TD.KolesterolRendah();
								TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
								TD.setResizable(false);
								
								message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "."  + "\n"
										+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : " + kolesterolNum;
								JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
						    }
				
						  
						
					}
					if(sistoleNum > 120 && diastoleNum > 80) {
						  if(kolesterolNum >= 160) {
						    	if(kolesterolNum <= 200) {
						    		//kolesterol normal jantung tinggi
						    		HasilInput TD = new HasilInput();
									dispose();
									TD.setVisible(true);
									TD.hasilHipertensi();
									TD.KolesterolNormal();
									TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
									TD.setResizable(false);
									
									message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "."  + "\n"
											+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : " + kolesterolNum;
									JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
						    	}
						    }if(kolesterolNum > 200) {
						    	if(kolesterolNum <= 400) {
						    		//kolesterol hati-hati jantung tinggi
						    		HasilInput TD = new HasilInput();
									dispose();
									TD.setVisible(true);
									TD.hasilHipertensi();
									TD.KolesterolNormal();
									TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
									TD.setResizable(false);
									
									message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "."  + "\n"
											+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : " + kolesterolNum;
									JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
						    	}
						    } if(kolesterolNum>400) {
						    	//kolesterol tinggi jantung tinggi
						    	HasilInput TD = new HasilInput();
								dispose();
								TD.setVisible(true);
								TD.hasilHipertensi();
								TD.KolesterolTinggi();
								TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
								TD.setResizable(false);
								
								message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "."  + "\n"
										+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : "+ kolesterolNum;
								JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
						    }
						     if(kolesterolNum <160) {
						    	//kolesterol rendah jantung tingi
						    	HasilInput TD = new HasilInput();
								dispose();
								TD.setVisible(true);
								TD.hasilHipertensi();
								TD.KolesterolRendah();
								TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
								TD.setResizable(false);
								
								message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "." + "\n"
										+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : " + kolesterolNum;
								JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
						    }
					
					}
			
				}
				if(sistoleNum < 90 || diastoleNum < 60) {
					  if(kolesterolNum >= 160) {
					    	if(kolesterolNum <= 200) {
					    		//kolesterol normal jantng rendah
					    		HasilInput TD = new HasilInput();
								dispose();
								TD.setVisible(true);
								TD.hasilHipotensi();
								TD.KolesterolNormal();
								TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
								TD.setResizable(false);
								
								message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "."  + "\n"
										+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : "+ kolesterolNum;
								JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
					    		
					    	}
					    } if(kolesterolNum > 200) {
					    	if(kolesterolNum <= 400) {
					    		//kolesterol hati-hati antnng rendah
					    		HasilInput TD = new HasilInput();
								dispose();
								TD.setVisible(true);
								TD.hasilHipotensi();
								TD.KolesterolHatiHati();
								TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
								TD.setResizable(false);
								
								message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "."  + "\n"
										+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : "+ kolesterolNum;
								JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
					    		
					    	}
					    }if(kolesterolNum>400) {
					    	//kolesterol tinggi jantungr enda
					    	HasilInput TD = new HasilInput();
							dispose();
							TD.setVisible(true);
							TD.hasilHipotensi();
							TD.KolesterolTinggi();
							TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
							TD.setResizable(false);
							
							message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "." + "\n"
									+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : "+ kolesterolNum;
							JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
				    		
					    }
					    if(kolesterolNum <160) {
					    	//kolesterol rendah jantung rendah
					    	HasilInput TD = new HasilInput();
							dispose();
							TD.setVisible(true);
							TD.hasilHipotensi();
							TD.KolesterolRendah();
							TD.setDefaultCloseOperation(EXIT_ON_CLOSE);
							TD.setResizable(false);
							
							message = "HAI Selamat Datang  " + name + " Kamu sedang cek Kesehatan dan Umur kamu " + age + "." + "\n"
									+ "Tekanan darah : " + sistoleNum + "/" + diastoleNum + " dan Kolesterol : "+ kolesterolNum;
							JOptionPane.showMessageDialog(SubmitButton, message,  " Congratulation Message ", JOptionPane.INFORMATION_MESSAGE);
				    		
					    }
				
				}
			 
				
			    
			  
				
			}catch(NumberFormatException error) {
				JOptionPane.showMessageDialog(SubmitButton, "Age OR Kolesterol OR Sistole OR Diastole must be a number !", "Error Message", JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		
	}
	
	

	public static void main(String args[]) {
		MainClass MC = new MainClass();
		MC.setupGUI1();
		MC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	

}



