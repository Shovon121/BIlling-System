
package billingsystem;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Parents {
    
   
     public double Freeze;
      public double Cfan;
       public double Tfan;
        public double Oven;
         public double Iron;
         
         
         
         
      public double pFreeze=23000;
      public double pCfan=2000;
       public double pTfan=1500;
        public double pOven=4000;
         public double pIron=2000;
         
         
         public double itemcost;
         
         public  double getAmount(){
             
             itemcost=Freeze+Cfan+Tfan+Oven+Iron;
             
             return itemcost;
         }
         //===========Tax Calculator===========
         
         public double cFindTax(double cAmount){
             
             double FindTax=cAmount-(cAmount*Iron);
             
             return FindTax;
         }
  
             //===========Exit==========
         
         private JFrame frame;
         public void iExitSystem(){
             
             frame = new JFrame("Exit");
             if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit ?","Data Receiving System",
                     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION ){
                 
                 System.exit(0);
             }
         }
             //==============Numbers only==============
             
             public void NumbersOnly(java.awt.event.KeyEvent evt){
                 
                 char iNumber=evt.getKeyChar();
                 if(!(Character.isDigit(iNumber))
                         ||(iNumber==KeyEvent.VK_DELETE)){
                     
                     evt.consume();
                 }
                 
             }
             
             
             
         }
         
         

