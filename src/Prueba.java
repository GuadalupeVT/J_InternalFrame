import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;

class VentanaInicio extends JFrame{
	
	JMenu menuPrincipalMasters, menuPrincipalBooking, menuPrincipalTestPermorm,
	menuPrincipalPrinting, menuPrincipalTransaction,menuPrincipalLastReports,
	menuPrincipalSettings,menuPrincipalUtilities,menuPrincipalWindows,menuPrincipalHelp;

	JInternalFrame internalFrame1,internalFrame2,internalFrame3,internalFrame4;
	
	
	public VentanaInicio() {
		Image iconoInicial = Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconoInicial.png"));
		setIconImage(iconoInicial);
		getContentPane().setLayout(new BorderLayout());
		setTitle("Lab Master- Test Booking");
		setSize(1370, 730);
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
	     
	       internalFrame1= new JInternalFrame();
	       internalFrame1.getContentPane().setLayout(null);
	       internalFrame1.setBounds(0, 0, 1350, 610);
	       //internalFrame1.setSize(1350,200);
	       internalFrame1.setVisible(true);
	    
	       //componentes del internalFrame1
	       JPanel panel1=new JPanel();
	       
	          panel1.setBackground(Color.getHSBColor(131, 246, 125));
	          panel1.setSize(1350,200);
	          panel1.setLayout(null);
	          
	          JLabel lblpatienId=new JLabel("Patient ID");
	          lblpatienId.setBounds(5,5,70,20);
	          panel1.add(lblpatienId);
	          JTextField cajaIDPatient=new JTextField();
	          cajaIDPatient.setBounds(80,5,100,20);
	          panel1.add(cajaIDPatient);
	          
	          JLabel lblDate=new  JLabel("Date");
	          lblDate.setBounds(250,5,30,20);
	          panel1.add(lblDate);
	          Calendar calendar = Calendar.getInstance();
				 Date initDate = calendar.getTime();
			        calendar.add(Calendar.YEAR, -100);
			        Date earliestDate = calendar.getTime();
			        calendar.add(Calendar.YEAR, 200);
			        Date latestDate = calendar.getTime();
			        SpinnerModel dateModel = new SpinnerDateModel(initDate,
			                                     earliestDate,
			                                     latestDate,
			                                     Calendar.YEAR);
			        
			        JSpinner spinnerFecha = new JSpinner(dateModel);
			        
			        spinnerFecha.setEditor(new JSpinner.DateEditor(spinnerFecha, "dd/MM/yyyy"));
			        
			        spinnerFecha.setBounds(300, 5, 100, 20);
	   				panel1.add(spinnerFecha); 
				
	   				JLabel lblTime =new JLabel("*Time(hh:mm)");
	   				lblTime.setBounds(450,5,100,20);
	   				panel1.add(lblTime);
	   				JTextField hh=new JTextField();
	   				hh.setBounds(540,5,20,20);
	   				panel1.add(hh);
	   				JLabel x=new JLabel(" : ");
	   				x.setBounds(560,5,10,20);
	   				panel1.add(x);
	   				JTextField mm=new JTextField();
	   				mm.setBounds(570,5,20,20);
	   				panel1.add(mm);
	   				
	   				JLabel lblLabNo=new JLabel("Lab No");
	   				lblLabNo.setBounds(620,5,50,20);
	   				panel1.add(lblLabNo);
	   				JTextField cajaLab=new JTextField();
	   				cajaLab.setBounds(680,5,50,20);
	   				panel1.add(cajaLab);
	   				
	   				JLabel lblName=new JLabel("Name");
	   				lblName.setBounds(5,40,50,20);
	   				panel1.add(lblName);
	   				String name[] = {"MR.","MRS."};
					JComboBox comboName = new JComboBox<String>(name);
					comboName.setBounds(80, 40, 60, 20);
					panel1.add(comboName);
					JTextField cajaName=new JTextField();
					cajaName.setBounds(150,40,235,20);
					panel1.add(cajaName);
					
					JLabel lblSex=new JLabel("Sex");
	   				lblSex.setBounds(5,80,50,20);
	   				panel1.add(lblSex);
	   				String sex[] = {"MALE","FEMALE"};
					JComboBox comboSex = new JComboBox<String>(sex);
					comboSex.setBounds(80, 80, 60, 20);
					panel1.add(comboSex);
					JLabel lblAge=new JLabel("Age");
	   				lblAge.setBounds(150,80,30,20);
	   				panel1.add(lblAge);
	   				JTextField cajaAge=new JTextField();
					cajaAge.setBounds(175,80,30,20);
					panel1.add(cajaAge);
					JLabel lblMonths=new JLabel("Months");
	   				lblMonths.setBounds(220,80,50,20);
	   				panel1.add(lblMonths);
	   				JTextField cajaMonths=new JTextField();
					cajaMonths.setBounds(270,80,30,20);
					panel1.add(cajaMonths);
					JLabel lblDays=new JLabel("Days");
	   				lblDays.setBounds(310,80,50,20);
	   				panel1.add(lblDays);
	   				JTextField cajaDays=new JTextField();
					cajaDays.setBounds(350,80,30,20);
					panel1.add(cajaDays);
					
					JLabel lblSample=new JLabel("Sample By");
	   				lblSample.setBounds(400,80,70,20);
	   				panel1.add(lblSample);
	   				
	   				JDateChooser dateChooser =new JDateChooser();
	   				dateChooser.setBounds(480,80,120,20);
	   				panel1.add(dateChooser);
	   				
	   				JLabel reffered=new JLabel ("Refered By: ");
	   				reffered.setBounds(5,110,70,20);
	   				panel1.add(reffered);
	   				
	   				JDateChooser dateChooser2 =new JDateChooser();
	   				dateChooser2.setBounds(80,110,110,20);
	   				panel1.add(dateChooser2);
	   				
	   				JTextField cajaRefered=new JTextField();
					cajaRefered.setBounds(200,110,180,20);
					panel1.add(cajaRefered);
					
					JLabel lblPanel=new JLabel("Panel Code");
	   				lblPanel.setBounds(400,110,70,20);
	   				panel1.add(lblPanel);
	   				
	   				JDateChooser dateChooser3 =new JDateChooser();
	   				dateChooser3.setBounds(480,110,120,20);
	   				panel1.add(dateChooser3);
	   				
	   				JLabel lblPanelId=new JLabel("Panel ID");
	   				lblPanelId.setBounds(400,140,70,20);
	   				panel1.add(lblPanelId);
	   				JTextField cajaPanelId=new JTextField();
	   				cajaPanelId.setBounds(480,140,100,20);
	   				panel1.add(cajaPanelId);
	   				
	   				JLabel lblEmail=new JLabel("e-mail");
	   				lblEmail.setBounds(400,170,70,20);
	   				panel1.add(lblEmail);
	   				JTextField cajaEmail=new JTextField();
	   				cajaEmail.setBounds(480,170,100,20);
	   				panel1.add(cajaEmail);
	       internalFrame1.add(panel1);
	       
	       JPanel panel2=new JPanel();
	       
	          panel2.setBackground(new Color(200,162,200));
	          panel2.setBounds(0, 210, 1350, 250);
	          panel2.setLayout(null);
	          
	          JPanel panel3=new JPanel();
	          panel3.setBounds(10, 10, 900, 230);
	          panel3.setLayout(null);
	          
	          
	         JTable tabla=new JTable(2,7);
	         tabla.setBounds(0,0,800,50);
	         tabla.setValueAt("Test ID",0,0);
	         tabla.setValueAt("Test Name",0,1);
	         tabla.setValueAt("Rate",0,2);
	         tabla.setValueAt("Disc %",0,3);
	         tabla.setValueAt("<html>Discount<p>Amount</html>",0,4);
	         tabla.setValueAt("Tax(%)",0,5);
	         tabla.setValueAt("Tax Amt",0,6);
	         tabla.getColumnModel().getColumn(0).setPreferredWidth(100);
	         tabla.getColumnModel().getColumn(1).setPreferredWidth(400);
	         tabla.setRowHeight(0, 35);
	       //  tabla.getColumnModel().getColumn(0).set
	         panel3.add(tabla);
	         panel2.add(panel3);
	         
	         JLabel totalLess=new JLabel("total less");
	         totalLess.setBounds(950, 5, 60, 20);
	         panel2.add(totalLess);
	         JTextField cajaTotalLess=new JTextField();
	         cajaTotalLess.setBounds(1045, 5, 100, 20);
	         cajaTotalLess.setBackground(Color.BLUE);
	         cajaTotalLess.setBorder(null);
	         panel2.add(cajaTotalLess);
	         
	         JLabel lestAmt=new JLabel("test Amt.");
	         lestAmt.setBounds(950, 30, 60, 20);
	         panel2.add(lestAmt);
	         JTextField cajaTest=new JTextField();
	         cajaTest.setBounds(1045, 30, 100, 20);
	         cajaTest.setBackground(Color.BLUE);
	         cajaTest.setBorder(null);
	         panel2.add(cajaTest);
	         
	         JLabel concession=new JLabel("Concession");
	         concession.setBounds(950, 55, 70, 20);
	         panel2.add(concession);
	         JTextField cajaConcession=new JTextField();
	         cajaConcession.setBounds(1045, 55, 100, 20);
	         cajaConcession.setBackground(Color.BLUE);
	         cajaConcession.setBorder(null);
	         panel2.add(cajaConcession);
	         
	         JLabel home=new JLabel("Home Colection");
	         home.setBounds(950, 80, 90, 20);
	         panel2.add(home);
	         JTextField cajaHome=new JTextField();
	         cajaHome.setBounds(1045, 80, 100, 20);
	         cajaHome.setBackground(Color.BLUE);
	         cajaHome.setBorder(null);
	         panel2.add(cajaHome);
	         
	         JLabel laxAmt=new JLabel("lax Amt");
	         laxAmt.setBounds(950, 105, 90, 20);
	         panel2.add(laxAmt);
	         JTextField cajalaxAmt=new JTextField();
	         cajalaxAmt.setBounds(1045, 105, 100, 20);
	         cajalaxAmt.setBackground(Color.BLUE);
	         cajalaxAmt.setBorder(null);
	         panel2.add(cajalaxAmt);
	         
	         JLabel netAmt=new JLabel("Net Amt");
	         netAmt.setBounds(950, 130, 90, 20);
	         panel2.add(netAmt);
	         JTextField cajaNetAmt=new JTextField();
	         cajaNetAmt.setBounds(1045, 130, 100, 20);
	         cajaNetAmt.setBackground(Color.BLUE);
	         cajaNetAmt.setBorder(null);
	         panel2.add(cajaNetAmt);
	         
	         JLabel balance=new JLabel("Balance");
	         balance.setBounds(950, 155, 90, 20);
	         panel2.add(balance);
	         JTextField cajaBalance=new JTextField();
	         cajaBalance.setBounds(1045, 155, 100, 20);
	         cajaBalance.setBackground(Color.BLUE);
	         cajaBalance.setBorder(null);
	         panel2.add(cajaBalance);
	       internalFrame1.add(panel2);
	       
	       //Panel 4
	       JPanel panel4=new JPanel();
	          panel4.setBounds(0, 470, 1350, 60);
	          panel4.setLayout(null);
	         
	          JLabel homeCollection=new JLabel("Home Collection");
	          homeCollection.setBounds(5, 10, 100, 20);
	          panel4.add(homeCollection);
	          JTextField cajaHC=new JTextField();
	          cajaHC.setBounds(110, 10, 50, 20);
	          panel4.add(cajaHC);
	          
	          JLabel paid=new JLabel("Paid");
	          paid.setBounds(170, 10, 50, 20);
	          panel4.add(paid);
	          JTextField cajapaid=new JTextField();
	          cajapaid.setBounds(210, 10, 50, 20);
	          panel4.add(cajapaid);
	          
	          JLabel paidT=new JLabel("Paid Type");
	          paidT.setBounds(270, 10, 70, 20);
	          panel4.add(paidT);
	          String combo[] = {"CASH"};
				JComboBox comboType = new JComboBox<String>(combo);
			comboType.setBounds(340,10,80,20);
			panel4.add(comboType);
			
			JLabel receipt=new JLabel("Receipt No.");
	          receipt.setBounds(430, 10, 70, 20);
	          panel4.add(receipt);
	          JTextField cajaR=new JTextField();
	          cajaR.setBounds(510, 10, 100, 20);
	          panel4.add(cajaR);
	       internalFrame1.add(panel4);
	       
	       //Panel 5
	       JPanel panel5=new JPanel();
	          panel5.setBounds(0, 530, 1350, 60);
	          panel5.setLayout(null);
	          panel5.setBackground(Color.BLUE);
	          
	          JLabel text=new JLabel("<html><font color=\"white\">"
	        		  +"F1: Select Test  F2:Save Entry  F3:Perform Test  F4:New Booking  F5:Payment Type  F6:Delete Entry  F7:Conc.  F8:Add Rev. <br>+"
	        		  + "F9:Test Selected  F11:Print Recipt  F12:Patient Details  Ctrl+F2:Show Concession *Time in 24 Hours <br>+"
	        		  + "Format(Click on Time Label for more Information)     Value in this field is coming for the Masters</font></html>\"");
	          text.setBounds(0,0,1350,50);
	          panel5.add(text);
	          
	          internalFrame1.add(panel5);
	       desktopPane.add(internalFrame1);
	       
	      
	      
	     internalFrame1.setBackground(Color.WHITE);
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

