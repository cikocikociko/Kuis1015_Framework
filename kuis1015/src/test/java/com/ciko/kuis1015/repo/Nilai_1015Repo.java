/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciko.kuis1015.repo;

import com.ciko.kuis1015.entity.Nilai_1015;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mahasiswa 19
 */
public interface Nilai_1015Repo extends CrudRepository<Nilai_1015, Long> {
     @Query("select c from Nilai_1015 c")
    public List<Nilai_1015> findAllNilai_1015();
    
}
