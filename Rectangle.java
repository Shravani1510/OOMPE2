package secondAssignment;

import processing.core.PApplet;

public class Rectangle {
  private double p;
  private double q;
  private double width;
  private double height;

  public Rectangle(double p, double q, double width, double height) {
    this.p = p;
    this.q = q;
    this.width = width;
    this.height = height;
  }

  public void draw(int color,PApplet app ) {
    app.fill(color);
    app.rect((float) p, (float) -q, (float) width, (float) -height);
  }
}
