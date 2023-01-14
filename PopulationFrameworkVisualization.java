package secondAssignment;

public class PopulationFrameworkVisualization extends PopulationFramework {
	
  public PopulationFrameworkVisualization(int width, int height) {
    super(width, height);
  }

  public int countNeighboursAlive(int xAxis, int yAxis) {
    int summationOfCells = 0;
    summationOfCells += getCellState(xAxis - 1, yAxis - 1);
    summationOfCells += getCellState(xAxis, yAxis - 1);
    summationOfCells += getCellState(xAxis + 1, yAxis - 1);
    summationOfCells += getCellState(xAxis - 1, yAxis);
    summationOfCells += getCellState(xAxis + 1, yAxis);
    summationOfCells += getCellState(xAxis - 1, yAxis + 1);
    summationOfCells += getCellState(xAxis, yAxis + 1);
    summationOfCells += getCellState(xAxis + 1, yAxis + 1);
    return summationOfCells;
  }
/* condition checking if cell is out of bounds and cell state if it is within bounds
 * 
 */
  public int getCellState(int xAxis, int yAxis) {
    if (xAxis < 0 || xAxis >= 40 || yAxis < 0 || yAxis >= 40) {
      return 0;
    }
    return this.mesh[xAxis][yAxis];
  }
  

}
