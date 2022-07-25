/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author muham
 */
public class HistoricStockManager
{
    private int size = 0;
    StockItem[] sArr = new StockItem[200]; 

    public HistoricStockManager() throws ClassNotFoundException, SQLException
    {
        DB db = new DB();
        String query = "SELECT * from tblhistoricstock";
        ResultSet rs = db.query(query);
        
        while(rs.next())
        {
            int stockID = rs.getInt(1);
            int quantity = rs.getInt(2);
            sArr[size] =  new StockItem(stockID,quantity);
            size++;
        }
    }
    
    public Object[][] getStockForHistoricStokcTable()
    {
        Object[][] out = new Object[size][2];    
        for(int row = 0; row < size; row++)
        {
            out[row][0] = sArr[row].getStockID();
            out[row][1] = sArr[row].getQuantity();
        }
        return out;
    }
    public void addToHistoricStock(int quantity) throws ClassNotFoundException, SQLException
    {
        DB d = new DB();
        String query = "INSERT INTO pat.tblhistoricStock (`quantity`) \n" +
        "VALUES (" + quantity + ");";
        System.out.println(query);
        d.update(query);
        sArr[size] = new StockItem(quantity);
        size++;
        
    }
    
    public void deleteFromHistoricStock(int stockID) throws ClassNotFoundException, SQLException
    {
        DB d = new DB();    
        String query = "DELETE FROM pat.tblhistoricstock WHERE `stockID` = " + stockID + ";";
        d.update(query);
    }
    
}
