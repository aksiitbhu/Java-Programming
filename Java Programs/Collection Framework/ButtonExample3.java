import javax.swing.*;      
public class ButtonExample3{    
ButtonExample3(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("b1.png"));    
b.setBounds(100,100,100, 50);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new ButtonExample3();    
}    
}    
