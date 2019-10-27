package vn.edu.tdmu.trucntt;


public class KinematicOuput {
	
	private Vector2D linear;
	private float angular;
	public Vector2D getLinear() {
		return linear;
	}
	
	public void setLinear(Vector2D linear) {
		this.linear = linear;
	}
	public float getAngular() {
		return angular;
	}
	public void setAngular(float angular) {
		this.angular = angular;
	}

	public KinematicOuput() {
		super();
	}
	public KinematicOuput(Vector2D linear, float angular) {
		super();
		this.linear = linear;
		this.angular = angular;
	}
	
	

}
