/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonEx1;

import java.util.HashMap;

/**
 *
 * @author AL_Qema
 */
public class CountryCodeDictionary {
    
    private HashMap<String, String> countryCodes; // Data Strature <Key , Value>

    private static CountryCodeDictionary instance = null;
    public static CountryCodeDictionary getInsatance(){
        if(instance == null){
            return new CountryCodeDictionary();
        }
        return null;
    }
    private CountryCodeDictionary() {
        countryCodes = new HashMap<String, String>();
        countryCodes.put("Palestine", "00970");
        countryCodes.put("USA", "001");
        countryCodes.put("Canada", "002");
        countryCodes.put("UK", "004");
    }

    public String getCountryCode(String countryName){
        if(countryCodes.containsKey(countryName)){
            return countryCodes.get(countryName);
        }
        return null;
    }
    
    
}
