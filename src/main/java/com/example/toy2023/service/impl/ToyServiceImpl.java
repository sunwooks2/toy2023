package com.example.toy2023.service.impl;

import com.example.toy2023.mapper.ToyMapper;
import com.example.toy2023.service.ToyService;
import com.example.toy2023.vo.ToyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class ToyServiceImpl implements ToyService {

    @Autowired
    public ToyMapper toyMapper;
    @Override
    public ArrayList<ToyVO> getUserList() {
        return new ArrayList<ToyVO>(toyMapper.selectAll());
    }
}
