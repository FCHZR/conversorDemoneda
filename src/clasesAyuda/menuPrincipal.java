package clasesAyuda;

//import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class menuPrincipal extends JFrame implements ActionListener{

	 private JMenuBar menuBar;
	 private JMenu menu;
	 private JMenuItem opcion1, opcion2,opcion3;
	 
	 public menuPrincipal() {
		 dispose();
		 setSize(600, 400);
		 setTitle("Menu Principal");
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 JPanel panel = new JPanel();
		 mostrarMenu();
		 panel.add(menuBar);
		 add(panel);
	 }
	 
	 public void mostrarMenu() {
		 menuBar = new JMenuBar();
		 menu = new JMenu("Elija una Opción");
		 opcion1 = new JMenuItem("Convertidor de Divisas");
		 opcion2 = new JMenuItem("En construcción");
		 opcion3 = new JMenuItem("Salir");
		 menu.add(opcion1);
		 menu.add(opcion2);
		 menu.add(opcion3);
		 
		 //creamos el evento
		 opcion1.addActionListener(this);
		 opcion2.addActionListener(this);
		 opcion3.addActionListener(this);
		 menuBar.add(menu);
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 //Container evento = this.getContentPane();
		 if(e.getSource()==opcion1) {
			 dispose(); 
			 //interfazaEntradadatos ventana2 = new interfazaEntradadatos();
			 //ventana2.setVisible(true);
			 interfazConversor interfaz = new interfazConversor();
             interfaz.setVisible(true);
		}
		 if(e.getSource()==opcion2) {
			//En construccion
		 } 
		 if(e.getSource()==opcion3) {
			 JOptionPane.showMessageDialog(null, "Vamos de salida");
			 System.exit(0);
		 }
	}

}
