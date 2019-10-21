package vn.edu.tdmu.trucntt;


public class Vector2D {
	private double x;
	private double y;
	
	public Vector2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Vector2D() {
		super();
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void normalize()
	{
		this.x=(this.x/(Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2))));
		this.y=(this.y/(Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2))));
		
	}
	
	public Vector2D normalize(Vector2D v)
	{
		return new Vector2D(v.getX()/(Math.sqrt(Math.pow(v.getX(), 2)+Math.pow(v.getY(), 2))), v.getY()/(Math.sqrt(Math.pow(v.getX(), 2)+Math.pow(v.getY(), 2))));
	}
	
	public void add(Vector2D v)
	{
		
		this.x+=v.getX();
		this.y+=v.getY();
	}
	
	public static Vector2D add(Vector2D v1,Vector2D v2)
	{
		return new Vector2D(v1.getX()+v2.getX(), v1.getY()+v2.getY());
	}
	public void sub(Vector2D v)
	{
		//a=a+b: khong tra ve vi a da co san roi, chi can lay a+b roi gan cho a la xong
		this.x-=v.getX();
		this.y-=v.getY();
	}
	public static Vector2D sub(Vector2D v1,Vector2D v2)
	{
		//a=b+c: tra ve doi tuong vi a chua co, phai b+c roi moi gan cho a
		return new Vector2D(v1.getX()-v2.getX(), v1.getY()-v2.getY());
	}
	
	public Vector2D mul(double v)
	{
		this.x*=v;
		this.y*=v;
		return this;
	}
	
	public void div(double v)
	{
		this.x /= v;
		this.y /= v;
	}
	public Vector2D mul(Vector2D v1,Vector2D v2)
	{
		return new Vector2D(v1.getX()*v2.getX(), v1.getY()*v2.getY());
	}
	
	public static Vector2D div(Vector2D v1,Vector2D v2)
	{
		return new Vector2D(v1.getX() / v2.getX(), v1.getY() / v2.getY());
	}
	
	public static Vector2D asVector(double angle)
	{
		Vector2D v=new Vector2D();
		v.x=Math.sin(angle);
		v.y=Math.cos(angle);
		return v;
	}
	
}
