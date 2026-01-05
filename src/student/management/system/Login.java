package student.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends  JFrame implements  ActionListener {
 JTextField tusername,tpassword;
 JButton login,back;
     Login() {
        JLabel username=new JLabel("Username:");
        username.setBounds(40,20,100,30);
        add(username);

        tusername=new JTextField();
        tusername.setBounds(150,20,150,30);
         add(tusername);
        tpassword=new JPasswordField();
         tpassword.setBounds(150,70,150,30);
         add(tpassword);
       
         JLabel password=new JLabel("Password:");
        password.setBounds(40,70,100,30);
        add(password);

       login=new JButton("Login");
       login.setBounds(150,120,150,30);
       login.setBackground(Color.black);
       login.setForeground(Color.white);
      login.addActionListener(this);
       add(login);
       back=new JButton("Back");
       back.setBounds(150,170,150,30);
       back.setBackground(Color.black);
       back.setForeground(Color.white);
       back.addActionListener(this);
       add(back);

       ImageIcon i11=new  ImageIcon(ClassLoader.getSystemResource("icons/image.png"));
       Image i22=i11.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
       ImageIcon i33=new  ImageIcon(i22);
       JLabel imgg=new JLabel(i33);
       imgg.setBounds(350,5,200,200);
       add(imgg);

        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public  void actionPerformed(ActionEvent e){
      if(e.getSource()==login){
        try {
          String username=tusername.getText();
          String password=tpassword.getText();

          conn conn=new conn();
          String query="Select * from login where username='"+username+"' and password='"+password+"'";
          ResultSet resultset=conn.statement.executeQuery(query);
          if (resultset.next()) {
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Success!");
            new Main_class();
          }else{
            JOptionPane.showMessageDialog(null,"Invalid username");
          }

        }catch (Exception a) {
          // TODO: handle exception
          a.printStackTrace();
        }
      }else if (e.getSource()==back) {
          System.exit(90);
      }
    }
   public static void main(String[] args) {
    new Login();
   }
}
