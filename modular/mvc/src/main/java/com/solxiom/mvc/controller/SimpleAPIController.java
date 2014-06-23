package com.solxiom.mvc.controller;

import com.solxiom.service.interfaces.TestService;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author kavan
 */
@Controller
@RequestMapping("/api")
public class SimpleAPIController {
    
    private final Logger logger = Logger.getLogger(getClass().getName());
    private TestService testService;

    @Autowired
    public SimpleAPIController(TestService testService) {
        this.testService = testService;
    }
    
    

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody
    List<String> listColors(HttpServletResponse response) {
        logger.info("asking colors from service...");
        List<String> colors = testService.listAvalaibleColors();
        return colors;
    }


}
