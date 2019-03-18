package com.imi.dolphin.sdkwebservice.model;

public class MailModel {
	private String recipient;
	private String subject;
	private String text;
	
	public MailModel() {
		
	}
	
	public MailModel(String recipient, String subject, String text) {
		super();
		this.recipient = recipient;
		this.subject = subject;
		this.text = text;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
