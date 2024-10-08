package com.kitri.springGoods.dto;

public class MultiConditions {
	private String goodscd;
	private String goodsnm;

	public MultiConditions() {}
	public MultiConditions(String goodscd, String goodsnm) {
		this.goodscd = goodscd;
		this.goodsnm = goodsnm;
	}
	
	public String getGoodscd() { return goodscd; }
	public void setGoodscd(String goodscd) {
		this.goodscd = goodscd;
	}
	public String getGoodsnm() { return goodsnm; }
	public void setGoodsnm(String goodsnm) {
		this.goodsnm = goodsnm;
	}

}
