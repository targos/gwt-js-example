package com.example.gwt.js;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;
import com.google.gwt.core.client.js.JsType;

@JsType
@JsNamespace("example")
@JsExport
public class Test1 {
	
	public static String hello() {
		return "world";
	}
	
}
