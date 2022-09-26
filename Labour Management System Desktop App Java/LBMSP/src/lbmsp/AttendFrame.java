/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lbmsp;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class AttendFrame {
   
    private JFrame f4;
    private JTable tbl;
    private JLabel lb1, lb2, lb3,lb4;
    private JComboBox jb;
    private JTextField t1,t2;
    private JButton btn, btn2,btn3;


    AttendFrame(){
    
    AttendFrame();
    
    }
    
    
    
    
    public void AttendFrame(){
    
        Image k = Toolkit.getDefaultToolkit().getImage("workers.png");
        f4 = new JFrame();
        f4.setBounds(500, 140, 600, 600);
        f4.setLocationRelativeTo(null);
        f4.setLayout(null);
        f4.setIconImage(k);
        
        
        lb1 = new JLabel("Weekly Attendance Report");
        lb1.setBounds(140, 20, 320, 40);
        lb1.setFont(new Font("italic",Font.BOLD,25));
        
        lb2 = new JLabel("Worker ID");
        lb2.setBounds(50, 155, 90, 30);
        lb2.setFont(new Font("italic",Font.BOLD,15));
        
        
        lb3 = new JLabel("Select From");
        lb3.setBounds(50, 115, 90, 30);
        lb3.setFont(new Font("italic",Font.BOLD,15));
        
        jb = new JComboBox();
        jb.setBounds(150, 155, 90, 30);
        jb.setFont(new Font("italic",Font.BOLD,15));
        
        try {
            Connectivity.rs=Connectivity.st.executeQuery("select id from Add_Worker");
            while(Connectivity.rs.next()){
                jb.addItem(Connectivity.rs.getInt("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AttendFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                
        t1=new JTextField();
        t1.setBounds(150, 115, 90, 30);
        t1.setEditable(false);
        
        
       btn2=new JButton("Select");
       btn2.setBounds(250,115,70,30);
       btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
            t1.setText(new Calendar(f4).setPickedDate());
            }
        });
       
       
       lb4=new JLabel("To");
       lb4.setBounds(330,115,30,30);
       
       
       t2=new JTextField();
       t2.setBounds(370,115,90,30);
       t2.setEditable(false);
       
      
       btn3=new JButton("Select");
       btn3.setBounds(470,115,70,30);
       btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
            t2.setText(new Calendar(f4).setPickedDate());
            }
        });
       
        
        
    
        String[] col = {"Name", "Status","TimeIn", "TimeOut","Date", "Day", "Shift", "Building"};
        String[][] row = {{}};
        
        DefaultTableModel model = new DefaultTableModel(row, col);
        
        tbl = new JTable(model);
        JScrollPane pane = new JScrollPane(tbl);
        pane.setBounds(25, 205, 550, 400);
        
        btn = new JButton("Show Report");
        btn.setBounds(250, 155, 120, 35);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
            
                Object from=t1.getText();
                Object to=t2.getText();
                
                Object id=jb.getSelectedItem();
        
        try {
            if(t1.getText().equals("") && t2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Select Date");
            
        }
            else{
            Connectivity.rs=Connectivity.st.executeQuery("select name,statuss,time_in,time_out,datee,dayss,shifts,building from attendence where id="+id+"AND datee Between '"+from+"' And '"+to+"'" );
        
        
        model.getDataVector().removeAllElements();
        
        while(Connectivity.rs.next()){
        String name=Connectivity.rs.getString("name");
        String status=Connectivity.rs.getString("statuss");
        String Tin=Connectivity.rs.getString("time_in");
        String Tout=Connectivity.rs.getString("time_out");
        Object date=Connectivity.rs.getDate("datee");
        String days=Connectivity.rs.getString("dayss");
        int shifts=Connectivity.rs.getInt("shifts");
        String building=Connectivity.rs.getString("building");
       
        
        model.addRow(new Object[]{name,status,Tin,Tout,date,days,shifts,building});
        
        }}
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        
        f4.setVisible(true);
        
        
        
        
        
        f4.add(lb4);
        f4.add(btn3);
        f4.add(btn2);
        f4.add(pane);
        f4.add(lb1);
        f4.add(lb2);
        f4.add(lb3);
        f4.add(jb);
        f4.add(t1);
        f4.add(t2);
        f4.add(btn);
      
    }
    
}