package secondAssignment;


public class ControlFlowPopulation extends PopulationFrameworkVisualization {
  public ControlFlowPopulation(int width, int height) {
    super(width, height);
  }

  private PopulationFrameworkVisualization plot;

  /**looping through the cells in the grid and updating the cell states in meshBoard based on the number of alive neighbors.
   */
   
  public void flow(int n) { 
    this.plot = new PopulationFrameworkVisualization(40, 40);

    for (int i = 0; i < n; i++) {
      int[][] meshGrid = new int[meshWidth][meshHeight];

      for (int y = 0; y < meshHeight; y++) {
        for (int x = 0; x < meshWidth; x++) {
          int neighboursAlive = countNeighboursAlive(x, y);
          int cellStatus = getCellState(x, y);

          if (cellStatus == 1 && (neighboursAlive == 2 || neighboursAlive == 3)) {
            meshGrid[x][y] = 1;
          } else if (cellStatus == 0 && neighboursAlive == 3) {
            meshGrid[x][y] = 1;
          } else {
            meshGrid[x][y] = 0;
          }
        }
      }

      this.mesh = meshGrid;
    }
  }
}
