package poi;
import java.util.Scanner;

public class Employee {                             // ini class induk
    Scanner absensi = new Scanner(System.in);
    
    int nip;
    String name;
    boolean status;
    int gaji=3000000;
    int fgaji;
    int bonus=10000000;
    int potongan=100000;
    int waktukerja;
    int lembur = 200000;
    
    public int pembagian(int pilih){                // method untuk membedakan gaji sesuai jabatan, gaji akan berubah ketika isi nilai dalam parameter berbeda
        if (pilih < 1){
            System.out.println("err");
            System.exit(0);
        }
        if (pilih > 3){
            System.out.println("err");
            System.exit(0);
        }
        if (pilih == 1){
            fgaji = (int) (gaji * 1.5);
        }
        if (pilih == 2){
            fgaji = (int) (gaji * 1.1);
        }
        if (pilih == 3){
            fgaji = (int) (gaji * 1);
        }
        
        return fgaji;   // mengembalikan nilai hasil perhitungan gaji
    }
            
    public void totalgaji(float gajii){                             // method untuk output tampilan waktu kerja, potongan gaji, bonus lembur, bonus menikah, dan total gaji.
        System.out.println("Waktu Kerja\t\t: "+waktukerja+" Jam");
        if (waktukerja<8) {
            gajii-=potongan;
            System.out.println("Potongan Kurang Waktu Kerja\t: "+potongan);
        }
        else if (waktukerja>12){
            gajii+=lembur;
            System.out.println("Bonus Lembur\t\t: "+lembur);
        }
        if (status==true) {
            gajii+=bonus;
            System.out.println("Bonus Menikah\t\t: "+bonus);
        }
        System.out.println("Total Gaji\t\t: " + gajii);
    }
    
    public void datadiri(){                                         // method output tampilan NIP, nama, status menikah.
        System.out.println("NIP\t\t\t: "+nip+"\nNama\t\t\t: "+name);
        if (status==true) {
            System.out.println("Status\t\t\t: Sudah Menikah");
        }
        else if(status==false){
            System.out.println("Status\t\t\t: Belum Menikah");
        }
    }
    
    public void datadiri(int pilih){                                // method absensi
        System.out.println("Presensi Kehadiran Hari Ini :\n1. Hadir\n2. Tidak Hadir");
        pilih = absensi.nextInt();
        if (pilih<1||pilih>2) {
            System.out.println("err\nAdios~");
            System.exit(0);
        }
        if (pilih==1) {
            System.out.println("Presensi Berhasil (Hadir)");
        }
        else {
            System.out.println("Presensi Berhasil (Tidak Hadir)");
        }
    }
    
}
