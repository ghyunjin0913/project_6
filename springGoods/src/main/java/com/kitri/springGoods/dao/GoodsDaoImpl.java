package com.kitri.springGoods.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kitri.springGoods.dto.Goods;
import com.kitri.springGoods.dto.MultiConditions;
import com.kitri.springGoods.dto.UpdateConditions;

@Component
public class GoodsDaoImpl implements GoodsDao{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	// select All
	@Override
	public List<Goods> findGoods() {
		List<Goods> memberList = 
				sqlSessionTemplate.selectList(
				"goods.findGoods");
		return memberList;
	}
	
	// select One
	@Override
	public Goods findGoodsByNo(String no) {
		Goods goods = sqlSessionTemplate.selectOne(
			"goods.findGoodsByNo", no);
		return goods;
	}
	
	// insert
	@Override
	public int registerGoods(Goods goods) {
		int cnt = sqlSessionTemplate.insert(
			"goods.registergoods", goods);
		return cnt;
	}

	// update
	@Override
	public int updateGoods(
		UpdateConditions updateConditions) {
		int cnt = sqlSessionTemplate.update(
			"goods.goodsUpdate", updateConditions);
		return cnt;
	}
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}


}
