public class Main {
    public static void main(String[] args) {

        tasc1();
        tasc2();
        tasc3();
        tasc4();
        tasc5();
        tasc6();
        tasc7();
        tasc8();
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
            byte classTeacher1 = 23;
            byte classTeacher2 = 27;
            byte classTeacher3 = 30;
            short sheetsPaper = 480;
            int student = classTeacher1 + classTeacher2 + classTeacher3;
            long sheetsStudent = sheetsPaper / student;
            System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов!");

        }

        public static void tasc4() {
        System.out.println("Задача 4");
        byte timeWork = 2;
        byte bottle = 16;
        byte performanceTime = 20;
        int performance1 = bottle / timeWork * performanceTime;
        System.out.println("За 20 мин машина произвела " + performance1 + " штук бутылок.");
        int performance2 = performance1 * 3 * 24;
        System.out.println("За сутки машина произвела " + performance2 + " штук бутылок.");
        int performance3 = performance2 * 3;
        System.out.println("За 3 дня машина произвела " + performance3 + " штук бутылок.");
        int performance4 = performance2 * 30;
        System.out.println("За 1 месяц машина произвела " + performance4 + " штук бутылок.");
        }
        public static void tasc5() {
        System.out.println("Задача 5");
        byte dyeJarTotal = 120;
        int whiteJarClass = 2;
        int brownJarClass = 4;
        int quantityClass = dyeJarTotal / (whiteJarClass + brownJarClass);
        int whiteJarTotal = whiteJarClass * quantityClass;
        int brownJarTotal = brownJarClass * quantityClass;
        System.out.println("В школе, где " + quantityClass + " классов, нужно " + whiteJarTotal + " банок белой краски и " + brownJarTotal + " банок коричневой краски.");
        }
        public static void tasc6() {
        System.out.println("Задача 6");
        byte bannana = 5;
        int milk = 2;
        byte iceCream = 2;
        byte rawEggs = 4;
        byte oneBanana = 80;
        byte oneMilk = 105;
        byte oneIceCream = 100;
        byte oneEggs = 70;
        double oneGram = 0.001;
        int portionWeightGram = bannana * oneBanana + milk * oneMilk + oneIceCream * iceCream + oneEggs * rawEggs;
        double portionWeightKg = portionWeightGram * oneGram;
        System.out.println("Вес спортзавтрака равна " + portionWeightGram + "грам или " + portionWeightKg + "кг!");

        }

        public static void tasc7() {
        System.out.println("Задача 7");
        byte needResetWeight = 7;
        short deyResetWeight1 = 250;
        short deyResetWeight2 = 500;
        short oneKilogram = 1000;
        int gramWeightAthlete = needResetWeight * oneKilogram;
        int needAthleteDey1 = gramWeightAthlete / deyResetWeight1;
        int needAthleteDey2 = gramWeightAthlete / deyResetWeight2;
        System.out.println("Если спортсмен будет терять по 250 грам, ему понадобиться " + needAthleteDey1 + " дней " );
        System.out.println("Если спортсмен будет терять по 500 грам, ему понадобиться " + needAthleteDey2 + " дней.");

        }
        public static void tasc8() {
        System.out.println("Задача 8");
        int employee1 = 67760;
        int employee2 = 83690;
        int employee3 = 76230;
        byte oneYear = 12;
        float teenProcent = 0.1F;
        int yearSalaryEmployee1 = employee1 * oneYear;
        int yearSalaryEmployee2 = employee2 * oneYear;
        int yearSalaryEmployee3 = employee3 * oneYear;
        float teenProcentEmployee1 = employee1 * teenProcent;
        float teenProcentEmployee2 = employee2 * teenProcent;
        float teenProcentEmployee3 = employee3 * teenProcent;
        float enlargedSalaryEmployee1 = employee1 + teenProcentEmployee1;
        float enlargedSalaryEmployee2 = employee2 + teenProcentEmployee2;
        float enlargedSalaryEmployee3 = employee3 + teenProcentEmployee3;
        float enlargedYearSalaryEmployee1 = enlargedSalaryEmployee1 * oneYear;
        float enlargedYearSalaryEmployee2 = enlargedSalaryEmployee2 * oneYear;
        float enlargedYearSalaryEmployee3 = enlargedSalaryEmployee3 * oneYear;
        float differenceYearSalaryEmployee1 = enlargedYearSalaryEmployee1 - yearSalaryEmployee1;
        System.out.println("Маша теперь получает " + enlargedSalaryEmployee1 + " рублей. Годовой доход вырос на " + differenceYearSalaryEmployee1 + " рублей.");
        float differenceYearSalaryEmployee2 = enlargedYearSalaryEmployee2 - yearSalaryEmployee2;
        System.out.println("Денис теперь получает " + enlargedSalaryEmployee2 + " рублей. Годовой доход вырос на " + differenceYearSalaryEmployee2 + " рублей.");
        float differenceYearSalaryEmployee3 = enlargedYearSalaryEmployee3 - yearSalaryEmployee3;
        System.out.println("Крестина теперь получает " + enlargedSalaryEmployee3 + " рублей. Годовой доход вырос на " + differenceYearSalaryEmployee3 + " рублей.");
        }


    }
