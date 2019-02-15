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
		Image iconoInicial = Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconoInicial.png"));
		setIconImage(iconoInicial);
		getContentPane().setLayout(new BorderLayout());
		setTitle("Lab Master- Test Booking");
		setSize(700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JMenuBar menuBar=new JMenuBar();
		menuPrincipalMasters= new JMenu("Masters");
		ImageIcon imagen= new ImageIcon("./src/iconoInicial.png");
		ImageIcon imagen2=new ImageIcon(imagen.getImage().getScaledInstance(15, -1, Image.SCALE_DEFAULT));
		menuPrincipalMasters.setIcon(imagen2);
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
		menuBar.add(menuPrincipalTestPermorm);
		menuBar.add(menuPrincipalPrinting);
		menuBar.add(menuPrincipalTransaction);
		menuBar.add(menuPrincipalLastReports);
		menuBar.add(menuPrincipalSettings);
		menuBar.add(menuPrincipalUtilities);
		menuBar.add(menuPrincipalWindows);
		menuBar.add(menuPrincipalHelp);
		
	    setJMenuBar(menuBar);
	    
	    
	    JToolBar toolBar=new JToolBar();
	       JButton botonAdd=new JButton();
	          ImageIcon add= new ImageIcon("./src/add.png");
	          botonAdd.setIcon(add);
	          botonAdd.setText("Add");
	          botonAdd.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonAdd.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonAdd);
	          
	       JButton botonEdit=new JButton();
	          ImageIcon edit= new ImageIcon("./src/edit.png");
	          botonEdit.setIcon(edit);
	          botonEdit.setText("Edit");
	          botonEdit.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonEdit.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonEdit);
	          
	        JButton botonBack=new JButton();
	          ImageIcon back= new ImageIcon("./src/back.png");
	          botonBack.setIcon(back);
	          botonBack.setText("Back");
	          botonBack.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonBack.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonBack);
	          
	        JButton botonNext=new JButton();
	          ImageIcon next= new ImageIcon("./src/next.png");
	          botonNext.setIcon(next);
	          botonNext.setText("Next");
	          botonNext.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonNext.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonNext);
	          
	       JButton botonList=new JButton();
	          ImageIcon list= new ImageIcon("./src/list.png");
	          botonList.setIcon(list);
	          botonList.setText("List");
	          botonList.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonList.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonList);
	          
	        JButton botonSave=new JButton();
	          ImageIcon save= new ImageIcon("./src/save.png");
	          botonSave.setIcon(save);
	          botonSave.setText("Save");
	          botonSave.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonSave.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonSave);
	          
	        JButton botonPrint=new JButton();
	          ImageIcon print= new ImageIcon("./src/print.png");
	          botonPrint.setIcon(print);
	          botonPrint.setText("Print");
	          botonPrint.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonPrint.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonPrint);
	          
	        JButton botonTest=new JButton();
	          ImageIcon test= new ImageIcon("./src/test.png");
	          botonTest.setIcon(test);
	          botonTest.setText("Test");
	          botonTest.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonTest.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonTest);
	          
	       JButton botonCancel=new JButton();
	          ImageIcon cancel= new ImageIcon("./src/cancel.png");
	          botonCancel.setIcon(cancel);
	          botonCancel.setText("Cancel");
	          botonCancel.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonCancel.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonCancel);
	          
	        JButton botonSettings=new JButton();
	          ImageIcon settings= new ImageIcon("./src/settings.png");
	          botonSettings.setIcon(settings);
	          botonSettings.setText("Settings");
	          botonSettings.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonSettings.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonSettings);
	          
	        JButton botonDelete=new JButton();
	          ImageIcon delete= new ImageIcon("./src/delete.png");
	          botonDelete.setIcon(delete);
	          botonDelete.setText("Delete");
	          botonDelete.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonDelete.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonDelete);
	          
	        JButton botonSlip=new JButton();
	          ImageIcon slip= new ImageIcon("./src/slip.png");
	          botonSlip.setIcon(slip);
	          botonSlip.setText("Slip");
	          botonSlip.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonSlip.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonSlip);
	          
	        JButton botonExit=new JButton();
	          ImageIcon exit= new ImageIcon("./src/exit.png");
	          botonExit.setIcon(exit);
	          botonExit.setText("Exit");
	          botonExit.setHorizontalTextPosition( SwingConstants.CENTER );
	          botonExit.setVerticalTextPosition( SwingConstants.BOTTOM );
	          toolBar.add(botonExit);
	   
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

