/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;


/**
 *
 * @author muham
 */
public class StockItem
{
    
   private int stockID;
   private String stockName;
   private String category;
   private int stockPrice;
   private int quantity;

    public StockItem(int stockID, String stockName,String category,int stockPrice)
    {
        this.stockID = stockID;
        this.stockName = stockName;
        this.category = category;
        this.stockPrice = stockPrice;
    }

    public StockItem(String stockName,String category,int stockPrice)
    {
        this.stockName = stockName;
        this.category = category;
        this.stockPrice = stockPrice;
    }
    
    public StockItem(int stockID,int quantity)
    {
        this.stockID = stockID;
        this.quantity = quantity;
    }
    
    public StockItem(int quantity)
    {
        this.quantity = quantity;
    }
    public StockItem(String category)
    {
        this.category = category;
    }
    
    public String getCategory()
    {
        return category;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    

    public void setCategory(String category)
    {
        this.category = category;
    }

    
    public int getStockID()
    {
        return stockID;
    }

    public void setStockID(int stockID)
    {
        this.stockID = stockID;
    }

    public String getStockName()
    {
        return stockName;
    }

    public void setStockName(String stockName)
    {
        this.stockName = stockName;
    }


    public int getStockPrice()
    {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice)
    {
        this.stockPrice = stockPrice;
    }

    @Override
    public String toString()
    {
        return stockID + " " + stockName + " " + category + " " + stockPrice;
    }
}
