package com.example.toy2023.controller;

import com.example.toy2023.service.ToyService;
import com.example.toy2023.vo.ToyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ToyController {
    @Autowired
    private ToyService toyService;

    @RequestMapping(value="/")
    public void main() {
        ArrayList<ToyVO> voList = toyService.getUserList();
        for(ToyVO vo : voList) {
            System.out.println(vo.getId());
            System.out.println(vo.getName());
        }
    }
}
