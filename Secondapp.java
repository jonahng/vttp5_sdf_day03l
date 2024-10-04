import java.io.File;

import service.CSVManagement;

public class Secondapp {
    

    public static void main(String[]args){
        CSVManagement csv = new CSVManagement();
        File file = new File(C:\Users\65932\vttp5_sdf_day03l\data\person.csv);
        csv.readCSV(file);

        List<Person> persons = new ArrayList<>
        String[] lineData = line.split(","); //this splits up the line of data into each value that was separated by commas

        Person p = new Person(lineData[0],lineData[1], Integer.parseInt(lineData[2])); // this turns the data into the person object

        //menu
        //1

        //2 save to file


        //3 quit and terminate program

        //workshop done yesterday 
        //copy.csv
        switch(selection){
            case 1:
            Console con1 = System.console();
            String personName = con1.readLine("enter namel");
            String personRegion = con1.readLine()

            case 2:
            FileWriter fw = new FileWriter
            for(Person p: persons){
                bw.append(p.getName());
                bw.append(p.getRegion())
                bw.append(",")
                bw.newLine();
                break;
            }
        }
        


    }
}
