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
public class CustomerManager
{
    private int size = 0;
    Customer[] cArr = new Customer[200];
    
    public CustomerManager() throws ClassNotFoundException, SQLException
    {
        DB db = new DB();
        String query = "SELECT * from tblcustomer";
        ResultSet rs = db.query(query);
        
        while(rs.next())
        {
            int customerID = rs.getInt(1);
            String customerName = rs.getString(2);
            int amountOwed = rs.getInt(3);
            cArr[size] = new Customer(customerID,customerName,amountOwed);
            size++;
        }
        
    }
        public String[] getCustomerName()
        {
            String [] cus = new String[size];
            
            for(int i = 0 ; i < size; i++)
            {
               cus[i] = cArr[i].getCustomerName();
            }
            return cus;
        }
        
        public String toString()
        {
            String output = "";
            for(int i =0;i<size;i++)
            {
                output += cArr[i].toString() + "\n";
            }
        return output;
        }
        
            public Object[][] getCustomerForTable()
            {
                Object[][] out = new Object[size][3];
                for(int row = 0; row < size; row++)
                {
                    out[row][0] = cArr[row].getCustomerID();
                    out[row][1] = cArr[row].getCustomerName();
                    out[row][2] = cArr[row].getAmountOwed();
                }
                return out;
            }
            public void addNewCustomer(String customerName,int amountOwed) throws SQLException, ClassNotFoundException
                {
                    DB d = new DB();
                    String query = "INSERT INTO tblcustomer (`customerName`, `amountOwed`) \n" +
            "	VALUES ('" + customerName + "' , " + amountOwed + ");";
                    System.out.println(query);
                    d.update(query);
                    cArr[size] = new Customer(customerName,amountOwed);
                    size++;
                }
            public void deleteFromCustomerDB(int customerID) throws ClassNotFoundException, SQLException
                {
                    DB d = new DB();
                    String query = "DELETE FROM tblcustomer WHERE `customerID` = " + customerID + ";";
                    d.update(query);
                }
}
