package com.WebAPI.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SkillLanguage")
public class SkillLanguageModel {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String SkillLangCode;
    private String SkillLanguage;
    private String SkillImage;
    
    public SkillLanguageModel() {
    
    }
    
	public SkillLanguageModel(String skillLangCode, String skillLanguage,String skillImage) {
		super();
		SkillLangCode = skillLangCode;
		SkillLanguage = skillLanguage;
		SkillImage = skillImage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSkillLangCode() {
		return SkillLangCode;
	}
	public void setSkillLangCode(String skillLangCode) {
		SkillLangCode = skillLangCode;
	}
	public String getSkillLanguage() {
		return SkillLanguage;
	}
	public void setSkillLanguage(String skillLanguage) {
		SkillLanguage = skillLanguage;
	}

	public String getSkillImage() {
		return SkillImage;
	}

	public void setSkillImage(String skillImage) {
		SkillImage = skillImage;
	}
	
}



