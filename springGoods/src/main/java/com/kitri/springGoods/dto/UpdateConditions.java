package com.kitri.springGoods.dto;

public class UpdateConditions {
	private double price;
	private String status;
	private int qty;
	private String goodscd;
	private String goodsnm;

	public UpdateConditions() {}	
	public UpdateConditions(double price, String status, int qty, String goodscd, String goodsnm) {
		this.price = price;
		this.status = status;
		this.qty = qty;
		this.goodscd = goodscd;
		this.goodsnm = goodsnm;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getGoodscd() {
		return goodscd;
	}
	public void setGoodscd(String goodscd) {
		this.goodscd = goodscd;
	}
	public String getGoodsnm() {
		return goodsnm;
	}
	public void setGoodsnm(String goodsnm) {
		this.goodsnm = goodsnm;
	}
	

}
