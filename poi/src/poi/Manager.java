
package poi;

public class Manager extends Employee{  // class mewarisi class Employee
    @Override
    public void datadiri(){             // method override
        nip = 19450806;
        name = "Makoto Shinkai";
        status = true;
        waktukerja = 15;
        super.datadiri();                       // memanggil method dari class induk
        super.totalgaji(super.pembagian(2));    // memanggil method dari class induk
}   
}
