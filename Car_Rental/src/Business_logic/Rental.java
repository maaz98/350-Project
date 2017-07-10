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
    private Status status;

    public Rental(Status status) {
        this.status = status;
    }
    
    public Calendar getRentDate() {
        return this.rentDate;
    }

    public Calendar getReturnDate() {
        return this.returnDate;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    public void Rent(Calendar date) {
        this.rentDate = date;
        this.status = Status.rented;
    }
    
    public void Return(Calendar date) {
        this.returnDate = date;
        this.status = Status.returned;
    }
}
