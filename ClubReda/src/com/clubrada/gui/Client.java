package com.clubrada.gui;

import static javax.swing.border.TitledBorder.LEFT;


import static javax.swing.border.TitledBorder.TOP;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;


import com.github.lgooddatepicker.components.DatePicker;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")

public class Client extends JFrame{
	/*
	private CountryTableModel model;
	private TableRowSorter<CountryTableModel> sorter;
	private JTable countryTable;
	*/
	private JLabel lbl_code,lbl_nom,lbl_prénom,lbl_age,lbl_sexe,lbl_tele,lbl_adresse,lbl_photo,
	                lbl_dateInscri,lbl_dateRenouv,lbl_dateExpir ,lbl_Frais,lbl_fraisInscri;
	private JTextField txt_code,txt_nom,txt_prénom ,
	                    txt_frais,txt_fraisInscri ;
	private JTextArea txt_adress;
	private MaskFormatter txt_tele;
	DatePicker date_inscri, date_renouv, date_expir;
	private JSpinner spinner_age;
	private JButton bt_ImportPhoto;
	private JPanel leftPanel, mainPanel,rightPanel,activitéPanel;
	private JRadioButton rb_femme,rb_homme;
	private JCheckBox  ch_muscu,ch_FullCon,ch_karati,ch_fitnesse;
	 
	 private Color borderColor = new Color(0, 169,161);
	 private Font borderHeaderFont = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
	 
	public Client() throws ParseException{
		setTitle("Gestion des Adhérent");
		Dimension screenDimension = getToolkit().getScreenSize();
		setBounds((int) (screenDimension.getWidth() / 8), (int) (screenDimension.getHeight() / 8),
				(int) (3 * screenDimension.getWidth() / 4), (int) (3 * screenDimension.getHeight() / 4));
		setMinimumSize(new Dimension(950, 450));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
        mainPanel = new JPanel();
        mainPanel.setLayout(
        		new MigLayout("insets 7 7 7 7, wrap 3","[fill,grow,40%][fill,grow,30%][fill,grow,30%]", ""));
             
        leftPanel = new JPanel();
        leftPanel.setLayout(new MigLayout("wrap 3", "[align right][fill,grow]",""));
        leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(borderColor),
				" Client", LEFT, TOP, borderHeaderFont, Color.DARK_GRAY));
       
        rightPanel = new JPanel();
	    rightPanel.setLayout(new MigLayout("wrap 2", "[align right][fill,grow]",""));
	    rightPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(borderColor),
				"Inscription", LEFT, TOP, borderHeaderFont, Color.DARK_GRAY));
	      
	      
	      activitéPanel = new JPanel();
	      activitéPanel.setLayout(new MigLayout("wrap 2", "",""));
	      activitéPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(borderColor),
					   "Activité", LEFT, TOP, borderHeaderFont, Color.DARK_GRAY));
	   
        
        lbl_code = new JLabel("Code :");       
        lbl_nom = new JLabel("Nom :");     
        lbl_prénom = new JLabel("Prénom :");     
        lbl_age = new JLabel("Age :");    
        lbl_sexe = new JLabel("Sexe :");     
        lbl_tele = new JLabel("Télèphone :");      
        lbl_adresse = new JLabel("Adresse :");
        
        lbl_photo=new JLabel("Photo");
        lbl_photo.setHorizontalAlignment(JLabel.CENTER);
        lbl_photo.setPreferredSize(new Dimension(90, 90));
        lbl_photo.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        
        bt_ImportPhoto= new JButton("Importer");
        
        lbl_dateInscri = new JLabel("Date Inscription :");
        lbl_dateRenouv = new JLabel("Date Renouvellement :");
        lbl_dateExpir = new JLabel("Date D'expiration :");
        lbl_Frais = new JLabel("Frais Mensuels :");
        lbl_fraisInscri = new JLabel("Frais Inscription :");
        
        txt_code = new JTextField();
        txt_nom = new JTextField();
        txt_prénom = new JTextField();
        
        spinner_age= new JSpinner(new SpinnerNumberModel(16, 10, 100, 1));
        rb_femme = new JRadioButton("Femme");
        rb_homme = new JRadioButton("Homme");
        ButtonGroup btG = new ButtonGroup();
		btG.add(rb_femme);
		btG.add(rb_homme);
        try{
        	txt_tele = new MaskFormatter("06-##-##-##-##");
        }catch(ParseException e){
        	e.printStackTrace();
        }
        
        txt_tele.setPlaceholderCharacter('_');
        JFormattedTextField ftf1 = new JFormattedTextField(txt_tele);
        txt_adress =new JTextArea(2,1);
         txt_adress.setLineWrap(true);
         txt_adress.setWrapStyleWord(true);
         
         date_inscri =new DatePicker();
         date_inscri.setDateToToday();
         date_renouv =new DatePicker();
         date_renouv.setDateToToday();
         date_expir =new DatePicker();
         date_expir.setDateToToday();
         
         txt_frais =new JTextField();
         txt_fraisInscri =new JTextField();
         
         ch_muscu = new JCheckBox("Musculation");
         ch_FullCon = new JCheckBox("Full Contact");
         ch_karati = new JCheckBox("Karati");
         ch_fitnesse = new JCheckBox("Fitnesse");
         
         
         leftPanel.add(lbl_code);
         leftPanel.add(txt_code);
         leftPanel.add(lbl_photo,"width pref!,height pref!,spany 3,alignx center");
         leftPanel.add(lbl_nom);
         leftPanel.add(txt_nom);	        
         leftPanel.add(lbl_prénom);
         leftPanel.add(txt_prénom);
         leftPanel.add(lbl_age);
         leftPanel.add(spinner_age,"width pref!");
         leftPanel.add(bt_ImportPhoto, "alignx center");
         leftPanel.add(lbl_sexe);
         leftPanel.add(rb_femme, "split 2");
         leftPanel.add(rb_homme);
         leftPanel.add(lbl_tele,"skip 1");
         leftPanel.add(ftf1);
         leftPanel.add(lbl_adresse,"skip 1");
         leftPanel.add(txt_adress,"span 2,width 100:300:");
        
         
         
         rightPanel.add(lbl_dateInscri);
          rightPanel.add(date_inscri);
         rightPanel.add(lbl_dateRenouv);
         rightPanel.add(date_renouv);
         rightPanel.add(lbl_dateExpir);
         rightPanel.add(date_expir);
         rightPanel.add(lbl_Frais);
         rightPanel.add(txt_frais);
         rightPanel.add(lbl_fraisInscri);
         rightPanel.add(txt_fraisInscri);
        
        activitéPanel.add(ch_muscu);
        activitéPanel.add(ch_fitnesse);
        activitéPanel.add(ch_FullCon);
        activitéPanel.add(ch_karati);
         
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);
        mainPanel.add(activitéPanel);
        setContentPane( mainPanel);
		setVisible(true);

		
	}

}
