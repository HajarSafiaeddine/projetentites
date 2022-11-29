/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dell
 */
public class TestEntities {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my_persistence_unit");
        
    }
    
}
