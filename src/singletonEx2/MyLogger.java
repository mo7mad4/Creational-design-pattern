/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonEx2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AL_Qema
 */
public class MyLogger {
    private Logger logger;

    public MyLogger() {
        logger = Logger.getLogger("log_file");
        try {
            logger.addHandler(new FileHandler("log.txt"));
        } catch (IOException ex) {
            ex.printStackTrace();
        
    }
    
    
    }
    public  Logger getLogger(){
        return logger;
    }
}
