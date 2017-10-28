package org.thinkingingis.model;

import org.hibernate.validator.constraints.NotBlank;

public class SearchCriteria {
	@NotBlank(message = "用户名不能为空")
	String username	;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
