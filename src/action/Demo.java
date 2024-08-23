/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package action;

import UI.Helicopter;
import UI.Submarine;
import UI.Tank;
import UI.Maincontroller;

/**
 *
 * @author bimya
 */
public class Demo {
 public static void main(String[] args) {
        
        ObservableImp observableImp=new ObservableImp();
        
       Observable tank=new Tank();
       Observable helicopter=  new Helicopter();
        Observable submarine=new Submarine();
        
        observableImp.add( tank);
       observableImp.add(helicopter);
        observableImp.add(submarine);
        
        Maincontroller mainController=new Maincontroller(true);
        
        mainController.setobservable(observableImp);
        helicopter.setMain(mainController);
        tank.setMain(mainController);
        submarine.setMain(mainController);
    }   
}
