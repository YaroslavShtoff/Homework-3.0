public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte books = 15;
        System.out.println("книги на продажу " + books  + " шт .");
        short musicTrack = 30140;
        System.out.println("Музыкальных треков  в памяти " + musicTrack + " шт " );
        int puzzle = 1000000;
        System.out.println(puzzle);
        long holeDeep = -4000L;
        System.out.println("глубина впадины " + holeDeep + " м ");
        float point =  - 1111111 / 3f;
        System.out.println(point);
        double waterTank  =50.6;
        System.out.println("объем резервуара " +waterTank+ " л ");
        boolean pieceOfPuzzle = puzzle > 100000;
        System.out.println(pieceOfPuzzle);
        char plus = 43;
        System.out.println(plus);


        // Задание 2

        float number = 27.12f;
        System.out.println(number);
        long numberTwo = 987678965549L;
        System.out.println( numberTwo);
        int numberThree = 2;
        int numberFour = 786;
        System.out.println(numberThree + "," + numberFour );
        boolean numberFive = numberTwo <= 1;
        System.out.println(numberFive);
        short numberSix = 569;
        System.out.println(numberSix);
        int a = - 159;
        System.out.println(a);
        short b = 27897;
        System.out.println(b);
        byte c = 67;
        System.out.println(c);
        char d = 67;
        System.out.println(d);


        // Задание 3

        int Class1 = 23;
        int Class2 = 27;
        int Class3 = 30;
        int totalStudents = Class1+Class2+Class3;
        int papier = 480;
        int perOneStudent = papier / totalStudents;
        System.out.println("На каждого ученика рассчитано " + perOneStudent  + " листов бумаги");


        // Задание 4

        int productivity2Min = 16;
        int productivity1Min = 16/2;
        int productivity20Min = productivity2Min * 10;
        System.out.println("За 20 мин машина произвела бутылок " + productivity20Min +  " штук ");
        int minInADay = 24*60;
        int productivityPerDay = productivity1Min * minInADay;
        System.out.println("За сутки  машина произвела бутылок " + productivityPerDay +  " штук ");
        int productivityPer3Days = productivityPerDay * 3;
        System.out.println("За 3 дня  машина произвела бутылок " + productivityPer3Days +  " штук ");
        int productivityPerMonth = productivityPerDay * 30;
        System.out.println("За месяц машина произвела бутылок " + productivityPerMonth +  " штук ");



        // Задание 5


        int totalTinOfPaint = 120;
        int brownPaint  = 4;
        int whitePaint = 2;
        int paintInOneClass = brownPaint + whitePaint;
        int numberClasses = totalTinOfPaint / paintInOneClass;
        int allBrownPaint = 4 * numberClasses;
        int allWhitePaint = 2 * numberClasses;
        System.out.println("В школе, где " + numberClasses + " классов, нужно " + allWhitePaint +  " банок белой краски и " + allBrownPaint + " банок коричневой краски ");


        // Задание 6

       int bananaWeight = 80;
       int milkWeight = 105;
       int eggWeight = 70;
       int iceCreamWeight = 100;
       bananaWeight = bananaWeight * 5;
       milkWeight = milkWeight * 2;
       eggWeight  = eggWeight * 4;
       iceCreamWeight = iceCreamWeight * 2;
       int cocktailRecipe = bananaWeight + eggWeight + milkWeight + iceCreamWeight;
       int grPerKg = 1000;
       float cocktailWeight = cocktailRecipe / (float)grPerKg;
       System.out.println("Общий вес " + cocktailWeight + " кг ");


       // Задание 7


        int slimGoal = 7;
        int grPerKg1 = 1000;
        float diet1 = 250 / (float)grPerKg1;
        float diet2 = 500 / (float)grPerKg1;
        float timeDiet1 = slimGoal / diet1;
        System.out.println("время окончания диеты " + timeDiet1 + " дней ");
        float timeDiet2 = slimGoal / diet2;
        System.out.println("время окончания диеты " + timeDiet2 + " дней ");
         float meanDiet = (timeDiet2 + timeDiet1) /2 ;
        System.out.println("в среднем " + meanDiet + " дней ");



        // Задание 8

        int employeeSalary1 = 67760;
        int employeeSalary2 = 83690;
        int employeeSalary3 = 76230;
        float newSalary1 = employeeSalary1 * (float)1.1;
        float newSalary2 = employeeSalary2 * (float)1.1;
        float newSalary3 = employeeSalary3 * (float)1.1;
        float newYearSalary1 = (newSalary1 * 12) % (employeeSalary1 * 12);
        float newYearSalary2 = (newSalary2 * 12) % (employeeSalary2 * 12);
        float newYearSalary3 = (newSalary3 * 12) % (employeeSalary3 * 12);
        System.out.println(" Маша теперь получает " + newSalary1 + " рублей . Годовой доход вырос на " + newYearSalary1 + " рублей ");
        System.out.println(" Денис теперь получает " + newSalary2 + " рублей . Годовой доход вырос на " + newYearSalary2 +  " рублей ");
        System.out.println(" Кристина теперь получает "+ newSalary3 + " рублей . Годовой доход вырос на " + newYearSalary3 +  " рублей ");











    }
}