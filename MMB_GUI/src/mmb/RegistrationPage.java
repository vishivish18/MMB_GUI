package mmb;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Timestamp;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationPage extends JFrame implements ActionListener 
{
	JFileChooser filechooser;
	long randomNum;
	JFrame Regpage;
	JLabel backheader,backbody,backfooter,photobody;
	JTextField apno,name,age,house,street,landmark,area,village,po,district,state,pin,mobile,email,introname,introuid,idsub,pan,dl;
	JLabel dispname,dispid;
	JButton newreg,correctreg;
	JButton demographics,photograph,review,demographicsdim,photographdim,reviewdim,generate;
	JPanel regpanel,photopanel,reviewpanel,editpanel;
	JRadioButton male,female;
	JButton photoupload,photouploada,photouploadb,photouploadc,photouploadd,savephoto,cancel,photoupload1,savephoto1,home,photoupload2,photoupload2a,photoupload2b,photoupload2c,photoupload2d;
	JLabel  disphoto,disphotoa,disphotob,disphotoc,disphotod,disphoto1,disphoto2,disphoto2a,disphoto2b,disphoto2c,disphoto2d;
	static Point mouseDownCompCoords;
	JLabel sample1,sample2,sample3,sample4,sample5;
	
	JTextField uid;
	public RegistrationPage()
	{
		
		regpanel = new JPanel();
		photopanel = new JPanel();
		Regpage = new JFrame("Registration");
		backheader = new JLabel(new ImageIcon(""));
		backbody= new JLabel(new ImageIcon("images\\body1.png"));
		backfooter= new JLabel(new ImageIcon(""));
		photobody= new JLabel(new ImageIcon("images\\body2.png"));
		cancel = new JButton(new ImageIcon("images\\x.png"));
		home= new JButton(new ImageIcon("images\\home.png"));
		//back= new JLabel(new ImageIcon("images\\sample.png"));
		uid=new JTextField("");
		apno=new JTextField();
		name=new JTextField();
		age=new JTextField();
		male= new JRadioButton("Male");
		female= new JRadioButton("Female");
		house=new JTextField();
		street=new JTextField();
		landmark=new JTextField();
		area=new JTextField();
		village=new JTextField();
		po=new JTextField();
		district=new JTextField();
		state=new JTextField();
		pin=new JTextField();
		mobile=new JTextField();
		email=new JTextField();
		introname=new JTextField("");
		introuid=new JTextField("");
		idsub=new JTextField();
		pan=new JTextField();
		dl=new JTextField();
		dispname= new JLabel("asfa");
		dispid= new JLabel("sdasa");
		newreg = new JButton(new ImageIcon("images\\newreg.png"));
		correctreg= new JButton(new ImageIcon("images\\correct.png"));
		demographics = new JButton(new ImageIcon("images\\demographics.png"));
		demographicsdim = new JButton(new ImageIcon("images\\demographicsdim.png"));
		photograph= new JButton(new ImageIcon("images\\photograph.png"));
		photographdim= new JButton(new ImageIcon("images\\photographdim.png"));
		review= new JButton(new ImageIcon("images\\review.png"));
		reviewdim= new JButton(new ImageIcon("images\\reviewdim.png"));
		generate= new JButton(new ImageIcon("images\\generate.png"));
		photoupload= new JButton(new ImageIcon("images\\uploadfoot1.png"));
		photouploada= new JButton(new ImageIcon("images\\uploadfoot1.png"));
		photouploadb= new JButton(new ImageIcon("images\\uploadfoot1.png"));
		photouploadc= new JButton(new ImageIcon("images\\uploadfoot1.png"));
		photouploadd= new JButton(new ImageIcon("images\\uploadfoot1.png"));
		photoupload2= new JButton(new ImageIcon("images\\uploadpalm1.png"));
		photoupload2a= new JButton(new ImageIcon("images\\uploadpalm1.png"));
		photoupload2b= new JButton(new ImageIcon("images\\uploadpalm1.png"));
		photoupload2c= new JButton(new ImageIcon("images\\uploadpalm1.png"));
		photoupload2d= new JButton(new ImageIcon("images\\uploadpalm1.png"));
		disphoto= new JLabel();
		disphotoa= new JLabel();
		disphotob= new JLabel();
		disphotoc= new JLabel();
		disphotod= new JLabel();
		savephoto= new JButton(new ImageIcon("images\\save.png"));
		photoupload1= new JButton(new ImageIcon("images\\blank.png"));
		disphoto1= new JLabel();
		disphoto2= new JLabel();
		disphoto2a= new JLabel();
		disphoto2b= new JLabel();
		disphoto2c= new JLabel();
		disphoto2d= new JLabel();
		
		savephoto1= new JButton(new ImageIcon("images\\save.png"));
		sample1 = new JLabel("Data Acquisition");
		
		
		
		
		
		
		ImageIcon img = new ImageIcon("images\\logo.gif");

		
		Regpage.setIconImage(img.getImage());
		
	}
	
	public void addon1()
	{
		Container c= Regpage.getContentPane();
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Windows".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) 
		{
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		Regpage.setSize(971,640);
		Regpage.setLocation(200,50);
		Regpage.setUndecorated(true);
		Regpage.setVisible(true);
		Regpage.setLayout(null); 
		Regpage.setResizable(false);
	    Regpage.setDefaultCloseOperation(EXIT_ON_CLOSE);
	   // Regpage.setIconImage(img.getImage());
	    
	    
	    c.add(cancel);
	    cancel.setBounds(5,5,20,30);
	    cancel.setFocusPainted(false);
		cancel.setMargin(new Insets(0, 0, 0, 0));
		cancel.setContentAreaFilled(false);
		cancel.setBorderPainted(false);
		cancel.setOpaque(false);
		cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		c.add(home);
		home.setBounds(920,2,49,49);
		home.setFocusPainted(false);
	    home.setMargin(new Insets(0, 0, 0, 0));
	    home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		home.setOpaque(false);
		home.setCursor(new Cursor(Cursor.HAND_CURSOR));
		home.setToolTipText("back");
		c.add(demographics);
		demographics.setBounds(680,5,100,46);
		
		c.add(demographicsdim);
		
		c.add(photograph);
	    photograph.setBounds(800,5,100,46);
		
	    c.add(photographdim);
        photographdim.setBounds(800,5,100,46);
        photographdim.setVisible(false);
        photographdim.setFocusPainted(false);
        photographdim.setMargin(new Insets(0, 0, 0, 0));
        photographdim.setContentAreaFilled(false);
        photographdim.setBorderPainted(false);
        photographdim.setOpaque(false);
        
	    
	    c.add(regpanel);
		regpanel.setLayout(null);
		regpanel.setBounds(0,0,971,640);
		regpanel.setOpaque(false);
		
		c.add(photopanel);
		photopanel.setLayout(null);
		photopanel.setBounds(0,0,971,640);
		photopanel.setOpaque(false);
		photopanel.setVisible(false);
		
		//regpanel.add(apno);
		//apno.setBounds(275,13,130,20);
		regpanel.add(name);
		name.setBounds(220,171,205,20);
		regpanel.add(age);
		age.setBounds(220,215,35,20);
		
		regpanel.add(male);
		male.setBounds(221,188,55,30);
		male.setFocusPainted(false);
		male.setMargin(new Insets(0, 0, 0, 0));
		male.setContentAreaFilled(false);
		male.setBorderPainted(false);
		male.setOpaque(false);
		
		regpanel.add(female);
		female.setBounds(280,188,70,30);
		female.setFocusPainted(false);
		female.setMargin(new Insets(0, 0, 0, 0));
		female.setContentAreaFilled(false);
		female.setBorderPainted(false);
		female.setOpaque(false);
		
	
		regpanel.add(house);
		house.setBounds(220,278,205,20);
	
		regpanel.add(street);
		street.setBounds(220,303,205,20);

		regpanel.add(landmark);
		landmark.setBounds(220,328,205,20);
		regpanel.add(area);
		area.setBounds(220,353,205,20);
		regpanel.add(village);
		village.setBounds(220,378,205,20);
		regpanel.add(po);
		po.setBounds(220,403,97,20);
		regpanel.add(district);
		
		district.setBounds(327,403,97,20);
		regpanel.add(state);
		state.setBounds(220,428,97,20);
		regpanel.add(pin);
		pin.setBounds(327,428,97,20);
		regpanel.add(mobile);
		mobile.setBounds(220,453,205,20);
		
		regpanel.add(email);
		email.setBounds(220,478,205,20);
		
		regpanel.add(introname);
		introname.setBounds(540,192,150,20);
		regpanel.add(introuid);
		introuid.setBounds(700,192,205,20);
		
		regpanel.add(idsub);
		idsub.setBounds(540,242,150,20);
		
		/*regpanel.add(pan);
		pan.setBounds(540,189,205,20);
		regpanel.add(dl);
		dl.setBounds(540,244,205,20);
		regpanel.add(generate);
		generate.setBounds(542,310,150,46);
		regpanel.add(uid);
		uid.setBounds(542,310,150,46);
		uid.setVisible(false);
		*/
		
		regpanel.add(backbody);
	    backbody.setBounds(0,0,971,640);
		
		
	   
	    regpanel.add(photoupload1);
		photoupload1.setBounds(540,280,232,209);
		photoupload1.setOpaque(false);
		
		regpanel.add(disphoto1);
		disphoto1.setBounds(540,280,232,209);
	    
				
	    
		//photopanel.add(savephoto);
		//savephoto.setBounds(610,330,150,46);
		//savephoto.setVisible(false);
	    //photopanel.add(photoupload);
	//	photoupload.setBounds(550,50,278,270);
	//	photoupload.setOpaque(false);
		
		//photopanel.add(disphoto);
		disphoto.setBounds(550,50,278,270);
		
		
		c.add(photopanel);
		photopanel.setLayout(null);
	
		photopanel.setBackground(Color.red);
		//photopanel.add(photobody);
		//photobody.setBounds(0,0,971,429);
		

	    photopanel.add(photoupload);
		photoupload.setBounds(40,200,140,136);
		photoupload.setOpaque(false);
		
		photopanel.add(disphoto);
		disphoto.setBounds(40,200,140,136);
	    

	    photopanel.add(photouploada);
		photouploada.setBounds(230,200,140,136);
		photouploada.setOpaque(false);
		
		photopanel.add(disphotoa);
		disphotoa.setBounds(230,200,140,136);
	    
		
		photopanel.add(photouploadb);
		photouploadb.setBounds(420,200,140,136);
		photouploadb.setOpaque(false);
		
		photopanel.add(disphotob);
		disphotob.setBounds(420,200,140,136);
	    
		
		photopanel.add(photouploadc);
		photouploadc.setBounds(610,200,140,136);
		photouploadc.setOpaque(false);
		
		photopanel.add(disphotoc);
		disphotoc.setBounds(610,200,140,136);

		
		photopanel.add(photouploadd);
		photouploadd.setBounds(800,200,140,136);
		photouploadd.setOpaque(false);
		
		photopanel.add(disphotod);
		disphotod.setBounds(800,200,140,136);

		
		
	    
			photopanel.add(photoupload2);
			photoupload2.setBounds(40,370,140,136);
			photoupload2.setOpaque(false);
			
			photopanel.add(disphoto2);
			disphoto2.setBounds(40,370,140,136);
		    
			
			
			photopanel.add(photoupload2a);
			photoupload2a.setBounds(230,370,140,136);
			photoupload2a.setOpaque(false);
			
			photopanel.add(disphoto2a);
			disphoto2a.setBounds(230,370,140,136);
		    
			
			photopanel.add(photoupload2b);
			photoupload2b.setBounds(420,370,140,136);
			photoupload2b.setOpaque(false);
			
			photopanel.add(disphoto2b);
			disphoto2b.setBounds(420,370,140,136);

			
			photopanel.add(photoupload2c);
			photoupload2c.setBounds(610,370,140,136);
			photoupload2c.setOpaque(false);
			
			photopanel.add(disphoto2c);
			disphoto2c.setBounds(610,370,140,136);
		    
			
			photopanel.add(photoupload2d);
			photoupload2d.setBounds(800,370,140,136);
			photoupload2d.setOpaque(false);
			
			photopanel.add(disphoto2d);
			disphoto2d.setBounds(800,370,140,136);
		    
			
			
			
		    
		sample1.setBounds(420,100,300,30);
		sample1.setFont(new Font("Seoge UI", Font.PLAIN, 28));
		sample1.setForeground(Color.blue);
		photopanel.add(sample1);
		
		
		
		photopanel.add(savephoto);
		savephoto.setBounds(800,540,150,46);
		
		
		
		demographicsdim.setBounds(50,90,100,46);
		demographicsdim.setVisible(false);
		demographicsdim.setFocusPainted(false);
        demographicsdim.setMargin(new Insets(0, 0, 0, 0));
        demographicsdim.setContentAreaFilled(false);
        demographicsdim.setBorderPainted(false);
        demographicsdim.setOpaque(false);
        
        
       
       
        
        
		
	
	    
	    
	    regpanel.add(backbody);
	    backbody.setBounds(0,0,971,640);
	    
	    photopanel.add(photobody);
	   photobody.setBounds(0,0,971,640);
	    
		Regpage.addMouseListener(new MouseListener(){
		    public void mouseReleased(MouseEvent e) {
		    mouseDownCompCoords = null;
		    }
		    public void mousePressed(MouseEvent e) {
		    mouseDownCompCoords = e.getPoint();
		    }
		    public void mouseExited(MouseEvent e) {
		    }
		    public void mouseEntered(MouseEvent e) {
		    }
		    public void mouseClicked(MouseEvent e) {
		    }
		    });
		     
		    Regpage.addMouseMotionListener(new MouseMotionListener(){
		    public void mouseMoved(MouseEvent e) {
		    }
		     
		    public void mouseDragged(MouseEvent e) {
		    Point currCoords = e.getLocationOnScreen();
		    
		    Regpage.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
		    }
		    });
	    
	    home.addActionListener(this);
	    newreg.addActionListener(this);
	    photograph.addActionListener(this);
	    demographics.addActionListener(this);
		generate.addActionListener(this);
		photoupload.addActionListener(this);
		photouploada.addActionListener(this);
		photouploadb.addActionListener(this);
		photouploadc.addActionListener(this);
		photouploadd.addActionListener(this);
		photoupload1.addActionListener(this);
		photoupload2.addActionListener(this);
		photoupload2a.addActionListener(this);
		photoupload2b.addActionListener(this);
		photoupload2c.addActionListener(this);
		photoupload2d.addActionListener(this);
		savephoto.addActionListener(this);
		male.addActionListener(this);
		female.addActionListener(this);
		cancel.addActionListener(this);
		
		
	}
	
	
	public long generate()
	{
		long maximum=999999999999L;
        long minimum=111111111111L;
        
        randomNum=minimum + (long)(Math.random() * ((maximum - minimum) + 1));
        System.out.println(randomNum); 

		
		return randomNum;
	}
	
	
	
	public static void main(String [] args)
	{
		RegistrationPage rp = new RegistrationPage();
		rp.addon1();
		rp.generate();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==home)
		{
			RegisterTest rt = new RegisterTest();
			rt.RegisterTestinit();
			Regpage.setVisible(false);
		}
		if(e.getSource()==photograph)
		{
			
			regpanel.setVisible(false);
			photopanel.setVisible(true);
			System.out.println("Clicked");
			
		}
		if(e.getSource()==cancel)
		{
			System.exit(0);
		}
		
		if(e.getSource()==demographics)
		{
			
			regpanel.setVisible(true);
			photopanel.setVisible(false);
			System.out.println("Clicked");
			
			
		}
		if(e.getSource()==generate)
		{
			generate.setVisible(false);
			uid.setVisible(true);
			uid.setEditable(false);
			generate();
			uid.setText(String.valueOf(randomNum));
			Font font = new Font("Verdana", Font.BOLD, 16);
			uid.setFont(font);
			
			
		}
		if(e.getSource()==photoupload)
		{
		
			 try 
	            {
	    		  java.sql.Connection  db = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmb","root","");
	    	          Statement statement = db.createStatement();System.out.print("new connection created");
	    	          JOptionPane.showMessageDialog(null, "Done");
	    		 
	                    
	                     
	                      statement.execute(" insert into details (name,age,house,street,area,mobile,email,id)"
	                              + " values " +
	    			      "('"+name.getText()+"','"+age.getText()+"','"+house.getText()+"','"+
	                                   street.getText()+"','"+area.getText()+"'," +"'"+mobile.getText()+"','"+email.getText()+"','"+
	                              introuid.getText()+"')");
	                      JOptionPane.showMessageDialog(null, "Data saved");
	                     	      
	    		  db.close();
	    	 } catch (Exception ew)
	    	   {
	    	      JOptionPane.showMessageDialog(null, "Data could not be saved");
	    	      ew.printStackTrace();
	    	   }
	           ///////////////////try catch ends ////////////////////////////
	      
			
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Footprint Sample 1");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		            bi=ImageIO.read(file);
		            disphoto.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\1e.jpg"));
		            photoupload.setVisible(false);
		            savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
			
		    File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       
      
       
       
       
       
       
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  

		    
		    
		}
		
		
		if(e.getSource()==photouploada)
		{
			
			
			
			
			
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Footprint Sample 2");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		            bi=ImageIO.read(file);
		            disphotoa.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\1e.jpg"));
		            photouploada.setVisible(false);
		            savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
			
			
		}
		
		
		if(e.getSource()==photouploadb)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Footprint Sample 3");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		            bi=ImageIO.read(file);
		            disphotob.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\1e.jpg"));
		            photouploadb.setVisible(false);
		            savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
			
  File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  

		}
		
		
		if(e.getSource()==photouploadc)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Footprint Sample 4");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		            bi=ImageIO.read(file);
		            disphotoc.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\1e.jpg"));
		            photouploadc.setVisible(false);
		            savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
			
  File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  

		}
		
		
		if(e.getSource()==photouploadd)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Footprint Sample 5");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		            bi=ImageIO.read(file);
		            disphotod.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\1e.jpg"));
		            photouploadd.setVisible(false);
		            savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
			
			
		}
		
		
		
		if(e.getSource()==photoupload1)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload your Photograph");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		            bi=ImageIO.read(file);
		            disphoto1.setIcon(new ImageIcon(bi));
		            photoupload1.setVisible(false);
		           savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
  File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  

			
		}
		if(e.getSource()==photoupload2)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Palmprint Sample 1");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        
		      
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		        	bi=ImageIO.read(file);
		            disphoto2.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\2e.jpg"));
		            photoupload2.setVisible(false);
		            //
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
			
  File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  

		}
		

		if(e.getSource()==photoupload2a)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Palmprint Sample 2");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        
		      
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		        	bi=ImageIO.read(file);
		            disphoto2a.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\2e.jpg"));
		            photoupload2a.setVisible(false);
		            //
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
  File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  
			
			
		}

		
		
		if(e.getSource()==photoupload2b)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Palmprint Sample 3");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        
		      
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		        	bi=ImageIO.read(file);
		            disphoto2b.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\2e.jpg"));
		            photoupload2b.setVisible(false);
		            //savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
  File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  
			
			
		}

		
		if(e.getSource()==photoupload2c)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Palmprint Sample 4");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        
		      
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		        	bi=ImageIO.read(file);
		            disphoto2c.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\2e.jpg"));
		            photoupload2c.setVisible(false);
		            //savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
			
  File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  
			
		}

		
		if(e.getSource()==photoupload2d)
		{
			filechooser= new JFileChooser("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images");
		    filechooser.setDialogTitle("Upload Your Palmprint Sample 5");
		    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		    //below codes for select  the file 
		    int returnval=filechooser.showOpenDialog(this);
		    if(returnval==JFileChooser.APPROVE_OPTION)
		    {
		        File file = filechooser.getSelectedFile();
		        
		      
		        BufferedImage bi;
		        try
		        {   //display the image in jlabel
		        	bi=ImageIO.read(file);
		            disphoto2d.setIcon(new ImageIcon("F:\\Live_WorkSpaces\\Java_WorkSpace\\MMB_GUI\\MMB_GUI\\images\\2e.jpg"));
		            photoupload2d.setVisible(false);
		            //savephoto.setVisible(true);
		        }
		        catch(IOException e1)
		        {

		        }
		        this.pack();
		    }
			
  File f = new File(filechooser.getSelectedFile().toString());
	        

            try { 
  	
    	File sourceFile=new File(filechooser.getSelectedFile().toString());
    	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
          File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
          BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
          int theChar;
          while ((theChar = bis.read()) != -1) {
             bos.write(theChar);
          }
       bos.close();
       bis.close();
       System.out.println ("copy done!");
       //JOptionPane.showMessageDialog(null, "Photograph Saved");
 }
 catch (Exception ex) 
 {
  ex.printStackTrace();
  //if(uid.getText()==null)
  //{   
  JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
  //}
 }  
			
		}

		
		
		
		if(e.getSource()==savephoto)     
	      {
	          PrintWriter pw = null ;
	          //JFileChooser filechooser= new JFileChooser();
	         // a.showOpenDialog(null);
	         // System.out.print("path"+a.getSelectedFile());
	          //////////////////file reading and writting////////////////
	          File f = new File(filechooser.getSelectedFile().toString());
	        

	                 try { 
	       	
	         	File sourceFile=new File(filechooser.getSelectedFile().toString());
	         	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile), 4096);
	               File targetFile = new File("C:\\mmb_test\\"+introuid.getText()+"foot1.png"); ////////////////////////////////////////////("images\\"+t8.getText()+".png")
	               BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile), 4096);
	               int theChar;
	               while ((theChar = bis.read()) != -1) {
	                  bos.write(theChar);
	               }
	            bos.close();
	            bis.close();
	            System.out.println ("copy done!");
	            JOptionPane.showMessageDialog(null, "Data Saved.Thank You !");
	      }
	      catch (Exception ex) 
	      {
	       ex.printStackTrace();
	       //if(uid.getText()==null)
	       //{   
	       JOptionPane.showMessageDialog(null, "Error in saving pgotograph!,Make sure aadhaar number is genrated before saving");
	       //}
	      }  
	                
	                	           
	            
	            ///////////////////////////file reading
	      }
	          
		
			
		// TODO Auto-generated method stub
		
}




}

