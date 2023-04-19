public class Main {
    public static void main(String[] args) {

        tasc1();
        tasc2();
        tasc3();
    }

        public static void tasc1() {
            System.out.println("Задача 1");

            byte car = 5;
            short cat = 200;
            int appl = 2652;
            long athlete = 56896;
            float cofe = 3.2F;
            double milk = 3.256;
            System.out.println("Значение переменной с типом данных 'byte' " + car + " равно!");
            System.out.println("Значение переменной с типом данных 'short' " + cat + " равно!");
            System.out.println("Значение переменной с типом данных 'int' " + appl + " равно!");
            System.out.println("Значение переменной с типом данных 'long' " + athlete + " равно!");
            System.out.println("Значение переменной с типом данных 'float' " + cofe + " равно!");
            System.out.println("Значение переменной с типом данных 'double' " + milk + " равно!");
        }

        public static void tasc2() {
        System.out.println("Задача 2");
           float milk= 27.12F;
           long human = 987678965549L;
           double water= 2.786;
           short ship = 569;
           short coffiPocet= -159;
           int animalsinTheForest= 27897;
           byte waterBox = 67;

        }

        public static void tasc3() {
            System.out.println("Задача 3");
            byte Teacher1 = 23;
            byte Teacher2 = 27;
            byte Teacher3 = 30;
            short sheetsPaper = 480;
            long student = Teacher1 + Teacher2 + Teacher3;
            long sheetsStudent = sheetsPaper / student;
            System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов!");

        }

    }
