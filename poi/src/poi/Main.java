
package poi;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner nganu = new Scanner(System.in);     //ini juga object
        int pilihan;                      
        Employee absen = new Employee();            //ini object untuk memanggil method dari class Employee  
        Bos Boss = new Bos();                       //ini object untuk memanggil method dari class Bos
        Manager MNG = new Manager();                //ini object untuk memanggil method dari class Manager
        CleaningService CS = new CleaningService(); //ini object untuk memanggil method dari class CleaningService
                
        System.out.println("pilih data diri : \n1. Bos\n2. Manager\n3. Cleaning Service");
        pilihan = nganu.nextInt();           //input pilihan jabatan
        
        if (pilihan<1||pilihan>3) {
            System.out.println("data tidak tersedia...");
            System.exit(0);
        }
        else{
        switch(pilihan){
            case 1:
                Boss.datadiri();    // memanggil method dari class Bos
                break;
            case 2:
                MNG.datadiri();     // memanggil method dari class Manager
                break;
            case 3:
                CS.datadiri();      // memanggil method dari class CleaningService
                break;                
        }
        absen.datadiri(0);  // method dari class Employee
        }
    }
}

