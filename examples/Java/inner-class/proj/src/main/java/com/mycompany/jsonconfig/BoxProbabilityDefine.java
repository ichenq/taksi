// This file is auto-generated by taxi v1.2.0, DO NOT EDIT!

package com.mycompany.jsonconfig;

import java.util.*;

// , 随机宝箱.xlsx
public class BoxProbabilityDefine
{
    public static class ProbabilityGoodsDefine 
    {
        public String GoodsID = "";       // 物品1id
        public int Num = 0;            // 物品1数量
        public int Probability = 0;    // 物品1概率
    }

    public String                             ID = "";             // ID
    public int                                Total = 0;           // 奖励总数
    public int                                Time = 0;            // 冷却时间
    public boolean                            Repeat = false;      // 是否可重复
    public ArrayList<ProbabilityGoodsDefine> ProbabilityGoods = new ArrayList<ProbabilityGoodsDefine>(); 
}

