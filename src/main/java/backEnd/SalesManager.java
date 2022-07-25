/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author muham
 */
public class SalesManager
{
    private int size = 0;
    Sales [] Arr = new Sales[200];
    
    public SalesManager() throws SQLException, ClassNotFoundException
    {
        DB d = new DB();
        String query = "Select * from tblsales";
        ResultSet rs = d.query(query);
        
        while(rs.next())
        {
            int salesID = rs.getInt(1);
            String stockName = rs.getString(2);
            int stockAmount = rs.getInt(3);
            int stockPrice = rs.getInt(4);
            String customerName = rs.getString(5);
            Arr[size] = new Sales(salesID, stockName, stockAmount, stockPrice, customerName);
            size++;
        }
    }
    public Object[][] fillSalesTbl()
    {
        Object[][] out = new Object[size][5];
        for(int row = 0; row < size; row++)
        {
            out[row][0] = Arr[row].getSalesID();
            out[row][1] = Arr[row].getStockName();
            out[row][2] = Arr[row].getStockAmount();
            out[row][3] = Arr[row].getStockPrice();
            out[row][4] = Arr[row].getCustomerName();
                
        }
        return out;
    }
    public void addToSalesDB(String stockName,int stockAmount,int stockPrice,String customerName) throws SQLException, ClassNotFoundException
    {
        DB d = new DB();
        String query = "INSERT INTO pat.tblsales (`stockName`,`stockAmount`,`stockPrice`,`customerName`) \n" +
        "VALUES ('" + stockName + "' , " + " " + stockAmount +" ," + stockPrice + " , " + " '" + customerName + "')";
        System.out.println(query);
        d.update(query);
        Arr[size] = new Sales(stockName, stockAmount, stockPrice, customerName);
        size++;
    }
    public String toString()
    {
        String output = "";
        for(int i =0;i<size;i++)
        {
            output += Arr[i].toString() + "\n";
        }
        return output;  
    }
}
