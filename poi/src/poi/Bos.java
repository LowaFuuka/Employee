
package poi;

public class Bos extends Employee{  // class mewarisi class Employee
    @Override
    public void datadiri(){         // method override
        nip = 19411207;
        name = "Hidetaka Mayazaki";
        status = true;
        waktukerja = 11;
        super.datadiri();                       // memanggil method dari class induk
        super.totalgaji(super.pembagian(1));    // memanggil method dari class induk 
    }
}
