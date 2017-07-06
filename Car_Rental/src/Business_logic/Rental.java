/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_logic;

import java.util.Calendar;

/**
 *
 * @author Shazam
 */
public class Rental {
    private Calendar rentDate;
    private Calendar returnDate;

    public Rental(Calendar rentDate, Calendar returnDate) {
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }
    
}
