package com.moya.backend.models.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Clubs")
@Entity

public class Club implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_club")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idClub;
	
	@Column(name="name", length=35)
	private String name;
	
	@Column(name="start")
	private Calendar start;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy="club",fetch=FetchType.LAZY)
	private List<Subscription> subscriptions;


	public Club() {
		super();
	}
	
	public Club(Long idClub) {
		super();
		this.idClub= idClub;
	}


	public Long getIdClub() {
		return idClub;
	}

	public void setIdClub(Long idClub) {
		this.idClub = idClub;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getStart() {
		return start;
	}

	public void setStart(Calendar start) {
		this.start = start;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
}
