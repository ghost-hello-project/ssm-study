package com.laolang.jx.module.system.dict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("admin/sys/dict")
@Controller
public class SysDictController {

    @GetMapping("list")
    public String listPage(Model model){
        model.addAttribute("msg","Hello World");
        return "admin/sys/dict/list";
    }


}
