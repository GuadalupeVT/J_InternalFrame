import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

class VentanaInicio extends JFrame{
	
	JMenu menuPrincipalMasters, menuPrincipalBooking, menuPrincipalTestPermorm,
	menuPrincipalPrinting, menuPrincipalTransaction,menuPrincipalLastReports,
	menuPrincipalSettings,menuPrincipalUtilities,menuPrincipalWindows,menuPrincipalHelp;
	
	JMenuItem itemAltaAlumnos,itemBajaAlumnos,itemCambiosAlumnos,itemConsultasAlumnos;
	JInternalFrame internalFrameAltaAlumnos;
	
	JTextField cajaNumControl,cajaNombre,cajaPrimerAp,cajaSegundoAp,semestre,carrera;
	JButton reestablecer, enviar;
	
	public VentanaInicio() {
		getContentPane().setLayout(new BorderLayout());
		setSize(700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JMenuBar menuBar=new JMenuBar();
		menuPrincipalMasters= new JMenu("Masters");
		menuPrincipalBooking=new JMenu("Boking");
		menuPrincipalTestPermorm=new JMenu("Test Perform");
		menuPrincipalPrinting=new JMenu("Printing");
		menuPrincipalTransaction=new JMenu("Transaction");
		menuPrincipalLastReports = new JMenu("Last Reports");
		menuPrincipalSettings=new JMenu("Settings");
		menuPrincipalUtilities=new JMenu("Utilities");
		menuPrincipalWindows=new JMenu("Windows");
		menuPrincipalHelp=new JMenu("Help");
		
		menuBar.add(menuPrincipalMasters);
		menuBar.add(menuPrincipalBooking);
		    //Items Menu materias
	        
	    
	   
	    setJMenuBar(menuBar);
	    JToolBar toolBar=new JToolBar();
	    
	       toolBar.add(new JButton("A"));
	       toolBar.add(new JButton("B"));
	       toolBar.add(new JButton("C"));
	       toolBar.add(new JButton("Co"));
	    add(toolBar,BorderLayout.PAGE_START);
		
		
	    //INTERNAL FRAMES ---------------------------------------
	    JDesktopPane desktopPane=new JDesktopPane();
	     
	       internalFrameAltaAlumnos= new JInternalFrame("AGREGAR ALUMNOS");
	       internalFrameAltaAlumnos.getContentPane().setLayout(null);
	       internalFrameAltaAlumnos.setDefaultCloseOperation(HIDE_ON_CLOSE);
	       internalFrameAltaAlumnos.setClosable(true);
	       internalFrameAltaAlumnos.setMaximizable(true);
	       internalFrameAltaAlumnos.setIconifiable(true);
	       internalFrameAltaAlumnos.setResizable(true);
	       internalFrameAltaAlumnos.setSize(450,600);
	       //internalFrameAltaAlumnos.setVisible(true);
	    
	       //componentes del internalFrameAltaAlumnos
	       JPanel panelAltaAlumnos=new JPanel();
	       
	          panelAltaAlumnos.setBackground(Color.CYAN);
	          panelAltaAlumnos.setSize(450,600);
	          panelAltaAlumnos.setLayout(null);
	          JLabel lblNumControl=new JLabel("Numero de control: ");
	          lblNumControl.setBounds(10,10,150,30);
	          panelAltaAlumnos.add(lblNumControl);
	          
	          cajaNumControl = new JTextField();
	          cajaNumControl.setBounds(200,10,150,30);
	          panelAltaAlumnos.add(cajaNumControl);
	          
	         
	          
	          JLabel lblNombre=new JLabel("Nombre: ");
	          lblNombre.setBounds(10,50,150,30);
	          panelAltaAlumnos.add(lblNombre);
	          cajaNombre = new JTextField();
	          cajaNombre.setBounds(200,50,150,30);
	          panelAltaAlumnos.add(cajaNombre);
	          
	          JLabel lblPrimerAp=new JLabel("Primer Apellido: ");
	          lblPrimerAp.setBounds(10,90,150,30);
	          panelAltaAlumnos.add(lblPrimerAp);
	          cajaPrimerAp = new JTextField();
	          cajaPrimerAp.setBounds(200,90,150,30);
	          panelAltaAlumnos.add(cajaPrimerAp);
	          
	          JLabel lblSegundoAp=new JLabel("Segundo Apellido: ");
	          lblSegundoAp.setBounds(10,130,150,30);
	          panelAltaAlumnos.add(lblSegundoAp);
	          cajaSegundoAp = new JTextField();
	          cajaSegundoAp.setBounds(200,130,150,30);
	          panelAltaAlumnos.add(cajaSegundoAp);
	          
	          JLabel lblFechaNac=new JLabel("Fecha de Nacimiento: ");
	          lblFechaNac.setBounds(10,170,150,30);
	          panelAltaAlumnos.add(lblFechaNac);
	          //FormatedTextField
	          
	          
	          JLabel lblSemestre=new JLabel("Semestre: ");
	          lblSemestre.setBounds(10,210,150,30);
	          panelAltaAlumnos.add(lblSemestre);
	          semestre = new JTextField();
	          semestre.setBounds(200,210,150,30);
	          panelAltaAlumnos.add(semestre);
	          
	          JLabel lblCarrera=new JLabel("Carrera: ");
	          lblCarrera.setBounds(10,250,150,30);
	          panelAltaAlumnos.add(lblCarrera);
	          carrera=new JTextField();
	          carrera.setBounds(200,250,150,30);
	          panelAltaAlumnos.add(carrera);
	          
	          reestablecer =new JButton("REESTABLECER");
	          reestablecer.setBounds(10,330,150,30);
	          panelAltaAlumnos.add(reestablecer);
	          
	          enviar =new JButton("ENVIAR");
	          enviar.setBounds(200,330,150,30);
	          panelAltaAlumnos.add(enviar);
	          
	       internalFrameAltaAlumnos.add(panelAltaAlumnos);
	       desktopPane.add(internalFrameAltaAlumnos);
	       
	       
	    desktopPane.setBackground(Color.BLACK);
	    add(desktopPane, BorderLayout.CENTER);
	    
	   
	    
	}//constructor

	
	/*VARAGRS-->cantidad variable de argumentos
	 * 
	 * Sintaxis: método (TipoDato...variable) 
	 * 
	 *  donde variable es un vector
	 */
	

	
}//class VentanaInicio

public class Prueba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
				
			}
		});

	}

}

