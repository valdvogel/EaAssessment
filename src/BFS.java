/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jose
 */
public class BFS {

    private int ROW = 0;
    private int COL = 0;
    
    
    public int getROW() {
        return ROW;
    }

    
    public void setROW(int ROW) {
        this.ROW = ROW;
    }

    
    public int getCOL() {
        return COL;
    }

    public void setCOL(int COL) {
        this.COL = COL;
    }
    
   
    // These arrays are used to get row and column 
    // numbers of 4 neighbours of a given cell 
    static int rowNum[] = {-1, 0, 0, 1};
    static int colNum[] = {0, -1, 1, 0};

    // check whether given cell (row, col) 
   // is a valid cell or not. 
    public boolean isValid(int row, int col) {
        // return true if row number and 
        // column number is in range 
        return (row >= 0) && (row < getROW())
                && (col >= 0) && (col < getCOL());
    }
    
   public BFS(int row, int col){
       this.COL = col;
       this.ROW = row;
   }

    // function to find the shortest path between 
    // a given source cell to a destination cell. 
    public int BFS(int mat[][], Point src, Point dest) {
        // check source and destination cell 
        // of the matrix have value 1 
        if (mat[src.x][src.y] < 0
                || mat[dest.x][dest.y] < 0) {
            return -1;
        }

        boolean[][] visited = new boolean[getROW()][getCOL()];

        // Mark the source cell as visited 
        visited[src.x][src.y] = true;

        // Create a queue for BFS 
        Queue<QueueNode> q = new LinkedList<>();

        Integer d = mat[src.x][src.y];

        // Distance of source cell is 0 
        QueueNode s = new QueueNode(src, d);
        q.add(s); // Enqueue source cell 

        // Do a BFS starting from source cell 
        while (!q.isEmpty()) {
            QueueNode curr = q.peek();
            Point pt = curr.pt;

            // If we have reached the destination cell, 
            // we are done 
            if (pt.x == dest.x && pt.y == dest.y) {
                return curr.dist;
            }

            // Otherwise dequeue the front cell 
            // in the queue and enqueue 
            // its adjacent cells 
            q.remove();

            for (int i = 0; i < 4; i++) {
                int row = pt.x + rowNum[i];
                int col = pt.y + colNum[i];

                // if adjacent cell is valid, has path 
                // and not visited yet, enqueue it. 
                if (isValid(row, col)
                        && mat[row][col] >= 0
                        && !visited[row][col]) {
                    // mark cell as visited and enqueue it 
                    visited[row][col] = true;
                    QueueNode Adjcell = new QueueNode(new Point(row, col),
                            curr.dist + mat[row][col]);
                    q.add(Adjcell);
                }
            }
        }

        // Return -1 if destination cannot be reached 
        return -1;
    }

   
}
