/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.app.dao;

import com.lfa.app.entity.Student;
import java.util.List;

/**
 *
 * @author USER
 */
public interface StudentDAO {
    List<Student> getAll();
    boolean insert(Student student);
}
