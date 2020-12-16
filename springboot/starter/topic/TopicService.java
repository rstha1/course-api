package springboot.starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("1", "Spring", "Springboot Intro"),
			new Topic("2", "Spring1", "Springboot Description"),
			new Topic("3", "Spring2", "Springboot Summary")	
			));

	public List<Topic> getAllTopic(){
		return topics;	
	}

	public Topic getTopicById(String id) {
		for(int i = 0; i <3; i++) {
			String tID = topics.get(i).getId();
			if(tID.equals(id)) {
				return topics.get(i);
			}
		}

		return null;
	}
	// (Array) topics[i] == topics.get(i) (List);
	public Topic getTopicByName(String name) {
		for(int i = 0; i<3; i++) {
			String tName = topics.get(i).getName();
			if(tName.equals(name)) {
				return topics.get(i);
			}
		}

		return null;

	}

	public void addTopic(Topic topic) {
		topics.add(topic);	
	}

	public void updateTopic(Topic topic) {
		for(int i = 0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(topic.getId())) {
				topics.set(i, topic);
				return;
			}
			
		}
	
		
	}

	public void updateTopicByName(Topic topic) {
		for(int i = 0; i < topics.size(); i++) {
			Topic t1 = topics.get(i);
			if(t1.getName().equals(topic.getName())) {
				topics.set(i, topic);
				return;
			}
			
		}
		
	}
}
