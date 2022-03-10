/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Daniel
 */

public class GameBoard {
   
    
       public void empySpotChecker(JButton Btn1,JButton Btn2)
         {
             String ShufleeNumber = Btn2.getText();
             
             if(ShufleeNumber == "")
             {
                 Btn2.setText(Btn1.getText());
                 Btn1.setText("");
             }
         }
         

}
