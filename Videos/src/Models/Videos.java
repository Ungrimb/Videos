package Models;


import java.util.ArrayList;
import java.util.List;

public class Videos {
	
	private String name,URL;
	private int videoId;
	private List<String> tags = new ArrayList<>();
	public Videos(String name, String uRL, int videoId, List<String> tags) {
		this.name = name;
		URL = uRL;
		this.videoId = videoId;
		this.tags = tags;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Video Id = " + videoId + "\n Nombre = " + name + "\n URL = " + URL + "\n tags = " + tags + "\n";
	}
}
