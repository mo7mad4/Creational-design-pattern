/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author AL_Qema
 */
public class Main {
    public static void main(String[] args) {
         Student.Builder builder = new Student.Builder();
         builder.setFirstName("Mohammed");
         builder.setMiddleName("Zeyad");
         builder.setLastName("Raida");
         builder.setId("120191424");
         
         Student s = builder.build();
    }
   
    
    
    
}
