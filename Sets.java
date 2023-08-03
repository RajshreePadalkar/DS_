package com.gurukul.day15;

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	HashSet<Integer> t1 = new HashSet<Integer>();
	HashSet<Integer> t2 = new HashSet<Integer>();
	HashSet<Integer> t3 = new HashSet<Integer>();

	t1.add(20);
	t1.add(40);
	t1.add(50);
	t1.add(90);

	t2.add(20);
	t2.add(780);
	t2.add(10);
	t2.add(90);

	t3.add(20);
	t3.add(450);
	t3.add(10);
	t3.add(90);

	t1.retainAll(t2);
	t1.retainAll(t3);
	System.out.print(t1);

    }

}
