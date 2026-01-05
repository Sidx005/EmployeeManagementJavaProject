package student.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;;

public class Main_class extends JFrame   {
  Main_class(){
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
    Image i2=i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,1120,630);
    add(image);
    

    JLabel heading=new JLabel("Employee Management System");
    heading.setBounds(340,155,400,40);
    heading.setFont(new Font("Raleway",Font.BOLD,25));
    image.add(heading);

    JButton add=new JButton("Add Employee");
    add.setBounds(335,270,150,40);
    add.setForeground(Color.WHITE);
    add.setBackground(Color.BLACK);
    add.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        new AddEmployee();
        // addEmployee.setVisible(true);
      }
    });
    image.add(add);

      JButton view=new JButton("View Employee");
    view.setBounds(565,270,150,40);
    view.setForeground(Color.WHITE);
    view.setBackground(Color.BLACK);
    view.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
       new View_Employee();
      }
    });
    image.add(view);

      JButton rem=new JButton("Remove Employee");
    rem.setBounds(440,370,150,40);
    rem.setForeground(Color.WHITE);
    rem.setBackground(Color.BLACK);
    rem.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        new DeleteEmployee();
        // remove_Employee.setVisible(true);
      }
    });
    image.add(rem);

    
    setSize(1120,630);
    setLayout(null);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Main_class();
  }
}
