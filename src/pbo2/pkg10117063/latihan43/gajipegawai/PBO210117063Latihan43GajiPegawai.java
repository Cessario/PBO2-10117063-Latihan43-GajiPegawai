/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan43.gajipegawai;

import java.util.Scanner;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : menghitung gaji
 */
public class PBO210117063Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      GajiPegawai gawe = new GajiPegawai();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------");
        gawe.setNama("Rizki Adam Kurniawan");
        gawe.setAlamat("Jalan Semar dlm 4 No 72/66");
        gawe.setUangTransport(250000);
        gawe.setUangTunjangan(300000);
        gawe.setGajiPokok(4500000);
        gawe.setTotalGaji(gawe.getTotalGaji());
        gawe.tampilData(gawe.getNama(), gawe.getAlamat(), gawe.getUangTransport(), gawe.getUangTunjangan(), gawe.getGajiPokok(), gawe.getTotalGaji());
        
    }
    
}
