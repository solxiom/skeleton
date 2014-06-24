/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solxiom.modular.service;

import com.solxiom.modular.service.interfaces.TestService;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author kavan
 */
@Service
public class SimpleTestService implements TestService{

    @Override
    public List<String> listAvalaibleColors() {
        List<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("white");
        colors.add("green");
        colors.add("yellow");
        return colors;
    }
    
}
