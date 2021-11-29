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
public class Order {

   
    private User orderingObject;
    private Product orderedObject;
    private CreditCard objects;
    
    public Order(User orderingObject, Product orderedObject, CreditCard objects){
        this.objects = objects;
        this.orderedObject = orderedObject;
        this.orderingObject = orderingObject;
    }

    public User getOrderingObject() {
        return orderingObject;
    }

    public void setOrderingObject(User orderingObject) {
        this.orderingObject = orderingObject;
    }

    public Product getOrderedObject() {
        return orderedObject;
    }

    public void setOrderedObject(Product orderedObject) {
        this.orderedObject = orderedObject;
    }

    public CreditCard getObjects() {
        return objects;
    }

    public void setObjects(CreditCard objects) {
        this.objects = objects;
    }
    
     public void accessInfo(){
        Product.showStock();
     }
     public void accessPurchasing(String product1){
        User.buyProduct(product1);
       
     }
}