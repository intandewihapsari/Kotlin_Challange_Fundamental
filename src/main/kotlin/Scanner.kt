import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)

fun main() {
    //membuat objek scanner
    val input = Scanner(System.`in`)

    //Menginputkan Identitas
    println("Masukkan Identitas Anda")
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Harap diisi")
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        print("Jangan Lupa Diisi")
        main()
    }
    print("Absen: ")
    val absen: String? = input.nextLine()
    println(" ")

    println("|--MENGHITUNG BANGUN RUANG--|")
    println("|1. Volume Balok\t\t\t|")
    println("|2. Volume Bola \t\t\t|")
    println("=============================")
    print("Masukan Menu Pilihan : ")
    val menu = readLine()
    println("=============================")
    when (menu) {
        "1" -> {
            println("\t\tVolume Balok\t\t")
            print("Masukan Panjang Balok : ")
            val p: Double = input.nextDouble()
            print("Masukan Lebar Balok   : ")
            val l: Double = input.nextDouble()
            print("Masukan Tinggi Balok  : ")
            val t: Double = input.nextDouble()

            //menghitung Balok
            val vt: Double = p * l * t;

            //cetak hasil
            println("Volume Balok adalah   = $vt ")
            println("=============================")

            //kembali ke menu
            print("Kembali ke menu [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                println("=============================")
                main()
            }
            else{
                println("Press Enter Key To Exit")
                println("=============================")
            }

        }
        "2" -> {
            println("\t\tVolume Bola\t\t")
            print("Masukan jari-jari Bola : ")
            val r: Double = input.nextDouble()

            //menghitung Bola
            val vb: Double = 4/3 * Math.PI * r * r * r;

            //cetak hasil
            println("Volume Bola adalah   = $vb ")
            println("=============================")

            //kembali ke menu
            print("Kembali ke menu [Y/N] : ")
            val next1 = readLine()
            if(next1=="Y" || next1=="y"){
                println("=============================")
                main()
            }
            else{
                println("Press Enter Key To Exit")
                println("=============================")
            }

        }
        else-> {
            println("Menu Tidak Tersedia")
        }
    }
}