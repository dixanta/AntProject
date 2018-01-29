/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.app;

import com.lfa.app.dao.StudentDAO;
import com.lfa.app.dao.impl.StudentDAOImpl;
import com.lfa.app.entity.Student;

/**
 *
 * @author USER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDAO studentDAO=new StudentDAOImpl();
        studentDAO.insert(new Student(1, "Unchho"));
        studentDAO.insert(new Student(2, "Surya"));
        studentDAO.insert(new Student(3, "Sanjay"));
        
        for(Student s : studentDAO.getAll()){
            System.out.println(s.getName());
        }
        
    }
    
}
