import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {

    public static void main(String[] args) {

        //double myDouble = 9.78d;
        //int myInt = (int) myDouble; // Manual casting: double to int

        // System.out.println(myDouble);   // Outputs 9.78
        // System.out.println(myInt);      // Outputs 9
// <-------------------------------------------------------------------->
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Audi");
        cars.remove(1);
        System.out.println(cars);
        //  System.out.println(cars.get(1)); // 1 numaralı index' teki elemanı sildiğimiz için burada IndexOutOfBoundsException hatası alırız.
        ArrayList<String> city = new ArrayList<>();
        city.add("Istanbul");
        city.set(0, "Ankara"); // eleman değiştirme işlemi
        System.out.println(city);
// <--------------------------------------------------------------------->
        ArrayList<String> lessons = new ArrayList<>();
        lessons.add("Science");
        lessons.add("Math");
        lessons.add("physics");
        for (int i = 0; i < lessons.size(); i++) {
            System.out.println(lessons.get(i));
        }
// <---------------------------------------------------------------------->
        String name = "Johnny ";
        String surname = "Depp";
        System.out.println(name.concat(surname));

        double deger = 8.79;
        int yeniDeger = (int) deger;  // double'dan int'e çevirirken ( int ) yazmalıyız !!
        System.out.println(yeniDeger);
        System.out.println(nameAndSurname("Ahmet ", "ovun"));

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.forEach((n)->{System.out.println(n);});

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Write animal name: ");
        String nameOfAnimal=scanner.nextLine();
        System.out.println(nameOfAnimal); */

        int a=5;
        System.out.println("a'nin degeri: " + a);

        System.out.println("a'nin degeri: " + a++); // Önce ekrana a değerini yazdırdı sonra a' nın değerini 1 arttırdı.
        System.out.println("a'nin degeri: " + ++a); // Önce a 'nın değerini 1 arttırdı, sonra ekrana yazdırdı.
        int sum=0;
        int[] dizi={10,10,10};
        for(int i : dizi) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("<------------------------------------------->");


        List<String> names = Arrays.asList("Omer", "Emir", "Ahmet", "Muhammet");
        List<String> sirala = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sirala);
        System.out.println("<------------------------------------------->");


        List<String> profile = Arrays.asList("Muhammet", "Enes", "Akçayır");
        List result = profile.stream().filter(s -> s.startsWith("E")).collect(Collectors.toList());
        System.out.println(result);
        System.out.println("<------------------------------------------->");


        List<String> isimler= new ArrayList<String>();
        isimler.add("muhammet");
        isimler.add("enes");
        isimler.add("enes");
        isimler.add("enes");
        isimler.add("enes");
        isimler.stream().distinct().forEach(System.out::println);
        System.out.println("<------------------------------------------->");

    /*    Scanner scanner=new Scanner(System.in);
        System.out.println("Mesleginizi giriniz: ");
        scanner.nextLine();  */

        double pencil=14.5;
        double eraser=5.4;
        double maliyetFiyati= (pencil*12)+(eraser*15);
        double satisFiyati= ((pencil*1.5)*12)+((eraser*1.6)*15);
        double karMiktari= satisFiyati-maliyetFiyati;
        System.out.println(karMiktari);













    }



    public static String nameAndSurname(String name, String surname) {

        return name + surname;
    }


}
//

