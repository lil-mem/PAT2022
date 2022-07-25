/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author muham
 */
public class Customer
{
    private int customerID;
    private String customerName;
    private int amountOwed;

    public Customer(int customerID, String customerName, int amountOwed)
    {
        this.customerID = customerID;
        this.customerName = customerName;
        this.amountOwed = amountOwed;
    }

    public Customer(String customerName, int amountOwed)
    {
        this.customerName = customerName;
        this.amountOwed = amountOwed;
    }
    

    public int getCustomerID()
    {
        return customerID;
    }

    public void setCustomerID(int customerID)
    {
        this.customerID = customerID;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public int getAmountOwed()
    {
        return amountOwed;
    }

    public void setAmountOwed(int amountOwed)
    {
        this.amountOwed = amountOwed;
    }
    
    public String toString()
    {
        return customerID + " " + customerName + " " + amountOwed;
    }
    
}
