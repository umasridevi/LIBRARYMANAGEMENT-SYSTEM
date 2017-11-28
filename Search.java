package org.search;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SEARCH_TABLE")
public class Search {
	@Id
	@Column(name="BOOK_ID")
	private int b_id;
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	private String b_name;
	private String b_type;
	private String a_name;
	private String b_branch;
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_type() {
		return b_type;
	}
	public void setB_type(String b_type) {
		this.b_type = b_type;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getB_branch() {
		return b_branch;
	}
	public void setB_branch(String b_branch) {
		this.b_branch = b_branch;
	}
	

	
}
