package com.gurukul.day15;

public class InterChange {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a[][] = { { 7, 8, 9, 10 }, { 9, 11, 12, 13 }, { 14, 15, 16, 17 } };

	int min = 0, max = 0, m = 0, n = 0;
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		if (min >= a[i][j]) {
		    min = a[i][j];
		    m = i;
		}
		if (max < a[i][j]) {
		    max = a[i][j];
		    n = i;
		}
	    }
	}

	int arr[] = a[n];
	a[n] = a[m];
	a[m] = arr;
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {

		System.out.print("\t" + a[i][j]);
	    }
	    System.out.println("");
	}
    }

}
