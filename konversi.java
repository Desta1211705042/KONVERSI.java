import java.util;

public class konversi {
    static String name; 
    static int bilDes;


    public static void Biner (int n){
        if(n>1){
            Biner(n/2);
        }
        System.out.print(n%2);
    }
    public static void Hexa (int n){
        char[] daftarHexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if(n>1){
            Hexa(n/16);
        }
        System.out.print(daftarHexa[n%16]);
     
    }
    public static void Oktal (int n){
        char[] daftarOktal={'0','1','2','3','4','5','6','7','8'};
        if(n>1){
            Oktal (n/8);
        }
        System.out.print(daftarOktal[n%8]);
    }
    public static void inputDes(){
        System.out.print("Masukkan bilangan desimal = ");
        Scanner inputan=new Scanner(System.in);
        bilDes=inputan.nextInt();
        //return bilDes;
    }
    public static void tampilBiner(){
        inputDes();
        System.out.print("Binernya adalah ");
        Biner(bilDes);
    }
    public static void tampilHexa(){
        inputDes();
        System.out.print("Hexanya adalah ");
        Hexa(bilDes);
    }
    public static void tampilOktal(){
        inputDes();
        System.out.print("Oktalnya adalah ");
        Oktal(bilDes);
    }
    public static int inpBil(){
     
        System.out.println("***" + "\nSelamat datang teman "+name+",");
        System.out.println("Silahkan Memilih Menu Konversi Bilangan ke: " + "\n1. Biner \n2. Hexa \n3. Oktal \n4. Exit");
        System.out.print("Masukkan Angka Dari Menu Di Atas = ");
        Scanner inputan=new Scanner (System.in);
        int pilmenu=inputan.nextInt();
        return pilmenu; {
		case 1: tampilBanner();break;
		case 2: tampilHexa() ; break;
		case 3: tampilOkta() ;break;
		case 4: System.out.println("nuhun");
		system.exit(0);break;
				default:system.out.ptintln("Maaf. pilih angka 1-4 saja)" +"") break;
		}
		System.out.println("\033");
	  }
	public static void main(String arg[]) {
				do{
					menu (inpBil());
				}
					while(true);
				}
	}
