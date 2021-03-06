package com.ggr.model;

public class Ring {
	private double width;
	private double height;
	private double leftOffset;
	private int order;

	public Ring(double height, double width, double leftOffset, int order) {
		this.height = height;
		this.width = width;
		this.leftOffset = leftOffset;
		this.order = order;
	}

	public Ring(Ring ring) {
		this.height = ring.height;
		this.width = ring.width;
		this.leftOffset = ring.leftOffset;
		this.order = ring.order;
	}

	@Override
	public String toString() {
		return "Ring [width=" + width + ", height=" + height + ", leftOffset=" + leftOffset + ", order=" + order + "]";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLeftOffset() {
		return leftOffset;
	}

	public void setLeftOffset(double leftOffset) {
		this.leftOffset = leftOffset;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
