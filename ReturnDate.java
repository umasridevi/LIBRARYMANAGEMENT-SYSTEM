package org.returndate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ReturnDate {
	//@Temporal(TemporalType.DATE)
	private String issue_date;
	@Id
	private int b_id;
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	private String return_date=(issue_date+"15.0.0");
	



}
