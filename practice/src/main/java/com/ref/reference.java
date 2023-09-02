package com.ref;

public class reference {
	private int x;
	private B ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public reference() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "reference [x=" + x + ", ob=" + ob + "]";
	}
	
}
