/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbmsp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class Mainframe {
    private JFrame f3;
    private Icon ic, ic1, ic2,ic3, ic4, ic5, ic6, i, i2, i3, i4;
    private JLabel  bg2, lb1,lb2, lb3,lb4,lb5, lb6,lb7,lb8, lb9,lb10, lb11, lb12, lb13, lab1, lab2, lab3, lab4,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12, sl,sl1, salary, label1, label2 ;
    private JPanel pan1, pan2;
    private JButton btn, btn2, btn3, btn4,sbtn1, search, addat,b1, b2, b3, b4,sout, back, butn1, butn2 ;
    private JTextField txt, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, text1, text2, text3, text4, t1, t2,t3,t4,t5, tt1, tt2;
    private JComboBox box, box2,box3,box4,box5,box6, box8, s1;
    
    
    
    
    
    
    Mainframe(){
    
    Mainframe();
    
    
    }
    
public void Mainframe(){
    
    
    Image j = Toolkit.getDefaultToolkit().getImage("workers.png");
        f3 = new JFrame("Labour Managment System");
        f3.setBounds(530, 160, 800, 700);
        f3.setLayout(null);
        f3.setLocationRelativeTo(null);
        f3.setResizable(false);
        f3.setIconImage(j);
        
        ic=new ImageIcon("bg2.png");
        bg2=new JLabel(ic);
        bg2.setBounds(0, 0,800,700);
        
        pan1 = new JPanel();
        pan1.setBounds(10, 10, 200, 650);
        pan1.setLayout(null);
        pan1.setBackground(Color.white);
        pan1.setOpaque(false);
        
        pan2 = new JPanel();
        pan2.setBounds(220, 10, 560, 650);
        pan2.setLayout(null);
        pan2.setBackground(Color.green);
        pan2.setOpaque(false);
        
        pan2.setBorder(BorderFactory.createLineBorder(Color.black,5));
       
        
        ic5 = new ImageIcon("backk.png");
        sout = new JButton(ic5);
        sout.setBounds(10, 10, 60, 50);
        sout.setLayout(null);
        sout.setBackground(Color.red);
        sout.setOpaque(false);
        sout.setBorder(null);
        sout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               f3.dispose();
               Loginframe f1 = new Loginframe();
            }
        });
        
        
        
        
        ic6 = new ImageIcon("sout.png");
        back = new JButton(ic6);
        back.setBounds(470, 590, 60, 50);
        back.setLayout(null);
        back.setBackground(Color.red);
        back.setOpaque(false);
        back.setBorder(null);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              f3.dispose();
              
              Loginframe f = new Loginframe();
            }
        });
        
        
        
        
        
        
        
        lb1 = new JLabel("Name");
        lb1.setBounds(28, 198, 50, 15);
        lb1.setFont(new Font("italic",Font.BOLD,15));
        
        txt = new JTextField();
        txt.setBounds(75, 180, 170, 40);
        txt.setFont(new Font("italic", Font.BOLD, 15));
  
        lb2 = new JLabel("Referred By");
        lb2.setBounds(255, 198, 100, 15);
        lb2.setFont(new Font("italic",Font.BOLD,15));
        
        txt2 = new JTextField();
        txt2.setBounds(353, 180, 180, 40);
        txt2.setFont(new Font("italic", Font.BOLD, 15));
        
        lb3 = new JLabel("Age");
        lb3.setBounds(28, 258, 50, 20);
        lb3.setFont(new Font("italic",Font.BOLD,15));
        
        txt3 = new JTextField();
        txt3.setBounds(75, 252, 170, 40);
        txt3.setFont(new Font("italic", Font.BOLD, 15));
        
        lb4 = new JLabel("Experience");
        lb4.setBounds(255, 258, 100, 25);
        lb4.setFont(new Font("italic",Font.BOLD,15));
        
        txt4 = new JTextField();
        txt4.setBounds(353, 252, 180, 40);
        txt4.setFont(new Font("italic", Font.BOLD, 15));
        
        lb5 = new JLabel("Salary");
        lb5.setBounds(28, 328, 50, 20);
        lb5.setFont(new Font("italic",Font.BOLD,15));
        
        txt5 = new JTextField();
        txt5.setBounds(75, 322, 170, 40);
        txt5.setFont(new Font("italic", Font.BOLD, 15));
        
        lb6 = new JLabel("Address");
        lb6.setBounds(265, 328, 60, 20);
        lb6.setFont(new Font("italic",Font.BOLD,15));
            
        txt6 = new JTextField();
        txt6.setBounds(353, 322, 180, 40);
        txt6.setFont(new Font("italic", Font.BOLD, 15));
        
        lb7 = new JLabel("Contact");
        lb7.setBounds(17, 398, 60, 20);
        lb7.setFont(new Font("italic",Font.BOLD,15));
        
        txt7 = new JTextField();
        txt7.setBounds(75, 392, 170, 40);
        txt7.setFont(new Font("italic", Font.BOLD, 15));
        
        lb8 = new JLabel("Status");
        lb8.setBounds(275, 398, 80, 20);
        lb8.setFont(new Font("italic",Font.BOLD,15));
        
        txt8 = new JTextField();
        txt8.setBounds(353, 392, 180, 40);
        txt8.setFont(new Font("italic", Font.BOLD, 15));
        
        lab1 = new JLabel("Height");
        lab1.setBounds(22, 468, 50, 20);
        lab1.setFont(new Font("italic",Font.BOLD,15));
        
        text1 = new JTextField();
        text1.setBounds(75, 462, 170, 40);
        text1.setFont(new Font("italic", Font.BOLD, 15));
        
        lab2= new JLabel("Weight");
        lab2.setBounds(275, 468, 80, 20);
        lab2.setFont(new Font("italic",Font.BOLD,15));
        
        text2 = new JTextField();
        text2.setBounds(353, 462, 180, 40);
        text2.setFont(new Font("italic", Font.BOLD, 15));
        
        lab3 = new JLabel("Height");
        lab3.setBounds(22, 468, 50, 20);
        lab3.setFont(new Font("italic",Font.BOLD,15));
        
        text3 = new JTextField();
        text3.setBounds(75, 462, 170, 40);
        text3.setFont(new Font("italic", Font.BOLD, 15));
        
        lab4= new JLabel("Weight");
        lab4.setBounds(275, 468, 80, 20);
        lab4.setFont(new Font("italic",Font.BOLD,15));
        
        text4 = new JTextField();
        text4.setBounds(353, 462, 180, 40);
        text4.setFont(new Font("italic", Font.BOLD, 15));
        
        
        
        
        txt9 = new JTextField();
        txt9.setBounds(75, 180, 170, 40);
        txt9.setFont(new Font("italic", Font.BOLD, 15));
       
        txt10 = new JTextField();
        txt10.setBounds(353, 180, 180, 40);
        txt10.setFont(new Font("italic", Font.BOLD, 15));
      
        txt11 = new JTextField();
        txt11.setBounds(75, 252, 170, 40);
        txt11.setFont(new Font("italic", Font.BOLD, 15));
    
        txt12 = new JTextField();
        txt12.setBounds(353, 252, 180, 40);
        txt12.setFont(new Font("italic", Font.BOLD, 15));

        txt13 = new JTextField();
        txt13.setBounds(75, 322, 170, 40);
        txt13.setFont(new Font("italic", Font.BOLD, 15));
        
         txt14 = new JTextField();
        txt14.setBounds(353, 322, 180, 40);
        txt14.setFont(new Font("italic", Font.BOLD, 15));
        
        txt15 = new JTextField();
        txt15.setBounds(75, 392, 170, 40);
        txt15.setFont(new Font("italic", Font.BOLD, 15));
        
        txt16 = new JTextField();
        txt16.setBounds(353, 392, 180, 40);
        txt16.setFont(new Font("italic", Font.BOLD, 15));
        
        
        lb9 = new JLabel("Select Worker");
        lb9.setBounds(28,552, 100, 20);
        lb9.setFont(new Font("italic", Font.BOLD, 15));
        
        
        
        
        
        
        ic1 = new ImageIcon("w.png");
        lb10 = new JLabel(ic1);
        lb10.setBounds(350, 10, 150, 150);
        
        ic2 = new ImageIcon("lab2.png");
        lb12 = new JLabel(ic2);
        lb12.setBounds(350, 10, 150, 150);
        
        
        
        lb11 = new  JLabel("Add Worker");
        lb11.setBounds(80, 50, 200, 100);
        lb11.setFont(new Font("italic", Font.BOLD, 35));
        
        lb13 = new  JLabel("Details");
        lb13.setBounds(80, 50, 200, 100);
        lb13.setFont(new Font("italic", Font.BOLD, 35));
        
        search = new JButton("Search");
        search.setBounds(270, 550, 100, 30);
        search.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
         Object id = box.getSelectedItem();
         
                try {
                    Connectivity.rs = Connectivity.st.executeQuery("Select name, ref_by, age, experience, salary, Adress, Contact,Statuss, height, weightt from Add_Worker where id = "+id);
                    
                    while(Connectivity.rs.next()){
                    
                        String name = Connectivity.rs.getString("name");
                        String ref = Connectivity.rs.getString("ref_by");
                        int age = Connectivity.rs.getInt("age");
                        String exp = Connectivity.rs.getString("experience");
                        int sal = Connectivity.rs.getInt("salary");
                        String add = Connectivity.rs.getString("Adress");
                        String cont = Connectivity.rs.getString("Contact");
                        String stat = Connectivity.rs.getString("Statuss");
                        String height = Connectivity.rs.getString("height");
                        String weight = Connectivity.rs.getString("weightt");
                        
                        txt9.setText(name);
                        txt10.setText(ref);
                        txt11.setText(String.valueOf(age));
                        txt12.setText(exp);
                        txt13.setText(String.valueOf(sal));
                        txt14.setText(add);
                        txt15.setText(cont);
                        txt16.setText(stat);
                        text3.setText(height);
                        text4.setText(weight);
                        
                        
                    
                    
                    
                    
                    
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
       
        
        
        box = new JComboBox();
        box.setBounds(130, 550, 130, 30);
        box.setEditable(false);
        
        
        
        
        try {
            
            Connectivity.rs=Connectivity.st.executeQuery("Select id from Add_Worker");
            while(Connectivity.rs.next()){
            box.addItem(Connectivity.rs.getInt("id"));}
        } catch (SQLException ex) {
            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
        
        
        
        l1 = new  JLabel("Attendance");
        l1.setBounds(80, 50, 200, 100);
        l1.setFont(new Font("italic", Font.BOLD, 35));
        
        ic3 = new ImageIcon("att.png");
        l2 = new JLabel(ic3);
        l2.setBounds(350, 10, 150, 150);
        
        l3 = new JLabel("Worker ID");
        l3.setBounds(50, 150, 100, 30);
        l3.setFont(new Font("italic", Font.BOLD, 15));
        
        
        box2 = new JComboBox();
        box2.setBounds(150, 150, 130, 30);
        box2.setEditable(false);
        
        try {
            Connectivity.rs=Connectivity.st.executeQuery("Select id from Add_Worker");
            while(Connectivity.rs.next()){
            box2.addItem(Connectivity.rs.getInt("id"));}
        } catch (SQLException ex) {
            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        l4 = new JLabel("Status");
        l4.setBounds(150, 236, 50, 30);
        l4.setFont(new Font("italic", Font.BOLD, 15));
        
        
        String[] g = new String[]{"Present", "Absent"};
        box3 = new JComboBox(g);
        box3.setBounds(230, 236, 150, 30);
        box3.setFont(new Font("italic", Font.BOLD, 15));
        box3.setEditable(false);
        
        l5 = new JLabel("Time in");
        l5.setBounds(150, 286, 100, 30);
        l5.setFont(new Font("italic", Font.BOLD, 15));
        
        l6 = new JLabel("Time Out");
        l6.setBounds(150, 336, 100, 30);
        l6.setFont(new Font("italic", Font.BOLD, 15));
        
        l7 = new JLabel("Date");
        l7.setBounds(150, 378, 100, 30);
        l7.setFont(new Font("italic", Font.BOLD, 15));
        
        l8 = new JLabel("Day");
        l8.setBounds(150, 428, 100, 30);
        l8.setFont(new Font("italic", Font.BOLD, 15));
        
        l9 = new JLabel("Worker Name");
        l9.setBounds(50, 182, 100, 30);
        l9.setFont(new Font("italic", Font.BOLD, 15));
        
        l10 = new JLabel("Shift(s)");
        l10.setBounds(150, 477, 100, 30);
        l10.setFont(new Font("italic", Font.BOLD, 15));
 
        l11 = new JLabel("Building");
        l11.setBounds(150, 522, 100, 30);
        l11.setFont(new Font("italic", Font.BOLD, 15));
 
        addat = new JButton("Add Attendance");
        addat.setBounds(200, 590, 130, 40);
        addat.setLayout(null);
        addat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
         
                String name = t2.getText();
                Object date = t3.getText();
                String building = t1.getText();
                Object id = box2.getSelectedItem();
                Object status = box3.getSelectedItem();
                Object timein = box4.getSelectedItem();
                Object timeout = box5.getSelectedItem();
                Object day = box6.getSelectedItem();
                Object shift = box8.getSelectedItem();
                
                
                try {
                    Connectivity.st.executeUpdate("insert into attendence values ("+id+", '"+name+"','"+status+"','"+timein+"', '"+timeout+"', '"+date+"', '"+day+"',"+shift+",'"+building+"' )");
                    JOptionPane.showMessageDialog(null, "Attendance added");
                    
                t2.setText("");
                t3.setText("");
                t1.setText("");
                box2.setSelectedItem(1);
                box3.setSelectedItem("Present");
                box4.setSelectedItem("8:30 AM");
                box5.setSelectedItem("4:00 PM");
                box6.setSelectedItem("Monday");
                box8.setSelectedItem(1);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                
            }
        });
        
    
        
        
        
        
        
        String[] t = new String[]{"Absent ","9:00 AM", "9:00 AM","9:30 AM", "9:30 AM" ,"10:00 AM", "10:30 AM", "11:00 AM"};
        box4 = new JComboBox(t);
        box4.setBounds(230,282, 150, 30);
        box4.setFont(new Font("italic", Font.BOLD, 15));
        
        String[] tO = new String[]{"Absent ", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM"};
        box5 = new JComboBox(tO);
        box5.setBounds(230,332, 150, 30);
        box5.setFont(new Font("italic", Font.BOLD, 15));
        
        t3 = new JTextField();
        t3.setBounds(230,382, 150, 30);
        t3.setFont(new Font("italic", Font.BOLD, 15));
        
        JButton button3 = new JButton("Select");
        button3.setBounds(390, 382, 70, 29);
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
         
                t3.setText(new Calendar(f3).setPickedDate());
                
            }
        });
        
     

        
        
        String[] d = new String[]{"Monday","Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
        box6 = new JComboBox(d);
        box6.setBounds(230,430, 150, 30);
        box6.setFont(new Font("italic", Font.BOLD, 15));
        
       
        
        String[] sh = new String[]{"0","1", "2", "3"};
        box8 = new JComboBox(sh);
        box8.setBounds(230,485, 150, 30);
        box8.setFont(new Font("italic", Font.BOLD, 15));        
        
        t1 = new JTextField();
        t1.setBounds(230,535, 150, 30);
        t1.setFont(new Font("italic", Font.BOLD, 15));
        
        
        t2 = new JTextField();
        t2.setBounds(150, 190, 150, 30);
        t2.setFont(new Font("italic", Font.BOLD, 15));
        t2.setEditable(false);
        
        
        
        
        
        
        
        
        
        sbtn1 = new JButton("SUBMIT");
        sbtn1.setLayout(null);
        sbtn1.setBounds(190, 520, 150, 40);
        sbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
              
                    
                    String name = txt.getText();
                    String ref = txt2.getText();
                    String age = txt3.getText();
                    String exp = txt4.getText();
                    String sal = txt5.getText();
                    String addr = txt6.getText();
                    String cont = txt7.getText();
                    String stat = txt8.getText();
                    String height = text1.getText();
                    String weight = text2.getText();
                    
                    try {
                        Connectivity.st.executeUpdate("insert into Add_Worker(name, ref_by,age,experience,salary,Adress,Contact,Statuss,height,weightt)values('"+name+"','"+ref+"',"+age+",'"+exp+"',"+sal+",'"+addr+"','"+cont+"','"+stat+"','"+height+"','"+weight+"')");
                        JOptionPane.showMessageDialog(null, "Worker Added.");
                        txt.setText("");
                        txt2.setText("");
                        txt3.setText("");
                        txt4.setText("");
                        txt5.setText("");
                        txt6.setText("");
                        txt7.setText("");
                        txt8.setText("");
                        text1.setText("");
                        text2.setText("");
                        
                        
                        
                      box2.removeAllItems();
            Connectivity.rs=Connectivity.st.executeQuery("Select id from Add_Worker");
            while(Connectivity.rs.next()){
               int a = Connectivity.rs.getInt("id");
                box2.addItem(a);}
            
            box.removeAllItems();
             Connectivity.rs=Connectivity.st.executeQuery("Select id from Add_Worker");
            while(Connectivity.rs.next()){
            box.addItem(Connectivity.rs.getInt("id"));}
            
            s1.removeAllItems();
             Connectivity.rs=Connectivity.st.executeQuery("Select id from Add_Worker");
            while(Connectivity.rs.next()){
            s1.addItem(Connectivity.rs.getInt("id"));}
            
            
                   
          
                        
                        
                    } 
                    
                    catch (SQLException ex) {
                        
                         if(txt.getText().equals("") || txt2.getText().equals("")||txt3.getText().equals("")||txt4.getText().equals("")||txt5.getText().equals("")||txt6.getText().equals("")||txt7.getText().equals("")||txt8.getText().equals("")||text1.getText().equals("")||text2.getText().equals("")){
            
                 JOptionPane.showMessageDialog(null, "Please fill all fields!!");
                         
                         }
                 
                
               
                }
                
                
            }
        });
        
        
        
        
        
        salary = new JLabel("Salary");
        salary.setBounds(80, 30, 200, 100);
        salary.setFont(new Font("italic", Font.BOLD, 40));
        
        sl = new JLabel("Worker ID");
        sl.setBounds(50, 150, 100, 30);
        sl.setFont(new Font("italic", Font.BOLD, 15));
        
        JButton button2 = new JButton("Search");
        button2.setBounds(320, 150, 80, 30);
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
         
           
        
        
        
        Object b = s1.getSelectedItem();
        
         try {
                    Connectivity.rs = Connectivity.st.executeQuery("Select name from Add_Worker where id = "+b);
                    
                    while(Connectivity.rs.next()){
                    
                        String name = Connectivity.rs.getString("name");    
                        t4.setText(name);
          }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
         }
        });
        
        sl1 = new JLabel("Worker Name");
        sl1.setBounds(50, 195, 100, 30); 
        sl1.setFont(new Font("italic",Font.BOLD, 15));
        
        label1 = new JLabel("Date From");
        label1.setBounds(30, 260,90 ,30);
        label1.setFont(new Font("italic",Font.BOLD, 15));
        
        
        tt1 = new JTextField();
        tt1.setBounds(110, 260, 90, 30);
        
        butn1 = new JButton("Select");
        butn1.setBounds(210, 260, 70, 30);
        butn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
         tt1.setText(new Calendar(f3).setPickedDate());
            }
        });
        
        
        label2 = new JLabel("To");
        label2.setBounds(290, 260, 20, 30);
        label2.setFont(new Font("italic",Font.BOLD, 15));
        
        tt2 = new JTextField();
        tt2.setBounds(320, 260, 90, 30);
        
        butn2 = new JButton("Select");
        butn2.setBounds(420, 260, 70, 30);
         butn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
         tt2.setText(new Calendar(f3).setPickedDate());
            }
        });
        
        
        
        
        
        
        
        
        b1 = new JButton("Show Salary");
        b1.setBounds(170, 310, 170, 55);
        b1.setFont(new Font("italic",Font.BOLD, 15));
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
            Object b = s1.getSelectedItem();
            Object from = tt1.getText();
            Object to = tt2.getText();
            String name =t4.getText();
                try {int count = 0;
                    Connectivity.rs=Connectivity.st.executeQuery("Select salary from Add_Worker where id ="+b);
                    while (Connectivity.rs.next()){
                    int sal=Connectivity.rs.getInt("salary");
                    Connectivity.rs=Connectivity.st.executeQuery("Select statuss from attendence where statuss='Present' AND id ="+b+"AND datee Between '"+from+"' AND '"+to+"'");
                    while (Connectivity.rs.next()){
                      
                      count++;
                    }
                    t5.setText(String.valueOf(sal*count));}
                    
                  
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, ex.getMessage());

                }
                
                try {
                    String salary=t5.getText();
                    Connectivity.st.executeUpdate("insert into weekly_salary values("+b+",'"+name+"','"+from+"','"+to+"',"+salary+")");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        

        s1 = new JComboBox();
        s1.setBounds(150, 150, 150, 30);
        s1.setFont(new Font("italic", Font.BOLD, 15));
        
        try {
            Connectivity.rs=Connectivity.st.executeQuery("Select id from Add_Worker");
            while(Connectivity.rs.next()){
            s1.addItem(Connectivity.rs.getInt("id"));}
        } catch (SQLException ex) {
            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
        
      
        t4 = new JTextField();
        t4.setBounds(150, 195, 150, 32);
        t4.setFont(new Font("italic", Font.BOLD, 15));
        t4.setEditable(false);
        
        JButton button = new JButton("Search");
        button.setBounds(300, 150, 80, 30);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
         
           
        
        
        
        Object b = box2.getSelectedItem();
        
         try {
                    Connectivity.rs = Connectivity.st.executeQuery("Select name from Add_Worker where id = "+b);
                    
                    while(Connectivity.rs.next()){
                    
                        String name = Connectivity.rs.getString("name");
                       
                        
                        t2.setText(name);
                        
                        
                    
                    
                    
                    
                    
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
         }
        });
        t5 = new JTextField();
        t5.setBounds(155, 380, 200, 50);
        t5.setFont(new Font("italic",Font.BOLD, 15));
        t5.setEditable(false);
        
        ic4 = new ImageIcon("salary.png");
        l12 = new JLabel(ic4);
        l12.setBounds(350, 10, 150, 150);;
        
        b2 = new JButton("Weekly Attendace Report");
        b2.setBounds(145, 450, 220, 40);
        b2.setFont(new Font("italic",Font.BOLD, 15));
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
         AttendFrame rpt= new AttendFrame();
            }
        });
        
        JTextField ht = new JTextField();
        ht.setBounds(280, 505, 100, 30);
        ht.setEditable(false);
        
         JTextField ht1 = new JTextField();
        ht1.setBounds(390, 505, 100, 30);
        ht1.setEditable(false);
        
        
        b3 = new JButton("Weekly Highest Earner");
        b3.setBounds(50, 500, 220, 40);
        b3.setFont(new Font("italic",Font.BOLD, 15));
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                 try {
                     
                    Object from = tt1.getText();
                    Object to = tt2.getText();
                    Connectivity.rs=Connectivity.st.executeQuery("select name,salary from weekly_salary where salary=(select max(salary) from weekly_salary) AND date_from Between '"+from+"' AND '"+to+"'");
                    while(Connectivity.rs.next()){
                        String name=Connectivity.rs.getString("name");
                        int salary=Connectivity.rs.getInt("salary");
                        
                        ht.setText(name);
                        ht1.setText(String.valueOf(salary));
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
         JTextField lt = new JTextField();
        lt.setBounds(280, 555, 100, 30);
        lt.setEditable(false);
        
        
         JTextField lt1 = new JTextField();
        lt1.setBounds(390, 555, 100, 30);
        lt1.setEditable(false); 
        
        
        
        b4 = new JButton("Weekly Lowest Earner");
        b4.setBounds(50, 550, 220, 40);
        b4.setFont(new Font("italic",Font.BOLD, 15));
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                lt.setText("");
                lt1.setText("");
                
                try {
                    Object from = tt1.getText();
                    Object to = tt2.getText();
                    
                    Connectivity.rs=Connectivity.st.executeQuery("select name,salary from weekly_salary where salary=(select min(salary) from weekly_salary) AND date_from Between '"+from+"' AND '"+to+"'");
                    while(Connectivity.rs.next()){
                        String name=Connectivity.rs.getString("name");
                        int salary=Connectivity.rs.getInt("salary");
                        
                        lt.setText(name);
                        lt1.setText(String.valueOf(salary));
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
       
       
        
        
        
        i = new ImageIcon("adduser.png");
        btn = new JButton(i);
        btn.setLayout(null);
        btn.setBounds(10, 0, 170, 160);
        btn.setBorder(BorderFactory.createLineBorder(Color.gray,5));
        btn.setFont(new Font("italic", Font.BOLD, 15));
   
        
        btn.addActionListener(new ActionListener (){    
            @Override
            public void actionPerformed(ActionEvent ae) {
                btn2.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn3.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn4.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn.setBorder(BorderFactory.createLineBorder(Color.black,5));
                
                
            pan2.removeAll();
            
            
            pan2.add(lb1);
            pan2.add(lb2);
            pan2.add(lb3);
            pan2.add(lb4);
            pan2.add(lb5);
            pan2.add(lb6);
            pan2.add(lb7);
            pan2.add(lb8);
            pan2.add(lb10);
            pan2.add(lb11);
            pan2.add(sbtn1);
            pan2.add(lab1);
            pan2.add(lab2);
            pan2.add(back);
            
            
            pan2.add(txt);
            pan2.add(txt2);
            pan2.add(txt3);
            pan2.add(txt4);
            pan2.add(txt5);
            pan2.add(txt6);
            pan2.add(txt7);
            pan2.add(txt8);
            pan2.add(text1);
             pan2.add(text2);
            pan2.repaint();
            pan2.revalidate();
            
              
          
            }
        });
        
        i2 = new ImageIcon("userinfo.png");
        btn2 = new JButton(i2);
        btn2.setLayout(null);
        btn2.setBounds(10, 165, 170, 160);
        btn2.setFont(new Font("italic", Font.BOLD, 15));
        btn2.setBorder(BorderFactory.createLineBorder(Color.gray,5));
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn3.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn4.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn2.setBorder(BorderFactory.createLineBorder(Color.black,5));
                pan2.removeAll();
                pan2.add(lb1);
                pan2.add(lb2);
                pan2.add(lb3);
                pan2.add(lb4);
                pan2.add(lb5);
                pan2.add(lb6);
                pan2.add(lb7);
                pan2.add(lb8);
                pan2.add(lb12);
                pan2.add(lb13);
                pan2.add(lab3);
                pan2.add(lab4);
                pan2.add(search);
                pan2.add(back);
                
                pan2.add(box);
                pan2.add(lb9);
               
                pan2.add(txt9);
                txt9.setEditable(false);
                pan2.add(txt10);
                txt10.setEditable(false);
                pan2.add(txt11);
                txt11.setEditable(false);
                pan2.add(txt12);
                txt12.setEditable(false);
                pan2.add(txt13);
                txt13.setEditable(false);
                pan2.add(txt14);
                txt14.setEditable(false);
                pan2.add(txt15);
                txt15.setEditable(false);
                pan2.add(txt16);
                txt16.setEditable(false);
                pan2.add(text3);
                text3.setEditable(false);
                pan2.add(text4);
                text4.setEditable(false);
                        
                
                pan2.repaint();
                pan2.revalidate();
               
            }
        });
        
        i3 = new ImageIcon("sal2.png");
        btn3 = new JButton(i3);
        btn3.setLayout(null);
        btn3.setBounds(10, 330, 170, 160);
        btn3.setFont(new Font("italic", Font.BOLD, 15));
        btn3.setBorder(BorderFactory.createLineBorder(Color.gray,5));
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pan2.removeAll();
                btn.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn2.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn4.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn3.setBorder(BorderFactory.createLineBorder(Color.black,5));
                
                pan2.add(s1);
                pan2.add(t4);
                pan2.add(t5);
                pan2.add(b1);
                pan2.add(b2);
                pan2.add(b3);
                pan2.add(b4);
                pan2.add(sl);
                pan2.add(sl1);
                pan2.add(salary);
                pan2.add(l12);
                pan2.add(back);
                pan2.add(label1);
                pan2.add(label2);
                pan2.add(tt1);
                pan2.add(tt2);
                pan2.add(butn1);
                pan2.add(butn2);
                pan2.add(button2);
                pan2.add(ht);
                pan2.add(lt);
                pan2.add(ht1);
                pan2.add(lt1);
                
                
                
                pan2.repaint();
                pan2.revalidate();
            }
        });
        
        i4 = new ImageIcon("at.png");
        btn4 = new JButton(i4);
        btn4.setLayout(null);
        btn4.setBounds(10, 495, 170, 155);
        btn4.setFont(new Font("italic", Font.BOLD, 15));
        btn4.setBorder(BorderFactory.createLineBorder(Color.gray,5));
        
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                btn.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn2.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn3.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn4.setBorder(BorderFactory.createLineBorder(Color.black,5));
                
                pan2.removeAll();
                pan2.add(l1);
                pan2.add(l2);
                pan2.add(l3);
                pan2.add(l4);
                pan2.add(l5);
                pan2.add(l6);
                pan2.add(l7);
                pan2.add(l8);
                pan2.add(l9);
                pan2.add(l10);
                pan2.add(l11); 
                pan2.add(back);
                
                
                
                pan2.add(box4);
                pan2.add(box5);
                pan2.add(t3);
                pan2.add(t1);
                pan2.add(t2);
                pan2.add(box6);
                pan2.add(button);
                pan2.add(box8);
                pan2.add(button3);
                
                
                
                
                pan2.add(addat);
                pan2.add(box2);
                pan2.add(box3);
                
                pan2.repaint();
                pan2.revalidate();
                
            }
        });
        
                 btn2.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn3.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn4.setBorder(BorderFactory.createLineBorder(Color.gray,5));
                btn.setBorder(BorderFactory.createLineBorder(Color.black,5));
        
        pan2.removeAll();
            
            
            pan2.add(lb1);
            pan2.add(lb2);
            pan2.add(lb3);
            pan2.add(lb4);
            pan2.add(lb5);
            pan2.add(lb6);
            pan2.add(lb7);
            pan2.add(lb8);
            pan2.add(lb10);
            pan2.add(lb11);
            pan2.add(sbtn1);
            pan2.add(lab1);
            pan2.add(lab2);
            pan2.add(back);
            
            
            pan2.add(txt);
            pan2.add(txt2);
            pan2.add(txt3);
            pan2.add(txt4);
            pan2.add(txt5);
            pan2.add(txt6);
            pan2.add(txt7);
            pan2.add(txt8);
            pan2.add(text1);
             pan2.add(text2);
             
            pan2.repaint();
            pan2.revalidate();
        
        
        
        
        
        
        
        
        
       
           
        
        pan2.add(back);
        pan1.add(btn4); 
        pan1.add(btn3); 
        pan1.add(btn2); 
        pan1.add(btn);   
      
        
        f3.add(pan2);
        f3.add(pan1);
        f3.add(bg2);
        f3.setVisible(true);
    
    
}


 public static void main(String[] args){
 
 
 }
}

