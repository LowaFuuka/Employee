
package poi;

public class CleaningService extends Employee{  // class mewarisi class Employee
   @Override
   public void datadiri(){                      // method override
        nip = 19450809;
        name = "jun Maeda";
        status = false;
        waktukerja = 5;
        super.datadiri();                       // memanggil method dari class induk
        super.totalgaji(super.pembagian(3));    // memanggil method dari class induk
}   
}
