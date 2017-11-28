package org.userdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="USER_TABLE")
public class UserDetails {
	private String u_name;
	@Id
	private int u_id;
	@Column(name="EMAIL_ID")
	private String u_email;
	@Column(name="USER_ADDRESS")
	private String u_address;
	@Column(name="USER_PHONE")
	private String u_phone;
	private int no_of_issued_books;
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_address() {
		return u_address;
	}
	public void setU_address(String u_address) {
		this.u_address = u_address;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public int getNo_of_issued_books() {
		return no_of_issued_books;
	}
	public void setNo_of_issued_books(int no_of_issued_books) {
		this.no_of_issued_books = no_of_issued_books;
	}
	

}
