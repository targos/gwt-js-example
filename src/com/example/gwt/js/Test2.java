package com.example.gwt.js;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;
import com.google.gwt.core.client.js.JsType;

@JsType
@JsNamespace("$wnd.example")
@JsExport
public class Test2 {
	
	public Test2() {
		
	}
	
	public String test() {
		return testImpl();
	}
	
	private String testImpl() {
		return "TEST";
	}
	
}
