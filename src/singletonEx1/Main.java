/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonEx1;

/**
 *
 * @author AL_Qema
 */
public class Main {
    public static void main(String[] args) {
        CountryCodeDictionary cc = CountryCodeDictionary.getInsatance();
        String countryCode = cc.getCountryCode("Palestine");
        if(countryCode != null){
            System.out.println("Make the phone call ...");
        }
        
    }
    
}
