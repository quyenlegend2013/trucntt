package vn.edu.tdmu.trucntt;


public class Kinematic {
	
	
	private Vector2D postion;
	private double orientation;
	private Vector2D velocity;
	private double rotation;
	public Vector2D getPostion() {
		return postion;
	}
	public void setPostion(Vector2D postion) {
		this.postion = postion;
	}
	public double getOrientation() {
		return orientation;
	}
	public void setOrientation(double orientation) {
		this.orientation = orientation;
	}
	public Vector2D getVelocity() {
		return velocity;
	}
	public void setVelocity(Vector2D velocity) {
		this.velocity = velocity;
	}
	public double getRotation() {
		return rotation;
	}
	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	
	public Kinematic() {
		super();
	}
	
	public Kinematic(Vector2D postion, double orientation, Vector2D velocity, double rotation) {
		super();
		this.postion = postion;
		this.orientation = orientation;
		this.velocity = velocity;
		this.rotation = rotation;
	}
	public void update(KinematicOuput steering,double time)
	{
		//this.postion += this.velocity * time + 0.5 * steering.getLinear() * time * time;
		
	}
	
	public static double getNewOrentation(double crrentOrientation, Vector2D velocity)
	{
		
		return crrentOrientation;
	}


}
