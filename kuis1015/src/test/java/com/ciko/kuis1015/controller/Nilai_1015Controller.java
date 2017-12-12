/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciko.kuis1015.controller;

import com.ciko.kuis1015.entity.Nilai_1015;
import com.ciko.kuis1015.service.Nilai_1015Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahasiswa 19
 */
@RestController
@RequestMapping("/nilai_1015")
public class Nilai_1015Controller {
    @Autowired
    private Nilai_1015Service nilai_1015Service;

    /**
     *
     * @param nilai_1015
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Nilai_1015 insert(@RequestBody Nilai_1015 nilai_1015) {
        return nilai_1015Service.insert(nilai_1015);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Nilai_1015 update(@RequestBody Nilai_1015 nilai_1015) {
        return nilai_1015Service.update(nilai_1015);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return nilai_1015Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Nilai_1015 getById(@PathVariable("id") Long id){
        return nilai_1015Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Nilai_1015> getAll(){
        return nilai_1015Service.getAll();
    }
}
