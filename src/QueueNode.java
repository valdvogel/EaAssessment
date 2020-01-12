/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class QueueNode {

    Point pt; // The cordinates of a cell 
    int dist; // cell's distance of from the source 

    public QueueNode(Point pt, int dist) {
        this.pt = pt;
        this.dist = dist;
    }
}
