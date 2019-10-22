package com.example.immadisairaj.quiz.api;

import com.google.gson.annotations.SerializedName;

public class CategoryQuestionCount{

	@SerializedName("total_hard_question_count")
	private int totalHardQuestionCount;

	@SerializedName("total_easy_question_count")
	private int totalEasyQuestionCount;

	@SerializedName("total_medium_question_count")
	private int totalMediumQuestionCount;

	@SerializedName("total_question_count")
	private int totalQuestionCount;

	public void setTotalHardQuestionCount(int totalHardQuestionCount){
		this.totalHardQuestionCount = totalHardQuestionCount;
	}

	public int getTotalHardQuestionCount(){
		return totalHardQuestionCount;
	}

	public void setTotalEasyQuestionCount(int totalEasyQuestionCount){
		this.totalEasyQuestionCount = totalEasyQuestionCount;
	}

	public int getTotalEasyQuestionCount(){
		return totalEasyQuestionCount;
	}

	public void setTotalMediumQuestionCount(int totalMediumQuestionCount){
		this.totalMediumQuestionCount = totalMediumQuestionCount;
	}

	public int getTotalMediumQuestionCount(){
		return totalMediumQuestionCount;
	}

	public void setTotalQuestionCount(int totalQuestionCount){
		this.totalQuestionCount = totalQuestionCount;
	}

	public int getTotalQuestionCount(){
		return totalQuestionCount;
	}

	@Override
 	public String toString(){
		return 
			"CategoryQuestionCount{" + 
			"total_hard_question_count = '" + totalHardQuestionCount + '\'' + 
			",total_easy_question_count = '" + totalEasyQuestionCount + '\'' + 
			",total_medium_question_count = '" + totalMediumQuestionCount + '\'' + 
			",total_question_count = '" + totalQuestionCount + '\'' + 
			"}";
		}
}