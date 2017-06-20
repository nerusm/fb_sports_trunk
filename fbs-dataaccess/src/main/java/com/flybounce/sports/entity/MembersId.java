package com.flybounce.sports.entity;
// Generated Jun 18, 2017 11:38:11 PM by Hibernate Tools 3.4.0.CR1

/**
 * MembersId generated by hbm2java
 */
public class MembersId implements java.io.Serializable {

	private int id;
	private String memberId;

	public MembersId() {
	}

	public MembersId(int id, String memberId) {
		this.id = id;
		this.memberId = memberId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MembersId))
			return false;
		MembersId castOther = (MembersId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getMemberId() == castOther.getMemberId()) || (this.getMemberId() != null
						&& castOther.getMemberId() != null && this.getMemberId().equals(castOther.getMemberId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getMemberId() == null ? 0 : this.getMemberId().hashCode());
		return result;
	}

}
