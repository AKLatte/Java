package com.example.kadaicommit;

public class Review01 {

	public static void main(String[] args) {
//		商品の税抜価格
		int price = 100;
//		商品の消費税額
		int tax = tax(10, price);
//		商品の税込価格
		int result = price + tax;

		System.out.println(price + "円の商品の税込価格は" + result + "円（消費税は" + tax + "円）です。");
	}

//	消費税額の算出
	public static int tax(double taxRate, int price) {
		return (int)(price * (taxRate / 100));
	}
}
