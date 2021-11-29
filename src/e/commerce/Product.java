/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    static int stockInformation;
    private double productWeight;
    private String descriptionInformation;
   
    
    
    public Product(String productName, String productColor, String productCategory, int stockInformation, double productWeight, String descriptionInformation){
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.stockInformation = stockInformation;
        this.productWeight = productWeight;
        this.descriptionInformation = descriptionInformation;
                
    }
    public Product(){
        
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getStockInformation() {
        return stockInformation;
    }

    public void setStockInformation(int stockInformation) {
        this.stockInformation = stockInformation;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getDescriptionInformation() {
        return descriptionInformation;
    }

    public void setDescriptionInformation(String descriptionInformation) {
        this.descriptionInformation = descriptionInformation;
    }

    
    
    public static void buyProduct(){
       stockInformation--;
        }
    
     public static void showStock(){
           System.out.println("The stock number is " + stockInformation);
    }

  
}
    

