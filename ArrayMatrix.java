package com.gurukul.day15;

public class ArrayMatrix {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10, 11 } };
	int sum1 = 0;

	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		sum1 += a[i][j];
		System.out.print("\t" + a[i][j]);
	    }

	    System.out.print("\t Sum : " + sum1);
	    System.out.print("\n");
	    sum1 = 0;
	}

    }

}
