import java.util.Scanner;
import java.util.HashMap;

public class DataMahasiswa{
    static Scanner input = new Scanner(System.in);
    static int menu = 100;
    public static void main(String[] args) {
        //deklarasi datamahasiswa
        HashMap<String, Integer> DataMahasiswa = new HashMap<>();
        //menu utama
        while(menu <= 100){
            System.out.println("================== [ Menu ] ==================");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.println("==============================================");

            System.out.print("Pilih Menu : ");
            menu = input.nextInt();

            switch(menu){

                // input data 
                case 1:
                    System.out.print("Masukkan Jumlah Mahasiswa : ");
                    int jumlahMahasiswa= input.nextInt();
                    for(int i = 0; i < jumlahMahasiswa; i++){
                        System.out.println("==============================================");
                        System.out.print("Masukkan Nama Mahasiswa : ");
                        String namaMahasiswa = input.next();
                        System.out.print("Masukkan Nilai Mahasiswa : ");
                        int nilaiMahasiswa = input.nextInt();
                        DataMahasiswa.put(namaMahasiswa, nilaiMahasiswa);
                    }
                    tampilkanData(DataMahasiswa);
                    break;

                // menampilkan data mahasiswa
                case 2:
                    tampilkanData(DataMahasiswa);
                    break;
                
                //? exit
                case 3:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }
    // method untuk menampilkan data mahasiswa
    static void tampilkanData(HashMap<String, Integer> DataMahasiswa){
        int index = 1;
        System.out.println(String.format("%4s %-20s %6s %s", "No", "Nama", "Nilai", "Status"));
        for(String key : DataMahasiswa.keySet()){
            String flag = "Tidak Lulus";
            if(DataMahasiswa.get(key) >= 70){
                flag = "Lulus";
            }
            System.out.println(String.format("%4d %-20s %6d %s", index++ , key , DataMahasiswa.get(key) , flag));
        }
    }
}