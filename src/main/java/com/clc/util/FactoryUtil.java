package com.clc.util;

import org.springframework.stereotype.Component;

@Component
public class FactoryUtil {

	static{
		System.out.println("inside FactoryUtil static block..");
	}
	public FactoryUtil()
	{
		System.out.println("Inside FactoryUtil Constructor..");
	}
}
