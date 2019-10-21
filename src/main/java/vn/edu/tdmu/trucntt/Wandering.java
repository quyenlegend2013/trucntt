package vn.edu.tdmu.trucntt;

public class Wandering {
	private final double MAX_SPEED=10;
	private final double MAX_ROTATION=Math.PI;
	public Wandering() {
		super();
	}
	
	public Kinematic getSteering(double maSpeed,Kinematic chacractor)
	{
		Kinematic strering=new Kinematic();
		strering.setVelocity(Vector2D.asVector(chacractor.getOrientation()).mul(maSpeed));
		strering.setRotation(Math.random()*MAX_ROTATION);
		return strering;
	}

}
