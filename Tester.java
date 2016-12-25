/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hume.games.pong;

/**
 *
 * @author garnet
 */
public class Tester {
    
    ScreenManager smanager = new ScreenManager();
    
    public static void main(String[] args){
        Tester app = new Tester();
        app.displayData();
    }
    
    public void displayData(){
        smanager.viewDeviceInfo();
        
    }
}
