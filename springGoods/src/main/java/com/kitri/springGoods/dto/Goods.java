package com.kitri.springGoods.dto;

public class Goods {
	private String goodscd;
	private String goodsnm;
	private String type;
	private double price;
	private String provider;
	private String status;
	private int qty;
		
	public Goods() {}
	public Goods(String goodscd, String goodsnm, String type, double price, String provider, String status, int qty) {
		this.goodscd = goodscd;
		this.goodsnm = goodsnm;
		this.type = type;
		this.price = price;
		this.provider = provider;
		this.status = status;
		this.qty = qty;
	}
	
	public String getGoodscd() { return goodscd; }
	public void setGoodscd(String goodscd) {
		this.goodscd = goodscd;
	}
	public String getGoodsnm() { return goodsnm; }
	public void setGoodsnm(String goodsnm) {
		this.goodsnm = goodsnm;
	}
	public String getType() { return type; }
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() { return price; }
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProvider() { return provider; }
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getStatus() { return status; }
	public void setStatus(String status) {
		this.status = status;
	}
	public int getQty() { return qty; }
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Goods [goodscd=" + goodscd + ", goodsnm=" + goodsnm + ", type=" + type + ", price=" + price
				+ ", provider=" + provider + ", status=" + status + ", qty=" + qty + "]";
	}
	

}