package oopWithNLayeredApp.dataAccsess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

    public  void add(Product product){
        System.out.println(" Added to database with HPD");
    }




}
