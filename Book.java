package com.kh.mini.model.vo;

import java.util.Scanner;

public class Book {

	
	    Scanner sc = new Scanner(System.in);
	
		public void Upbit() {
			System.out.println("���ι�ȣ�� �Է��ϼ���");
			int coin = sc.nextInt();
			
			String co = "";
			switch(coin) {
			
			case 1 :  co = "�׸����� ����" ;
				 break;
				 
			case 2 :  co = "�����Ӵ�" ;
			 break;
			
			case 3 :  co = "�̿���" ;
			 break;
			
			case 4 :  co = "�쵥���ؽñ׷���" ;
			 break;
			
			}
			
			
			
			
			
			
			System.out.println("�׸����� ����");
			
			
		}
	
	
	
}
