package com.maxtrain.mathproject;

public class Math {

	public static void main(String[] args) {
		var sum = 0;
		for(var idx = 1; idx <= 500; idx++) {
			if(idx % 13 == 0 || idx % 17 == 0 || idx % 19 == 0) {
				sum += idx;
			}
		}
		System.out.println("Sum is " + sum);

	}

}
