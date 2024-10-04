import java.io.File;

public class App{

    public static void main(String[] args){
        //arg[0] "C;\data"
        //arg[1] myfile.txt
        String dirPath = args[0];
        String fileName = args[1];

        //e.g c:\data\myfile.txt
        String dirPathFileName = dirPath + File.separator + fileName;

        //check if a directory exists
        //if directory does not exist, create the directory
        File directory = new File(dirPath);
        if (directory.exists()){
            System.out.println("Directory" + directory.toString() + "already exists");

        } else{
            directory.mkdir();
        }




    }
}