/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciko.kuis1015.service;

import com.ciko.kuis1015.entity.Cv_1015;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ciko.kuis1015.repo.Cv_1015Repo;

/**
 *
 * @author Mahasiswa 19
 */
@Service("cv_1015Service")
@Transactional
public class Cv_1015Service {
    
    @Autowired
    private Cv_1015Repo repo;

    public Cv_1015 insert(Cv_1015 cv_1015) {
        return repo.save(cv_1015);
    }
    
    public Cv_1015 update(Cv_1015 cv_1015) {
        return repo.save(cv_1015);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Cv_1015 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Cv_1015> getAll(){
        return repo.findAllCv_1015();
    }
    
}
