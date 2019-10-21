package vn.edu.tdmu.trucntt;


public class KinematicSeek {
	
	private Kinematic character;
	private Kinematic target;
	private double maxSpeed;
	public Kinematic getCharacter() {
		return character;
	}
	public void setCharacter(Kinematic character) {
		this.character = character;
	}
	public Kinematic getTarget() {
		return target;
	}
	public void setTarget(Kinematic target) {
		this.target = target;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public KinematicSeek(Kinematic character, Kinematic target, double maxSpeed) {
		super();
		this.character = character;
		this.target = target;
		this.maxSpeed = maxSpeed;
	}
	public KinematicOuput getKinematicOutput()
	{
		return null;
	}
	
	public Kinematic directionTagert (Kinematic velocity)
	{
		return velocity;
	}

}
