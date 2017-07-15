/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_logic;

/**
 *
 * @author Shazam
 */
public class Car {
    private String ID;
    private CarSpec spec;
    
    public Car(String ID, CarSpec spec){
        this.ID = ID;
        this.spec = spec;
    }
}
