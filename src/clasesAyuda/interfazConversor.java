package clasesAyuda;

//import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class interfazConversor extends JFrame implements ActionListener{
	 private JMenuBar menuBar;
	 private JMenu menu;
	 private JMenuItem opcion1, opcion2,opcion3,opcion4,opcion5,opcion6,
	 opcion7,opcion8,opcion9,opcion10;
	 private Monedas cantidad = new Monedas();
	 
	 public interfazConversor() {
		 try {
             double moneda = Double.parseDouble(JOptionPane
                             .showInputDialog("Introduce la cantidad:"));
             cantidad.cargarCantidad(moneda);
             System.out.println(cantidad.getMonedadeCambio());
             
             
	     } catch (Exception ex) {
	    	 System.out.println(ex);
             JOptionPane.showMessageDialog(null, "Excepcion "+ ex + ". Debido al\n"
             		+ " tipo de dato. Recuede que solo acepta números");
             continuarPrograma();
             
	     }
		 
		 setSize(600, 400);
		 setTitle("Conversor de Peso Mexicano a Divisas Extranjeras");
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 JPanel panel = new JPanel();
		 mostrarMenu();
		 panel.add(menuBar);
		 add(panel);
	  }
	 
	 
	 public void mostrarMenu() {
		 menuBar = new JMenuBar();
		 
		 
		 menu = new JMenu("Elija el tipo de conversión");
		 opcion1 = new JMenuItem("Peso Mexicano a Dolar");
		 opcion2 = new JMenuItem("Peso Mexicano a Euro");
		 opcion3 = new JMenuItem("Pesp Mexicano a Libra Exterlina");
		 opcion4 = new JMenuItem("Peso Mexicano a Yen Japones");
		 opcion5 = new JMenuItem("Peso Mexicano a Won sul-coreano");
		 opcion6 = new JMenuItem("Dolar a Peso Mexicano");
		 opcion7 = new JMenuItem("Euro a Peso Mexicano");
		 opcion8 = new JMenuItem("Libra Exterlina a Peso Mexicano");
		 opcion9 = new JMenuItem("Yen Japones a Peso Mexicano");
		 opcion10 = new JMenuItem("Won sul-coreano a Peso Mexicano");
		 
		 menu.add(opcion1);
		 menu.add(opcion2);
		 menu.add(opcion3);
		 menu.add(opcion4);
		 menu.add(opcion5);
		 menu.add(opcion6);
		 menu.add(opcion7);
		 menu.add(opcion8);
		 menu.add(opcion9);
		 menu.add(opcion10);
		 //creamos el evento
		 opcion1.addActionListener(this);
		 opcion2.addActionListener(this);
		 opcion3.addActionListener(this);
		 opcion4.addActionListener(this);
		 opcion5.addActionListener(this);
		 opcion6.addActionListener(this);
		 opcion7.addActionListener(this);
		 opcion8.addActionListener(this);
		 opcion9.addActionListener(this);
		 opcion10.addActionListener(this);
		 menuBar.add(menu);
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 String mensaje = "a";
		 
		 //Container evento = this.getContentPane();
		 if(e.getSource()==opcion1) {
			mensaje = String.format("%.2f", cantidad.pesoMaMonedaExt(1))+
					" en Dolares";
		 }
		 if(e.getSource()==opcion2) {
			 mensaje = String.format("%.2f",cantidad.pesoMaMonedaExt(2))+
						" en Euros";
		 }
		 if(e.getSource()==opcion3) {
			 mensaje = String.format("%.2f", cantidad.pesoMaMonedaExt(3))+
						" en Libras  Exterlinas";
		 }
		 if(e.getSource()==opcion4) {
			 mensaje = String.format("%.2f", cantidad.pesoMaMonedaExt(4))+
						" en Yenes";
		 }
		 if(e.getSource()==opcion5) {
			 mensaje = String.format("%.2f", cantidad.pesoMaMonedaExt(5))+
						" en Wones";
		 }
		 if(e.getSource()==opcion6) {
			 mensaje = String.format("%.2f", cantidad.pesoMaMonedaExt(6))+
						" en Peso Mexicano";
		 }
		 if(e.getSource()==opcion7) {
			 mensaje = String.format("%.2f", cantidad.pesoMaMonedaExt(7))+
						" en Peso Mexicano";
		 }
		 if(e.getSource()==opcion8) {
			 mensaje =String.format("%.2f", cantidad.pesoMaMonedaExt(8))+
						" en Peso Mexicano";
		 }
		 if(e.getSource()==opcion9) {
			 mensaje = String.format("%.2f", cantidad.pesoMaMonedaExt(9))+
						" en Peso Mexicano";
		 }
		 if(e.getSource()==opcion10) {
			 mensaje = String.format("%.2f", cantidad.pesoMaMonedaExt(10))+
						" en Peso Mexicano";
		 }
		 dispose(); 
		 JOptionPane.showMessageDialog(null, "Tienes " + mensaje);
		 continuarPrograma();
		 
	 }
	 
	 
	 public void continuarPrograma() {
		 ImageIcon icono = new ImageIcon("imagenes/dinero.png");
		 
		 int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el sistema?",
	                "YES_NO_CANCEL_OPTION", JOptionPane.YES_NO_CANCEL_OPTION,
	                JOptionPane.INFORMATION_MESSAGE,icono); 
		 switch(seleccion) {
		 	case 0:
		 		JOptionPane.showMessageDialog(null, "Gracias por continuar.");
		 		menuPrincipal ventana = new menuPrincipal();
				ventana.setVisible(true);
		 		break;
		 	case 1:
		 		JOptionPane.showMessageDialog(null, "Estás saliendo del sistema, gracias");
		 		System.exit(0);
		 		break;
		 	case 2:
		 		JOptionPane.showMessageDialog(null, "Estás saliendo del sistema, gracias");
		 		System.exit(0);
		 		break;
	     } 
	 }
	 
		 
}
