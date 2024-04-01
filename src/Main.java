
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //verilen isiq rengine gore svetaforun isleme prinsipini simulasiya edin, sari gelse
        // "Hazirlasin", qirmizi gelse "Dayanin",  yasil gelse "Hereket edin" cap olunsun
   /*   Scanner sc = new Scanner(System.in);
        System.out.println("Reng daxil edin: sari qirmizi yasil");
        String color = sc.next();
        switch(color){
            case "sari" -> System.out.println("Hazirlasin");
            case "qirmizi"->System.out.println("Dayanin");
            case "yasil"->System.out.println("Hereket edin");
            default->System.out.println("bele bir reng yoxdur");

        }
*/
        /*
        Kicik bir proqram yazin, proqram sizden valyuta, hedef valyuta , ve deyeri alsin, ve verilen valyutadan
        hedef valyutaya cevirib deyeri cap etsin, Meselen:

           valyuta: USD
           hedef valyuta: AZN
           deyer: 100
           cap olunacaq cavab: 170
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Valyuta daxil edin:" +"USD, EUR, AZN, GBP, TL");
        String valyuta=sc.next();
        System.out.println("Deyer daxil edin:");
        Double mebleg=sc.nextDouble();
        System.out.println("Hedef valyuta daxil edin:"+"USD, EUR, AZN, GBP, TL");
        String Hvalyuta=sc.next();

        switch(valyuta){
            case "AZN":
                switch(Hvalyuta){
                    case "USD":
                        System.out.println(mebleg/1.7);
                        break;
                    case "EUR":
                        System.out.println(mebleg/1.83);
                        break;
                    case "GBP":
                        System.out.println(mebleg/2.14);
                        break;
                    case "TL":
                        System.out.println(mebleg*19.08);
                        break;
                    default:
                        System.out.println(mebleg);
                }
                break;
            case "USD":
                switch(Hvalyuta) {
                    case "AZN":
                        System.out.println(mebleg * 1.7);
                        break;
                    case "EUR":
                        System.out.println(mebleg * 0.93);
                        break;
                    case "GBP":
                        System.out.println(mebleg * 0.79);
                        break;
                    case "TL":
                        System.out.println(mebleg * 32.44);
                        break;
                    default:
                        System.out.println(mebleg);
                }
                break;
            case "EUR":
                switch(Hvalyuta) {
                    case "AZN":
                        System.out.println(mebleg * 1.83);
                        break;
                    case "USD":
                        System.out.println(mebleg * 1.08);
                        break;
                    case "GBP":
                        System.out.println(mebleg * 0.85);
                        break;
                    case "TL":
                        System.out.println(mebleg * 34.98);
                        break;
                    default:
                        System.out.println(mebleg);
                }
                break;
            case "GBP":
                switch(Hvalyuta) {
                    case "AZN":
                        System.out.println(mebleg * 2.14);
                        break;
                    case "USD":
                        System.out.println(mebleg * 1.26);
                        break;
                    case "EUR":
                        System.out.println(mebleg * 1.17);
                        break;
                    case "TL":
                        System.out.println(mebleg * 40.91);
                        break;
                    default:
                        System.out.println(mebleg);
                }
                break;
            case "TL":
                switch(Hvalyuta) {
                    case "AZN":
                        System.out.println(mebleg * 0.052);
                        break;
                    case "USD":
                        System.out.println(mebleg * 0.031);
                        break;
                    case "EUR":
                        System.out.println(mebleg * 0.029);
                        break;
                    case "GBP":
                        System.out.println(mebleg * 0.024);
                        break;
                    default:
                        System.out.println(mebleg);
                }
                break;
            default:
                System.out.println("Cevrirme ugursuz oldu");


        }

    }
}