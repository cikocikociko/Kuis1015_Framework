/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciko.kuis1015.service;

import com.ciko.kuis1015.controller.Nilai_1015Controller;
import com.ciko.kuis1015.entity.Nilai_1015;
import com.ciko.kuis1015.repo.Nilai_1015Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa 19
 */
@Service("nilai_1015Service")
@Transactional
public class Nilai_1015Service {
    
    @Autowired
    private Nilai_1015Repo repo;

    public Nilai_1015 insert(Nilai_1015 nilai_1015) {
        return repo.save(nilai_1015);
    }
    
    public Nilai_1015 update(Nilai_1015 nilai_1015) {
        return repo.save(nilai_1015);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Nilai_1015 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Nilai_1015> getAll(){
        return repo.findAllNilai_1015();
    }
}
