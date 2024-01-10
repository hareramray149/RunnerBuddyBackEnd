package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data   
@Table(name = "refferral")
@Entity
public class Refferral {

	public Long getMobile_number() {
		return mobile_number;
	}
	public Refferral() {
		super();
	}
	public Refferral(Long mobile_number, String name, String work_city, String work_time, String service) {
		super();
		this.mobile_number = mobile_number;
		Name = name;
		this.work_city = work_city;
		this.work_time = work_time;
		this.service = service;
	}
	public void setMobile_number(Long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getWork_city() {
		return work_city;
	}
	public void setWork_city(String work_city) {
		this.work_city = work_city;
	}
	public String getWork_time() {
		return work_time;
	}
	public void setWork_time(String work_time) {
		this.work_time = work_time;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "r_id")
	Long mobile_number;
	@Column(name = "r_name")
	String Name;
	@Column(name = "r_city")
	String work_city;
	@Column(name = "r_time")
	String work_time;
	@Column(name = "r_service")
	String service;
}
