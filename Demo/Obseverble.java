/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

import Demo.obs.Observer;
import Demo.obs.Observer;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Obseverble {
      private  ArrayList<Observer> list=new ArrayList<>();

    public Obseverble() {
        this.list = new ArrayList<>();
    }
      
        
        public void addObserver(Observer ob){
            list.add(ob);
        
        }
       
        
        public void removeObserver(Observer ob){
            list.remove(ob);
        
        }
        public void sendAll(int value){
            for(int i = 0;i<list.size();i++){
                list.get(i).updateValue(value);
            
            }
        }
       public void isSelect(boolean selected){
           /*for (int i = 0; i < list.size(); i++) {
                list.get(i).AreaCleared(selected);
                
            }*/
            for(Observer ob:list){
                ob.AreaCleared(selected);}
            }
           
      
       public void MainMessege(String messege){
           
           for (int i = 0; i < list.size(); i++) {
                list.get(i).SendMainMessege(messege);              
                
            }
       
       }
       
      public void DiliverMessege(String data){
            for (int i = 0; i < list.size(); i++) {
                list.get(i).DiliverMianMessege(data);              
                
            }
       
      
      
      }
   
       
    
    
}
