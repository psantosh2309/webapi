package com.WebAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WebAPI.Model.QuestionTypeModel;



public interface QuestionTypeRepository extends JpaRepository<QuestionTypeModel,Long> {

}
