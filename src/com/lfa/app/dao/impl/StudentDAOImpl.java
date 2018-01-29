/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.app.dao.impl;

import com.lfa.app.dao.StudentDAO;
import com.lfa.app.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class StudentDAOImpl implements StudentDAO {
    private List<Student> students=new ArrayList<>();
    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public boolean insert(Student student) {
        return students.add(student);
    }
    
}
