public class Main {
    public static void main(String[] args) {

 //one task

        byte number1 = 127;
        System.out.println("Значение переменной number1 с типом byte равно " + number1);

        short number2 = 32767;
        System.out.println("Значение переменной number2 с типом short равно " + number2);

        int number3 = 100_000;
        System.out.println("Значение переменной number3 с типом int равно " + number3);

        long number4 = 1_000_000L;
        System.out.println("Значение переменной number4 с типом long равно " + number4);

        float number5 = 1.5F;
        System.out.println("Значение переменной number5 с типом float равно " + number5);

        double number6 = 20.20;
        System.out.println("Значение переменной number6 с типом byte равно " + number6);

 //Two task

        float number7 = 27.12f;
        System.out.println(number7);
        long number8 = 987_678_965_549L;
        System.out.println(number8);
        double number9 = 2.786;
        System.out.println(number9);
        boolean number10 = false;
        System.out.println(number10);
        int number11 = 569;
        System.out.println(number11);
        short number12 = -159;
        System.out.println(number12);
        long number13 = 27897L;
        System.out.println(number13);
        byte number14 = 67;
        System.out.println(number14);

//Three task

        byte studentLudmila = 23;
        byte studentAnna = 27;
        byte studentEkaterina = 30;
        int paperStudents = (480/(studentLudmila+studentAnna+studentEkaterina));
        System.out.println("На каждого ученика рассчитано " + paperStudents + " листов бумаги");

//Four task

        int buttles = 16;
        int buttlesOneMoment = (buttles/2);
        System.out.println(buttlesOneMoment);
        int buttlesTwentyMinutes = (buttlesOneMoment*20);
        System.out.println("За 20 минут машины произвели бутылок " + buttlesTwentyMinutes + " шт.");
        int minutesInDay = (24*60);
        int buttlesInDay = (minutesInDay*buttlesOneMoment);
        System.out.println("За сутки машины произвели бутылок " + buttlesInDay + " шт.");
        int minutesThreeDay = (24*3*60);
        int buttlesThreeDay = (buttlesOneMoment*minutesThreeDay);
        System.out.println("За три дня машины произвели бутылок " + buttlesThreeDay + " шт.");
        int buttlesThreeDay1 = (buttlesInDay*3); //более быстрый способ.
        System.out.println("За три дня машины произвели бутылок " + buttlesThreeDay1 + " штук");
        int buttlesOneMonth = (buttlesInDay*30);
        System.out.println("За месяц машины произвели бутылок " + buttlesOneMonth + " штук");

//Five task

        int canPaint = 120;
        int numberClasses = (canPaint/(2+4));
        System.out.println(numberClasses);
        int whitePeint = (numberClasses*2);
        int brownPeint = (numberClasses*4);
        System.out.println("В школе, где " + numberClasses + " классов,нужно " + whitePeint + " банок белой краски и " + brownPeint + " банок коричневой краски.");

//Six task

        float banans = 80.0f;
        float milk = 105.0f;
        float iceCream = 100.0f;
        float eggs = 70.0f;
        float proteinDrink = (banans*5+milk*2+iceCream*2+eggs*4);
        System.out.println("Вес спорт-завтрака равен " + proteinDrink + " грамм");
        float proteinDrink1 = (proteinDrink/1000);
        System.out.println("Вес спорт-завтрака равен " + proteinDrink1 + " кг");

 //Seven task

        int weight1 = 250;
        int weight2 = 500;
        int totalWeight = 7000;
        int loseWeight1 = (totalWeight/weight1);
        int loseWeight2 = (totalWeight/weight2);
        System.out.println("Если спортсмен будет терять каждый день " + weight1 + " грамм, на похудание уйдет " + loseWeight1 + " день , а если по " + weight2 + " грамм, потребуется " + loseWeight2 + " дней.");
        float mediumWeight = ((weight1+weight2)/2);
        System.out.println(mediumWeight);
        float mediumDay = (totalWeight/mediumWeight);
        System.out.println("Среднее количество дней для похудания =" + Math.round(mediumDay));

//eight task
        int moneyMasha = 67760;
        int moneyDenis = 83690;
        int moneyKristina = 76230;
        int promotionMasha = (moneyMasha*110/100);
        int promotionDenis = (moneyDenis*110/100);
        int promotionKristina = (moneyKristina*110/100);
        System.out.println("Зарплата Маши после повышения " + promotionMasha + " руб.");
        System.out.println("Зарплата Дениса после повышения " + promotionDenis + " руб.");
        System.out.println("Зарплата Дениса после повышения " + promotionKristina + " руб.");
        int yearMoneyMasha = (promotionMasha*12-moneyMasha*12);
        int yearMoneyDenis = (promotionDenis*12-moneyDenis*12);
        int yearMoneyKristina = (promotionKristina*12-moneyKristina*12);
        System.out.println("Маша теперь получает " + promotionMasha + " рублей. Годовой доход вырос на " + yearMoneyMasha + " рублей.");
        System.out.println("Денис теперь получает " + promotionDenis + " рублей. Годовой доход вырос на " + yearMoneyDenis + " рублей.");
        System.out.println("Кристина теперь получает " + promotionKristina + " рублей. Годовой доход вырос на " + yearMoneyKristina + " рублей.");


    }
}