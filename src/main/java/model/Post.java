package model;

public class Post {

	private int id;
	private String body;

	public Post() {
		
	}

	public Post(int id, String body) {
		this.id = id;
		this.body = body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", body=" + body + "]";
	}

}
