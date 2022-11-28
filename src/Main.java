public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1");

        int salary = 15_000;
        float total = 0;
        int monthToGoal = 0;
        while(total<=2_459_000){
            total+=salary;
            total+=total/100;
            monthToGoal++;
            System.out.println("Месяц "+monthToGoal+", сумма накоплений равна "+total+" рублей");
        }

        //task 2
        System.out.println("Task 2");

        int count = 0;
        while(count<10){
            count++;
            System.out.print(count+" ");
        }
        System.out.println();

        for(int i = 10; i>0; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        //task 3
        System.out.println("Task 3");

        int years = 1;
        int bornPerYear1000 = 17;
        int deadPerYear1000 = 8;
        int population = 12_000_000;
        int sumOfPersons = bornPerYear1000-deadPerYear1000;

        for(; years<=10; years++){
            int addEveryYear = (population/1000)*sumOfPersons;
            population+=addEveryYear;
            System.out.println("Год "+years+", численность населения составляет "+population+" человек.");

        }

        //task 4
        System.out.println("Task 4");

        int amountOfSavings = 0;
        int month = 0;

        while(amountOfSavings<12_000_000){
            amountOfSavings+=salary;
            amountOfSavings+=amountOfSavings*0.07;
            month++;
            System.out.println("Месяц "+month+", сумма накоплений равна "+amountOfSavings+" рублей");
        }

        //task 5
        System.out.println("Task 5");


        int totalSavings = 0;
        for(int i = 1;totalSavings<12_000_000;i++){
            totalSavings+=salary;
            totalSavings+=totalSavings*0.07;
            if(i%6==0){
                System.out.println("Месяц "+i+", сумма накоплений равна "+totalSavings+" рублей");
            }
        }

        //task 6
        System.out.println("Task 6");

        int totalSavingsSix = 0;
        int monthInYear = 12;
        int yearsToSave = 9;

        for(int i = 1;i<=monthInYear*yearsToSave;i++){
            totalSavingsSix+=salary;
            totalSavingsSix+=totalSavingsSix*0.07;
            if(i%6==0){
                System.out.println("Месяц "+i+", сумма накоплений равна "+totalSavingsSix+" рублей");
            }
        }

        //task 7
        System.out.println("Task 7");

        int friday = 4;
        for(; friday<31; friday+=7){
            System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет.");
        }

        //task 9
        System.out.println("Task 9");

        int cometsNextToPlanet = 79;
        int startYear = 0;
        int twoHunBefore = 1822;
        int oneHunAfter = 2122;

        for(; startYear<=oneHunAfter; startYear+=cometsNextToPlanet){
            if(twoHunBefore<=startYear && startYear<=oneHunAfter){
                System.out.println(startYear);
            }
        }


        //task 10
        System.out.println("Task 10");


        for(int i = 1; i<=10; i++){
            int sum = 2*i;
            System.out.println("2*"+i+"="+sum);
        }

    }
}
