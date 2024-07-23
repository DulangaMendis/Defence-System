/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo.obs;

/**
 *
 * @author ASUS
 */
public interface Observer {
    public void updateValue(int value);
    public void AreaCleared(boolean selected);
    public void SendMainMessege(String messege);
     public void DiliverMianMessege(String data);
    
}


