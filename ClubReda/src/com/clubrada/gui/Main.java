package com.clubrada.gui;

import java.awt.Font;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;



public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
            try {
                NimbusLookAndFeel laf = new NimbusLookAndFeel();
                UIManager.setLookAndFeel(laf);
                laf.getDefaults().put("defaultFont",
                        new Font(((Font) laf.getDefaults().get("defaultFont")).getName(), Font.PLAIN, 15));
            } catch (UnsupportedLookAndFeelException e1) {
            }
            new MenuPrincipal();
        });
	}

	}


