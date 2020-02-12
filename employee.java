package com.rafal;

import java.util.*;
import java.time.*;

class employeeActions{


}
public class employee{
    private String name;
    private String surname;
    private long pesel;
    private enum position{PROGRAMISTA,ANALITYK,PO,MANAGER};
    private List<Integer> salary;
    private Date workStart;
    public void newEmployee(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        name=scan.nextLine();
        System.out.println("Surame:");
        name=scan.nextLine();
        System.out.println("Pesel:");
        while(!(9999999999l<pesel&&pesel<=999999999999l)){
            while (!(scan.hasNextLong())) {
                System.out.println("Pesel:");
                scan.next();
            };
            pesel=scan.nextLong();}
        System.out.println(pesel);
        workStart=new Date();
        salary=new ArrayList<Integer>();
    }
}
