package game;
import java.awt.event.*;

import javax.swing.*;  
public class game{  
    private static JFrame frame;
    private static JButton button;
    private static JLabel label;
    private static int counts = 0;
public static void main(String[] args) {  
frame=new JFrame("simple GUI");//creating instance of JFrame  
          
button=new JButton("click");//creating instance of JButton  
button.setBounds(130,100,100, 40);//x axis, y axis, width, height
label = new JLabel("number of counts:" + counts); // this creates a label with telling us counts
label.setBounds(130, 150, 800, 40);
          
frame.add(button);//adding button in JFrame 
frame.add(label); 
          
frame.setSize(400,500);//400 width and 500 height  
frame.setLayout(null);//using no layout managers  
frame.setVisible(true);//making the frame visible  
button.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        counts++;
        label.setText("number of counts:" + counts);
    }
});
}  
}  
