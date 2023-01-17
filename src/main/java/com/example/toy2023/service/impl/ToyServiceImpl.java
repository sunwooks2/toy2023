package com.example.toy2023.service.impl;

import com.example.toy2023.service.ToyService;
import com.example.toy2023.vo.ToyVO;

import java.util.ArrayList;
import java.util.List;

public class ToyServiceImpl implements ToyService {

    public ToyMapper toyMapper;
    @Override
    public List<ToyVO> getUserList() {
        return new ArrayList<>(toyMapper.selectAll());
    }
}
