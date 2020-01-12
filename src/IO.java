/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class IO {

    final String INFILEPATH = "files/input/";
    final String OUTFILEPATH = "files/output/";

    public List<String> read() {

        List<String> lines = new ArrayList<String>();

        try {

            FileReader reader = new FileReader(INFILEPATH + "input.in");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // System.out.println(line);
                lines.add(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public void write(String value) {
        try {
            FileWriter writer = new FileWriter(OUTFILEPATH + "output.dat", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // bufferedWriter.write(value + "\n\r");
            bufferedWriter.write(value);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile() {

        try {
            File file = new File(OUTFILEPATH + "output.dat");
            file.delete();
        } catch (Exception e) {
            e.getCause();
        }

    }
}
