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
public class StockManager
{
    private int size = 0;
    StockItem[] sArr = new StockItem[200]; 

    public StockManager() throws ClassNotFoundException, SQLException
    {
        DB db = new DB();
        String query = "SELECT * from tblstock;";
        ResultSet rs = db.query(query);
        
        while(rs.next())
        {
            int stockID = rs.getInt(1);
            String stockName = rs.getString(2);
            String category = rs.getString(3);
            int stockPrice = rs.getInt(4);
            sArr[size] =  new StockItem(stockID,stockName,category,stockPrice);
            size++;
        }
    }
    
    public String[] getStockNames()
        {
        String[] names = new String[size];
        
        for(int i = 0; i < size; i ++)
        {
            names[i] = sArr[i].getStockName();
        }
        
        return names;
    }
    public String [] getCategoryItems()
        {
            String [] categoryItems = new String[size];

            for(int i =0;i < size; i++)
            {
                categoryItems[i] = sArr[i].getCategory();
            }
            return categoryItems;
        }
    
    public String toString()
    {
        String output = "";
        for(int i =0;i<size;i++)
        {
            output += sArr[i].toString() + "\n";
        }
        return output;
    }
    public Object[][] getStockForTable()
    {
        Object[][] out = new Object[size][4];
        for(int row = 0; row < size; row++)
        {
            out[row][0] = sArr[row].getStockID();
            out[row][1] = sArr[row].getStockName();
            out[row][2] = sArr[row].getCategory();
            out[row][3] = sArr[row].getStockPrice();    
        }
        return out;
    }
    
    
    public void addToStockDB(String name,String category,int price) throws SQLException, ClassNotFoundException
    {
        DB d = new DB();
        String query = "INSERT INTO pat.tblstock (`stockName`,`category`,`stockPrice`) \n" +
        "VALUES ('" + name + "' , " + " '" + category +"' ," + price + ");";
        System.out.println(query);
        d.update(query);
        sArr[size] = new StockItem(name,category,price);
        size++;
    }
    
    public void deleteFromDB(int stockID) throws ClassNotFoundException, SQLException
    {
        DB d = new DB();
        String query = "DELETE FROM pat.tblstock WHERE `stockID` = " + stockID + ";";
        d.update(query);
    }
    
}
