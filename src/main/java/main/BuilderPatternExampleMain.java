package main;

import entity.Computer;
import entity.Student;

public class BuilderPatternExampleMain {
    public static void main(String[] arg){
        System.out.println("hello");

//        Computer computer = new Computer.ComputerBuilder("500 GB","2GB")
//                .setBluetoothEnabled(true)
//                .setGraphicsCardEnabled(true)
//                .build();
//        System.out.println(computer.toString());


        Student student = new Student.StudentBuilder("SV01","Truong Cong Cuong","DHKTPM14",21,"Nam")
                .setAddress("TT.Cam Xuyen")
                .setNationality("Vietnam")
                .build();

        System.out.println(student.toString());

    }
}
