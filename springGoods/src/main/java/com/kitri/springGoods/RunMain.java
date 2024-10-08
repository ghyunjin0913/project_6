package com.kitri.springGoods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kitri.springGoods.dao.GoodsDao;
import com.kitri.springGoods.dto.Goods;
import com.kitri.springGoods.dto.MultiConditions;
import com.kitri.springGoods.dto.UpdateConditions;

public class RunMain {
	
	//private static ClassPathXmlApplicationContext ctx;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 스프링 컨테이너 생성
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:com/kitri/springGoods/config.xml");
	
		// 빈 객체 활용		
		GoodsDao goodsDao =
				(GoodsDao)ctx.getBean("goodsDaoImpl");
		
		// select All
//		List<Goods> goodsList = goodsDao.findGoods();
//		for(Goods goods : goodsList) {
//			System.out.println(goods);
//		}
		
		// select One
//		System.out.print("상품 번호 입력: ");
//		String inputNo = br.readLine();
//		Goods goods = goodsDao.findGoodsByNo(inputNo);
//		System.out.println(goods);
		
		// insert
//		System.out.print("추가할 데이터 입력: ");
//		String s = br.readLine();
//		String[] arr = s.split(" ");
//		String goodscd = arr[0];
//		String goodsnm = arr[1];
//		String type = arr[2];
//		double price = Double.parseDouble(arr[3]);
//		String provider = arr[4];
//		String status = arr[5];
//		int qty = Integer.parseInt(arr[6]);
//		
//		Goods goods = new Goods(goodscd, goodsnm, type, price, provider, status, qty);
//		int cnt = goodsDao.registerGoods(goods);
//		System.out.println(cnt + "개 데이터 추가");
		
		// update
		System.out.print("업데이트 할 품목: ");
		String s = br.readLine();
		String[] arr = s.split(" ");
		String goodscd = arr[0];
		String goodsnm = arr[1];
		MultiConditions multiConditions = new MultiConditions(goodscd, goodsnm);
		
		System.out.print("변경할 값: ");
		String s2 = br.readLine();
		String[] arr2 = s2.split(" ");
		double price = Double.parseDouble(arr2[0]);
		String status = arr2[1];
		int qty = Integer.parseInt(arr2[2]);
		
		UpdateConditions updateConditions = 
				new UpdateConditions(price, status, qty, multiConditions.getGoodscd(), multiConditions.getGoodsnm());
		int cnt = goodsDao.updateGoods(updateConditions);
		System.out.println(cnt + "개 데이터 업데이트");
		
		// 스프링컨테이너 소멸
		br.close();
		ctx.close();
	}
}
