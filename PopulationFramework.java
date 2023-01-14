package secondAssignment;

public class PopulationFramework {
	  int meshWidth;
	  int meshHeight;
	  int[][] mesh;

	  public PopulationFramework(int width, int height) {
	    this.meshWidth = width;
	    this.meshHeight = height;
	    this.mesh = new int[width][height];
	  }

	  public void setAlive(int x, int y) {
	    this.mesh[x][y] = 1;
	  }

	  public void setDead(int x, int y) {
	    this.mesh[x][y] = 0;
	  }
	}
