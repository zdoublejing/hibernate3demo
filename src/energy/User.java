package energy;

// Generated 2012-8-20 16:24:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private String userId;
	private Orginfo orginfo;
	private String userName;
	private String password;
	private String trueName;
	private String email;
	private String contactTel;
	private Date createTime;

	public User() {
	}

	public User(String userId, Orginfo orginfo, String userName,
			String password, String trueName, Date createTime) {
		this.userId = userId;
		this.orginfo = orginfo;
		this.userName = userName;
		this.password = password;
		this.trueName = trueName;
		this.createTime = createTime;
	}

	public User(String userId, Orginfo orginfo, String userName,
			String password, String trueName, String email, String contactTel,
			Date createTime) {
		this.userId = userId;
		this.orginfo = orginfo;
		this.userName = userName;
		this.password = password;
		this.trueName = trueName;
		this.email = email;
		this.contactTel = contactTel;
		this.createTime = createTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Orginfo getOrginfo() {
		return this.orginfo;
	}

	public void setOrginfo(Orginfo orginfo) {
		this.orginfo = orginfo;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTrueName() {
		return this.trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactTel() {
		return this.contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}