package com.credit.suisse.assignment.utils;

import java.util.ArrayList;
import java.util.List;

public class SampleData {

	private static String sample ="[{\"id\":\"scsmbstgra\", \"state\":\"STARTED\", type:\"APPLICATION_LOG\",host:\"12345\", \"timestamp\":1491377495212},"
			+ "{\"id\":\"scsmbstgrb\", \"state\":\"STARTED\", \"timestamp\":1491377495213},{\"id\":\"scsmbstgrc\", \"state\":\"FINISHED\", \"timestamp\":1491377495218},"
			+ "{\"id\":\"scsmbstgra\", \"state\":\"FINISHED\", type:\"APPLICATION_LOG\",host:\"12345\", \"timestamp\":1491377495217},"
			+ "{\"id\":\"scsmbstgrc\", \"state\":\"STARTED\", \"timestamp\":1491377495210},{\"id\":\"scsmbstgrb\", \"state\":\"FINISHED\", \"timestamp\":1491377495216}]";
	
	private List<String> datalist = new ArrayList<>();
	
	public SampleData() {
		datalist.add("{\"id\":\"scsmbstgra\", \"state\":\"STARTED\", type:\"APPLICATION_LOG\",host:\"12345\", \"timestamp\":1491377495212}");
		datalist.add("{\"id\":\"scsmbstgrb\", \"state\":\"STARTED\", \"timestamp\":1491377495213},{\"id\":\"scsmbstgrc\", \"state\":\"FINISHED\", \"timestamp\":1491377495218}");
		datalist.add("{\"id\":\"scsmbstgra\", \"state\":\"FINISHED\", type:\"APPLICATION_LOG\",host:\"12345\", \"timestamp\":1491377495217}");
		datalist.add("{\"id\":\"scsmbstgrc\", \"state\":\"STARTED\", \"timestamp\":1491377495210},{\"id\":\"scsmbstgrb\", \"state\":\"FINISHED\", \"timestamp\":1491377495216}");
	}

	public List<String> getDatalist() {
		return datalist;
	}

	public void setDatalist(List<String> datalist) {
		this.datalist = datalist;
	}
	
	
}
