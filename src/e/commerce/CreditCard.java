/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

/**
 *
 * @author Lenovo
 */
 class CreditCard {

   
    
    private String creditCardNumber;
    private User owner;
    private String securityCode;
    private String expirationDate;
            
    
    public CreditCard(String creditCardNumber, String securityCode, String expirationDate){
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        writeAttributes();
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public void writeAttributes(){
        System.out.println("Credit Card number  : " + getCreditCardNumber());
        System.out.println("Expiration Date : " + getExpirationDate());
        System.out.println("Security Code : " + getSecurityCode());
    }
    
    
}
