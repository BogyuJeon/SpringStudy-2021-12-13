package com.spring.di;

import java.util.Scanner;

public class main
{

	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("1. 리모컨 추가");
			System.out.println("2. 모든 전원 켜기");
			System.out.println("3. 모든 전원 끄기");
			System.out.println("0. 모든 전원 끄기");
			System.out.println("명령 선택");

			Scanner in = new Scanner(System.in);
			in.nextLine();
			int select = in.nextInt();
			CentralController central = new CentralController();
			
			if (select == 1)
			{
				central.addController();
			}
			else if (select == 2)
			{
				central.OnAll();
			}
			else if (select == 3)
			{
				central.offAll();
			}
			else if (select == 0)
			{
				System.out.println("프로그램 종료중...");
				break;
			}
			else
			{
				System.out.println("잘못된 명령입니다.");
			}
		}
	}

}
