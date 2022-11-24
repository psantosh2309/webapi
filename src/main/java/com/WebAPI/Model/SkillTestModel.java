package com.WebAPI.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SkillTest")
public class SkillTestModel {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String SkillTest;
    private String Experience;
    private Date Enddate;
    
    public SkillTestModel() {
    	
    }
    
	public SkillTestModel(String skillTest, String experience,Date enddate) {
		super();
		SkillTest = skillTest;
		Experience = experience;
		Enddate = enddate;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkillTest() {
		return SkillTest;
	}
	public void setSkillTest(String skillTest) {
		SkillTest = skillTest;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}

	public Date getEnddate() {
		return Enddate;
	}

	public void setEnddate(Date enddate) {
		Enddate = enddate;
	}

	

	
	
	
	
    
	

}
