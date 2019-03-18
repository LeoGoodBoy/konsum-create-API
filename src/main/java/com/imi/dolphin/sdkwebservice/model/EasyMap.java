package com.imi.dolphin.sdkwebservice.model;

import java.io.Serializable;

public class EasyMap implements Serializable {
	private static final long serialVersionUID = 2688060147811229470L;
	private String name;
	private String value;

	public EasyMap() {}
	
	public EasyMap(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	/**
	 * Get name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get value
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Set value
	 * 
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
