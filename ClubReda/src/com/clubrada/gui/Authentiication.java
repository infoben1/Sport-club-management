package com.clubrada.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;

public class Authentiication extends JFrame {
	
	private JLabel    lbl_Login, lbl_Motps,lbl_lock,lbl_time;
	 private JTextField txt_Login;
	private JPasswordField  txt_Motps;
	private JPanel panel;
	private JButton  bt_con;
	
	public  Authentiication(){
		
     panel = new JPanel();
     panel.setBackground(Color.orange);
     panel.setSize(800, 600);
     panel.setLayout(null);
    
		setBounds(100, 100, 600,300);
        setTitle("Authentiication");
        setLocationRelativeTo(null);
        setResizable(false);
        this.setAlwaysOnTop(true);
        setDefaultCloseOperation(Authentiication.DISPOSE_ON_CLOSE);
        setVisible(true);
        
        
        
        
        lbl_Login = new JLabel("Login :");
    	lbl_Login.setBounds(40,50,200,60);
    	lbl_Login.setFont(new Font ("Crystal", Font.PLAIN, 40));
    	
    	txt_Login = new JTextField();
    	txt_Login.setBounds(270,65,300,40);
    	txt_Login.setFont(new Font ("Crystal", Font.PLAIN, 30));
    	
    	
        lbl_Motps = new JLabel("PassWord :");
    	lbl_Motps.setBounds(40,120,300,60);
    	lbl_Motps.setFont(new Font ("Crystal", Font.PLAIN, 40));

        txt_Motps = new JPasswordField();
        txt_Motps.setBounds(270,130,300,40);
        txt_Motps.setFont(new Font ("Crystal", Font.PLAIN, 30));
        
     
        bt_con = new JButton();
        bt_con.setBounds(320,200,200,41);
        bt_con.setIcon(new ImageIcon(Authentiication.class.getResource("/com/clubreda/images/con.png")));
      
        lbl_lock = new JLabel();
    	lbl_lock.setBounds(40,165,120,120);
        lbl_lock.setIcon(new ImageIcon(Authentiication.class.getResource("/com/clubreda/images/lock.png")));
        
        
       

    			
        this. add(panel);
       panel.add(lbl_Login);
       panel.add(txt_Login);
       panel.add(lbl_Motps);
       panel.add(txt_Motps);
   	   panel. add(bt_con);
   	
   	   panel. add(lbl_lock);
   
}

}
