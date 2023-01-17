package com.example.toy2023.mapper;

import com.example.toy2023.vo.ToyVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.ArrayList;
import java.util.HashMap;
@Mapper
public interface ToyMapper {
    ArrayList<ToyVO> selectAll();
}
