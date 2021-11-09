import java.util.Scanner;
public class Suggestions {
    public static void main(String[] args) {
        int heat;
        String kayak,sinema,piknik,yüzme;
        Scanner scn = new Scanner(System.in);
        System.out.print("Hava sıcaklığını girin: ");
        heat = scn.nextInt();
        System.out.print(kayak = (heat <= 5)? "Kayak yapabilirsiniz.": "");
        System.out.print(sinema = ((heat > 5 && heat <= 15)? "Sinemaya gidebilirsiniz" : ""));
        System.out.print(piknik = ((heat > 15 && heat <= 25)?"Pikniğe gidebilirsiniz." : ""));
        System.out.print(yüzme = ((heat > 25)?"Yüzmeye gidebilirsiniz." : ""));
    }
}
