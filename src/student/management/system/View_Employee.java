package student.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class View_Employee extends JFrame implements  ActionListener {
   Choice choicempid;
   JTable table;
    JButton searchBtn, print, update, back;
   View_Employee(){
   
   getContentPane().setBackground(new  Color(255,131,122));
  JLabel  search=new  JLabel("Search by employee id");
   search.setBounds(20,20,150,20);
   add(search);
   choicempid=new Choice() ;
   choicempid.setBounds(180,20,150,20);
   add(choicempid);

   try {
      conn c=new conn();
      ResultSet resultSet=c.statement.executeQuery("select * from employee");
      while (resultSet.next()) {
         choicempid.add(resultSet.getString("empId"));
        
      }
   } catch (Exception e) {
      e.printStackTrace();
      // TODO: handle exception
   }

   table=new JTable();
   try {
      conn c=new conn();
      ResultSet resultSet=c.statement.executeQuery("select * from employee");
      table.setModel(DbUtils.resultSetToTableModel(resultSet));
   } catch (Exception e) {
      e.printStackTrace();
      // TODO: handle exception
   }
   JScrollPane jp=new JScrollPane(table);
   jp.setBounds(0,100,900,600);

   add(jp);


   searchBtn=new JButton("Search");
   searchBtn.setBounds(20,70,80,20);
   searchBtn.addActionListener(this);
   add(searchBtn);
   

   print=new JButton("Print");
   print.setBounds(120,70,80,20);
   print.addActionListener(this);
   add(print);
   update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add(back);

   setSize(900,700);
    setLayout(null);
    setLocation(300,100);
    setVisible(true);
   }
   @Override
   public  void actionPerformed(ActionEvent e){
      if(e.getSource()==back){
      setVisible(false);
      new AddEmployee();
      }else if(e.getSource()==update){
        setVisible(false);
        new UpdateEmployee(choicempid.getSelectedItem());
      //   new Update_
      }else if(e.getSource()==searchBtn){
         String query="Select * from employee where empId='"+choicempid.getSelectedItem()+"'";
         try {
            conn c=new conn();
            ResultSet resultSet=c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

         } catch (Exception E) {
            E.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + E.getMessage());
            // TODO: handle exception
         }
      }else if(e.getSource()==print){
            try {
               table.print();

            } catch (Exception err) {
               err.printStackTrace();
               // TODO: handle exception
            }
      }
   }
   public static void main(String[] args) {
       new View_Employee();
   }

}
