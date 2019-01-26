package org.seckill.web;

import org.seckill.entity.TestFree;
import org.seckill.service.TestFreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class TestFreeController {

    @Autowired
    private TestFreeService testFreeService;

    @RequestMapping(value = "/query")
    public String query(Model model, HttpServletRequest request) {
        List<TestFree> testFrees = testFreeService.queryAll();

        model.addAttribute("name", testFrees.get(0).getName());
        model.addAttribute("list", testFrees);
        return "query";

    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public String getQueryValue(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        String name = request.getParameter("name");
        if (null != name) {
            map.put("success", name);
            return "1";
        } else {
            return "0";
        }
    }

}
