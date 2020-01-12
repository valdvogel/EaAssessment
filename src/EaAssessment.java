import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class EaAssessment {

    static void core(List<String> e) {

        int i = 0;
        int intTotalTest = 0;
        IO objIO = new IO();
        do {
            if (i == 0) {
                i++;
                
                // no tests available
                if(Integer.parseInt(String.valueOf(e.get(0))) <= 0)
                    break;
                
            } else {

                intTotalTest++;
                
                String[] point = e.get(i).split(" ");
                Integer intRow = Integer.parseInt(String.valueOf(point[0]));
                Integer intCol = Integer.parseInt(String.valueOf(point[1]));

                //get the positions on file
                String[] positions = String.valueOf(e.get(i + 1)).split("\\s+");

                //get matrix information on file
                Integer indexMatrixStart = i + 2;
                Integer indexMatrixEnd = (intRow + i + 1);

                // init matrix
                int mat[][] = new int[intRow][intCol];

                // Set line to 0
                Integer indexRow = 0;
                
                // Fill up matrix
                while (indexMatrixStart <= indexMatrixEnd) {
                    String[] p = e.get(indexMatrixStart).split(" ");
                    // add value to each line on matrix
                    for (int m = 0; m < p.length; m++) {
                        mat[indexRow][m] = Integer.parseInt(p[m]);
                    }
                    indexMatrixStart++;
                    indexRow++;
                }

                //Get source and destination points
                Point source = new Point(Integer.parseInt(positions[0]), Integer.parseInt(positions[1]));
                Point dest = new Point(Integer.parseInt(positions[2]), Integer.parseInt(positions[3]));

                //Intance Breadth-first search (BFS)
                BFS objBFS = new BFS(intRow, intCol);

                // Call Breadth-first search to calculate tree 
                // and figure out the closest path
                int dist = objBFS.BFS(mat, source, dest);

                if (dist > 0) {
                    String messageSucess = "Case #"+ intTotalTest +": " + dist;
                    System.out.println(messageSucess);
                    objIO.write(messageSucess);
                } else {
                    String messageFail = "Case #"+ intTotalTest +": Mission Impossible.";
                    System.out.println(messageFail);
                    objIO.write(messageFail);
                    
                }

                // increment to next valid line  
                i += (intRow + 2);

            }

        } while (i < e.size());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        
        // delete output file if exists
        IO objIO = new IO();
        objIO.deleteFile();
        
        // read file input file
        List<String> content = objIO.read();
        // Core logic
        core(content);
            
    }   

}
