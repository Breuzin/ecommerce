package com.guilinares.ecommerce.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	public static String parseDate(Date date) {
		return sdf.format(date);
	}
}
