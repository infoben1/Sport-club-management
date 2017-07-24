package com.clubrada.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.UIManager;
@SuppressWarnings("serial")
public class MenuPrincipal extends JFrame{
	
private JLabel lbl,lbl_time;
	
	public MenuPrincipal (){
		
	setTitle("Club Erreda");	
	lbl = new JLabel();
	this.setLayout(null);
	lbl.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/com/clubreda/images/menu.jpg")));
	lbl.setBounds(0, 0,2000,1100);
	add(lbl);
    setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
	
     
	
	JMenuBar  menubar = new JMenuBar();
	ImageIcon iconConnexion = new ImageIcon("Connexion.png");
	ImageIcon iconClose = new ImageIcon("exit.png");
	
	JMenu Fichier = new JMenu("Fichier");
	Fichier.setMnemonic(KeyEvent.VK_F);
	
	JMenu GT = new JMenu("Gestion des Taches");
	GT.setMnemonic(KeyEvent.VK_M);
	
	JMenuItem Client = new JMenuItem("Nouveau Adhérent...");

	Client.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event) {
			try {
				Client CL = new Client();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	GT.add(Client);
	
/*
	JMenuItem gestionsession = new JMenuItem("Gestion des Sessions...");
	gestionsession.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event) {
			GreeSession GS = new GreeSession();
		}
		});
	*/
	//GT.add(gestionsession);
	
	JMenuItem fileConnexion = new JMenuItem("Connexion",iconConnexion);
	fileConnexion.setMnemonic(KeyEvent.VK_N);

    
	JMenuItem Authentiication = new JMenuItem("Authentiication...");
	fileConnexion.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent event) {
			Authentiication authen = new Authentiication();
		}
	});
    

    JMenuItem fileClose = new JMenuItem("Close", iconClose);
    fileClose.setMnemonic(KeyEvent.VK_C);
    fileClose.setToolTipText("Exit application");
    fileClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, 
        ActionEvent.CTRL_MASK));

    fileClose.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);   
        }

    });
    
    
	
    Fichier.add(fileConnexion);
    Fichier.addSeparator();
    Fichier.add(GT);
    Fichier.addSeparator();
    Fichier.add(fileClose);
	menubar.add(Fichier);
	setJMenuBar(menubar);

 
	
setVisible(true);
 } 
  /* lbl_time = new JLabel() ;
    lbl_time.setBounds(0,0,500,40);
    lbl_time.setForeground(Color.BLACK);
    lbl_time .setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 35f));
   tickTock();
    
   Timer timer = new Timer(500, new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           tickTock();
       }
   });
   timer.setRepeats(true);
   timer.setCoalesce(true);
   timer.setInitialDelay(0);
   timer.start();
}  
public void tickTock() {
	lbl_time .setText(DateFormat.getDateTimeInstance().format(new Date()));
	add(lbl_time);
*/
	
}
