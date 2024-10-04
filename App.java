import java.io.*;
public class App{

    public static void main(String[] args) throws IOException{

        String dirPath = "C:\\Users\\65932\\vttp5_sdf_day03l";
        String fileName = "myfile.txt";

        //e.g c:\data\myfile.txt
        String dirPathFileName = dirPath + File.separator + fileName;
        System.out.println("The desired file path is" + dirPathFileName);
        

        //check if a directory exists
        //if directory does not exist, create the directory


/*         File directory = new File(dirPathFileName);
        if (directory.exists()){
            System.out.println("Directory" + directory.toString() + "already exists");

        } else{
            directory.mkdir();
        } */

        File file = new File(dirPathFileName);
        if(file.exists()){
            System.out.println("File"+ file.toString() + "already exists");
        } else{
            file.createNewFile();
        }
        //Use Filewriter
        //use console to read a string of text
        //use filewriter to write content to the file
        Console console = System.console();
        String keyboardInput = console.readLine("Put your sentence here");
        



       /*  FileWriter fw = new FileWriter(file,true);
        fw.write(keyboardInput);
        fw.flush();
        fw.close();


        FileReader fr = new FileReader(file);
        int dataRead = fr.read();
        while(dataRead != -1){
            System.out.println((char) dataRead);
            dataRead = fr.read();
        }
        fr.close(); */
//successfully made a text file and took the info from it and wrote info to it


//example with bufferwriter to write file
FileWriter fw = new FileWriter(file,true);
BufferedWriter bw = new BufferedWriter(fw);
bw.append(keyboardInput);
bw.flush();
bw.close();

//se bufferedReader to read the file content
FileReader fr = new FileReader(file);
BufferedReader br = new BufferedReader(fr);
String line = "";
while((line=br.readLine())!= null){
    System.out.println(line);
}
br.close();
fr.close();

//new example
FileOutputStream fos = new FileOutputStream(file,true);
byte[] byteContent = keyboardInput.getBytes();
fos.write(byteContent);
fos.flush();
fos.close();

FileInputStream fis = new FileInputStream(file);
int contentRead = 0;
while((contentRead = fis.read()) != -1){
    System.out.print((char) contentRead);
}
fis.close();
 

        



    }
}