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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public final class Loginframe {
public static  String username1;
    
    JFrame f;
    Icon i1, i3,i4;
    JLabel bg, main,icon1,lbl1, lbl2, lbl3;
    JTextField txt1;
    JPasswordField pw1;
    JButton btn1;
    
    Loginframe(){
        
    Loginframe();
    
    }   
    
    public void Loginframe(){

        Image i = Toolkit.getDefaultToolkit().getImage("workers.png");
        
        
        f=new JFrame("Labour Managment System");
        f.setBounds(530, 160, 800, 700);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setIconImage(i);
        f.getContentPane().setBackground(Color.GRAY);
        
        i1=new ImageIcon("bg2.png");
        bg=new JLabel(i1);
        bg.setBounds(0, 0,800,700);
        
        
        i3 = new ImageIcon("icon1(2).png");
        icon1 = new JLabel(i3);
        icon1.setBounds(240, 80, 150, 150);
        
        lbl1 = new JLabel("LOGIN");
        lbl1.setBounds(380, 125, 150, 50);
        lbl1.setFont(new Font("verdana", Font.BOLD, 40));
        lbl1.setForeground(Color.DARK_GRAY);
        
        lbl2 = new JLabel("USERNAME ");
        lbl2.setBounds(160, 220, 180, 100);
        lbl2.setFont(new Font("verdana", Font.BOLD, 23));
        
        lbl3 = new JLabel("PASSWORD ");
        lbl3.setBounds(160, 320, 180, 100);
        lbl3.setFont(new Font("verdana", Font.BOLD, 23));
        
        txt1 = new JTextField();
        txt1.setBounds(330, 250, 300, 50);
        txt1.setFont(new Font("italic",Font.PLAIN,20));
        
        pw1 = new JPasswordField();
        pw1.setBounds(330, 350, 300, 50);
        pw1.setFont(new Font("italic",Font.PLAIN,20));
        
        i4 = new ImageIcon();
        btn1 = new JButton("LOG IN");
        btn1.setFont(new Font("italic",Font.BOLD,23));
        btn1.setBounds(280, 450, 240, 70);
        btn1.setBackground(Color.white);
        btn1.setOpaque(true);
       
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    String u,p;
                    u=txt1.getText().toString();
                    p=pw1.getText().toString();
                    Connectivity.connect();
                    ResultSet rs = Connectivity.st.executeQuery("select * from users where username='"+u+"' and password='"+p+"'");
                    if(rs.next()){
                        
                        username1=u;
                        
                        if(u.equals("admin")){
                            
                           Mainframe m=new Mainframe ();
                           // m.setFormf3();
                           f.setVisible(false);
                       }
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect username or password");
                    }} catch (SQLException ex) {
                    Logger.getLogger(Loginframe.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
                
            }});
        
       
        f.add(btn1);
        f.add(pw1);
        f.add(txt1);
        f.add(lbl2);
        f.add(lbl1);
        f.add(lbl3);
        f.add(icon1);
        f.add(bg);
   
        f.setVisible(true);
       
        
        
        
        
    }    
    }

 