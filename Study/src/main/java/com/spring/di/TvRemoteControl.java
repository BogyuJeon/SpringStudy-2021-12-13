package com.spring.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("C2")
public class TvRemoteControl implements RemoteControl
{
	@Value("LG")
	public String company;
	
	public TvRemoteControl()
	{
		// TODO Auto-generated constructor stub
	}
	
	public TvRemoteControl(String company)
	{
		super();
		this.company = company;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public void setCompany(String company)
	{
		this.company = company;
	}
	
	public void on()
	{
		System.out.println("티비 전원을 켭니다.");
	}

	public void off()
	{
		System.out.println("티비 전원을 끕니다.");
	}
}
