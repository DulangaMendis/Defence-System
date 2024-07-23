/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Demo;


import Demo.obs.Submarine;
import Demo.obs.Tank;
import Demo.obs.Observer;
import Demo.obs.Helicopter;
import Demo.obs.Helicopter;
import Demo.obs.MainController;
import Demo.obs.MainController;
import Demo.obs.Observer;
import Demo.obs.Submarine;
import Demo.obs.Tank;
import javax.security.auth.Subject;





/**
 *
 * @author ASUS
 */
public class StartMain {
    public static void main(String[] args) {
         MainController maincontroller = new MainController();
         
         Helicopter helicopter = new Helicopter();
         Submarine submarine = new Submarine();
         Tank tank = new Tank();
         
         
           
         Obseverble obs = new Obseverble();
         obs.addObserver(tank);
         obs.addObserver(helicopter);
         obs.addObserver(submarine);
         obs.addObserver(maincontroller);
         
         
      
         
         maincontroller.setObseverble(obs);
         helicopter.setObserver(obs);
         tank.setObserver(obs);
         submarine.setObserver(obs);
         
    }
    
       
   
}
