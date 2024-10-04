package service;
import java.io.*;

public class CSVManagement {
    public void readCSV(String filename) throws FileNotFoundException{
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();

    }
    public void writeCSV(String filename){
        
    }
}
