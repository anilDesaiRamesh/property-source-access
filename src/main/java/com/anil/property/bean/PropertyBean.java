/**
 * 
 */
package com.anil.property.bean;

/**
 * @author Anil_Ramesh
 *
 */
public class PropertyBean {

	private String user;
	private String password;
	private String url;

	@Override
	public String toString() {
		return "PropertyBean [user=" + user + ", password=" + password + ", url=" + url + "]";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
