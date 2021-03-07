import java.awt.*;
import java.awt.event.WindowAdapet;
import java.awt.event.WindowEvent;

public class House extends Frame {

     House(){
     this.addWindowListener(new WindowEvent() {
           
          public void windowClosing(Window e) {
                 system.exit(0);
            }
         });
    
  }
  public void paint(Graphics g)
  {
      g.setColor(Color.cyan);
      g.drawRect(200,300,750,400);
      g.setColor(Color.yellow);
      g.drawLine(250,150,300,200);
      g.drawLine(350,180,1030,120);
      g.drawLine(1050,180,1290,200);
      g.drawLine(400,200,280,600);
      g.drawLine(470,230,470,660);
      g.drawRect(500,520,60,240);
      
      
      }
    
    public static void main(string[]args) {
           
           House h=new House();
           h.setSize(1930,1900);
           h.setVisible(true);
           h.addWindowListener(new NewClass());
           
           } 
 }           
                 
         
     