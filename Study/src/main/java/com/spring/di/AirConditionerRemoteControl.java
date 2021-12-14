package com.spring.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("C3")
public class AirConditionerRemoteControl implements RemoteControl
{
	@Value("SAMSUNG")
	public String company;
	
	public AirConditionerRemoteControl()
	{
		// TODO Auto-generated constructor stub
	}
	
	public AirConditionerRemoteControl(String company)
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
		System.out.println("에어컨의 전원을 켭니다.");
	}
	
	public void off()
	{
		System.out.println("에어컨의 전원을 끕니다.");	
	}

}
