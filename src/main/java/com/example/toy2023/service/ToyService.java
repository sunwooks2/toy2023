package com.example.toy2023.service;

import com.example.toy2023.vo.ToyVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public interface ToyService {
    public ArrayList<ToyVO> getUserList();
}
