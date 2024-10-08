package com.kitri.springGoods.dao;

import java.util.List;
import com.kitri.springGoods.dto.Goods;
import com.kitri.springGoods.dto.MultiConditions;
import com.kitri.springGoods.dto.UpdateConditions;


public interface GoodsDao {
	List<Goods> findGoods();
	Goods findGoodsByNo(String no);
	int registerGoods(Goods goods);
	int updateGoods(
		UpdateConditions updateConditions);	
}
