package com.ezen.biz.ex1;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	public void myadvice(JoinPoint jp) {
		System.out.println("�ΰ� ��� ����!");
	}
}
