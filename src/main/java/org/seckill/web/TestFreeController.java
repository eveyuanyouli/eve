package org.seckill.web;

import org.seckill.service.TestFreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class TestFreeController {

    @Autowired
    private TestFreeService testFreeService;

    @RequestMapping(value = "/query")
    public String query(Model model, HttpServletRequest request) {
        model.addAttribute("name", "The Flash");
        return "query";
    }

}
