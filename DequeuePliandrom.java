package com.gurukul.day15;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuePliandrom {

    public static boolean pailandrom() {
	Deque<Character> dquqe = new ArrayDeque<>();
	String str = "ABCDDCBA";

	for (int i = 0; i < str.length(); i++) {
	    dquqe.addFirst(str.charAt(i));
	}
	while (dquqe.size() > 1) {
	    if (dquqe.removeFirst() != dquqe.removeLast())
		break;
	}
	if (dquqe.size() <= 1)
	    return true;
	else

	    return false;

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	if (pailandrom())
	    System.out.print("paliandrom");
	else
	    System.out.print("not paliandrom");

    }

}
