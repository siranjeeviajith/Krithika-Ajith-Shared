package com.fullLearn.beans;

import java.util.Map;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Ignore;
import com.googlecode.objectify.annotation.Index;


@Entity
public class LearningStats {


	@Id
	@Index
	private String id;

	@Index
	private String userId;
	
 	@Ignore
	private Map<String,Integer> challenges_details;

	@Index
	private int minutes;

	@Index
	private int challenges_completed;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

@Index
	private String email;

	public Frequency getFrequency() {
		return frequency;
	}

	//default constructor
public LearningStats()
{

}
	@Index
	private Frequency frequency;

	@Index
	private long startTime;
@Index
	private  long endTime;
	public void setFrequency(Frequency frequency){
		this.frequency = frequency;
	}
// getter setter for frequency EndTime
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getEndTime() {
		return endTime;
	}


	// getter setter for start time
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getStartTime() {
		return startTime;
	}

// getter setter for id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	// getter setter of userid
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}


	// getter setter for challegers
	public Map<String, Integer> getChallenges_details() {
		return challenges_details;
	}
	public void setChallenges_details(Map<String, Integer> challenges_details) {
		this.challenges_details = challenges_details;
	}


	// getter setter for minutes
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	// getter setter no of challenges
	public int getChallenges_completed() {
		return challenges_completed;
	}

	public void setChallenges_completed(int challenges_completed) {
		this.challenges_completed = challenges_completed;
	}

	
}