/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonEx2;

/**
 *
 * @author AL_Qema
 */
public class Main {
    public static void main(String[] args) {
        
        MyLogger l = new MyLogger();
        l.getLogger().info("Hello World");
        l.getLogger().severe("Fatal error...");
        
    }
}
