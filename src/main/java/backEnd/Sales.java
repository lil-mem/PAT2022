/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author muham
 */
public class Sales
{
    private int salesID;
    private String stockName;
    private int stockAmount;
    private int stockPrice;
    private String customerName;

    public Sales(int salesID, String stockName, int stockAmount, int stockPrice, String customerName)
    {
        this.salesID = salesID;
        this.stockName = stockName;
        this.stockAmount = stockAmount;
        this.stockPrice = stockPrice;
        this.customerName = customerName;
    }

    public Sales(String stockName, int stockAmount, int stockPrice, String customerName)
    {
        this.stockName = stockName;
        this.stockAmount = stockAmount;
        this.stockPrice = stockPrice;
        this.customerName = customerName;
    }
    
    public int getSalesID()
    {
        return salesID;
    }

    public void setSalesID(int salesID)
    {
        this.salesID = salesID;
    }

    public String getStockName()
    {
        return stockName;
    }

    public void setStockName(String stockName)
    {
        this.stockName = stockName;
    }

    public int getStockAmount()
    {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount)
    {
        this.stockAmount = stockAmount;
    }

    public int getStockPrice()
    {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice)
    {
        this.stockPrice = stockPrice;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    
}
