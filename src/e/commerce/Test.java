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
public class Test {
    public static void main(String[] args){
        User user1 = new User("zeynepocaal", "Zeynep", "Öcal", "zeynepocaal@outlook.com", "123456");
        System.out.println(user1);
        user1.login("zeynepocaal@outlook.com", "123456");
       user1.addFavorite("Kalem");
        user1.addFavorite("Çanta");
        user1.addFavorite("Ayakkabı");
        user1.dropFavorite("Çanta");
        user1.showFavorite();
        
        
        String[] favoriteproducts = user1.getFavouriteproducts();
        for(int i = 0; i < user1.getNumberofFavorite();i++){
            System.out.println(favoriteproducts[i] + " ");
            
        }
        System.out.println();
        
        CreditCard c1 = new CreditCard("5956164656956481","058","21.12");
        user1.orderProduct("Kalem");
        user1.buyProduct("Kalem");
        user1.buyProduct("Kalem");
        
        
       
        
        
       
        
        
       
    }

   
    }

