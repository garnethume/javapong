/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hume.games.pong;


/**
 * Date: 25th Dec 2016
 * @author garnet
 */
public class ScreenManager {
    
    private final java.awt.GraphicsEnvironment genv;
    private final java.awt.GraphicsDevice gdevice;
    
    public ScreenManager (){
        /*
            This code here gets the local graphics environment and allow it to be referenced
            by the genv object.
        */
        genv = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        gdevice = genv.getDefaultScreenDevice();
    }
    
    public void viewDeviceInfo(){
        System.out.println(gdevice.getAvailableAcceleratedMemory());
        System.out.println(gdevice.getDisplayMode());
        System.out.println(gdevice.getType());
        System.out.println("Graphics Environment = "+genv);
        System.out.println(" Default Screen Device = "+genv.getDefaultScreenDevice());
    }
    
}
