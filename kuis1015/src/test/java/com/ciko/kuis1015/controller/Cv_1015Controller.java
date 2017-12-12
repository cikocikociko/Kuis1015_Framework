/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciko.kuis1015.controller;

import com.ciko.kuis1015.entity.Cv_1015;
import com.ciko.kuis1015.service.Cv_1015Service;
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
@RequestMapping("/cv_1015")
public class Cv_1015Controller {
    @Autowired
    private Cv_1015Service cv_1015Service;

    @RequestMapping(method = RequestMethod.POST)
    public Cv_1015Controller insert(@RequestBody Cv_1015Controller cv_1015Service) {
        return cv_1015Service.insert(cv_1015Service);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Cv_1015Controller update(@RequestBody Cv_1015Controller cv_1015Service) {
        return cv_1015Service.update(cv_1015Service);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1015Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Cv_1015 getById(@PathVariable("id") Long id){
        return cv_1015Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Cv_1015> getAll(){
        return cv_1015Service.getAll();
    }
}
