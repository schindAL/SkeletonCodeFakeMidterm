/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerskeletoncode;

/**
 *
 * @author aschindler1
 */
public class FakeDatabase implements DataStore {
    private Customer[] customers ={
        new Customer("Smith", "John", "C100"),
        new Customer("Doe", "Bob", "C101"),
        new Customer("Jones", "Sally", "C102")
    };
    
    @Override
    public final Customer findCustomerById(String custID){
        Customer customer = null;
        for(Customer c: customers){
            if(custID.equals(c.getCustomerNo())){
                customer = c;
                break;
            }    
        }
        
        return customer;
    }
}