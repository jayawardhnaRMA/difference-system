/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package action;

import UI.Maincontroller;

/**
 *
 * @author bimya
 */
public interface Observable {

 public void setMain(Maincontroller mainContoller);
 public void msg(String msg);
    
    public void position(int value);
    
    public void clear(boolean res);

    public void msg2(String msg);
}
