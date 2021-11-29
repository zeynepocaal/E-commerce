/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import static e.commerce.Product.stockInformation;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
 class User {

    
    /**
     * @param args the command line arguments
     */
    
    private String username;
    private String name;
    private String surname;
    private Date dateofbirth;
    private String password;
    private String email;
    private String homeadress;
    private String workadress;
    private String productsordered;
    private String[] favoriteproducts = new String[10];
    private int numberofFavorite;
    static ArrayList<CreditCard> accounts;
    private boolean isOnline;
    private boolean isFavorite;
     static ArrayList<String> product;
     
            
    
    public User(String username, String name, String surname, String email, String password){
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.dateofbirth = new Date();
        this.email = email;
        this.homeadress = homeadress;
        this.workadress = workadress;
        this.productsordered = productsordered;
        this.favoriteproducts = favoriteproducts;
        this.numberofFavorite = numberofFavorite;
        this.accounts = new ArrayList<CreditCard>();
        this.product = new ArrayList<String>();
        writeAttributes();
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeadress() {
        return homeadress;
    }

    public void setHomeadress(String homeadress) {
        this.homeadress = homeadress;
    }

    public String getWorkadress() {
        return workadress;
    }

    public void setWorkadress(String workadress) {
        this.workadress = workadress;
    }

    public String getProductsordered() {
        return productsordered;
    }

    public void setProductsordered(String productsordered) {
        this.productsordered = productsordered;
    }

    public String[] getFavouriteproducts() {
        return favoriteproducts;
    }

    public void setFavouriteproducts(String[] favouriteproducts) {
        this.favoriteproducts = favouriteproducts;
    }

    public int getNumberofFavorite() {
        return numberofFavorite;
    }

    public void setNumberofFavorite(int numberofFavorite) {
        this.numberofFavorite = numberofFavorite;
    }

    public static ArrayList<CreditCard> getAccounts() {
        return accounts;
    }

    public static void setAccounts(ArrayList<CreditCard> accounts) {
        User.accounts = accounts;
    }

    public static ArrayList<String> getProduct() {
        return product;
    }

    public static void setProduct(ArrayList<String> product) {
        User.product = product;
    }

    

   
    public void writeAttributes(){
        System.out.println("Username : " + this.username);
        System.out.println("Name : " + this.name);
        System.out.println("Surname : " + this.surname);
        System.out.println("Email : " + this.email);
        System.out.println("Password : " + this.password);
    }
    
    public void showFavorite(){
        if(numberofFavorite > 0){
            System.out.println("Your favorite products is listed below");
            
           
        }
        
        else{
            System.out.println("You dont have any favorite product");
        }
    }
    public void addFavorite(String product){
        favoriteproducts[numberofFavorite] = product;
        numberofFavorite++;
    }
    public void dropFavorite(String product){
        int IndexOfProductToDrop = -1;

    for (int i = 0; i < numberofFavorite; i++) {
        if (favoriteproducts[i].equalsIgnoreCase(product)) {
            IndexOfProductToDrop = i;
            if (IndexOfProductToDrop != -1) {
                for (i = IndexOfProductToDrop; i < numberofFavorite; i++)
                    favoriteproducts[i] = favoriteproducts[i+1];
            } // end if found
            // decrement number of students by 1
            numberofFavorite--;
        }
    }
    }
    public static void orderProduct(String product){
        System.out.println("The " + product + " will be ordering");
       
        
    }
   public static void buyProduct(String product1){
        System.out.println("The product sold by the card ");
       for(int i = 0; i < product.size();i++){
        if(product1.equalsIgnoreCase(product.toString())){
            stockInformation -= i;
        }
        
   }
        stockInformation--;
        Product.showStock();
   }
   
   
    public boolean login(String email, String password){
        if(isOnline){
            System.out.println("You already login");
        }
        else{
            if(email.equals(this.email) && password.equals(this.password)){
                isOnline = true;
                System.out.println("Welcome the app " + this.username);
            }
        
        else{
                System.out.println("Wrong email or password");
                }
        } 
        return this.isOnline;
    }
    
    
}
