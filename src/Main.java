
public class Main {
    public static void main(String[] args) {
        //task1_prt11
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789.;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task2_prt1
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task3_prt1

        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task4_prt1
        var friend = 19;
        System.out.println(friend);

        friend = friend - 2;

        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //task5_prt1
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);
        //task6_prt1
        var boxMassOn = 78.2;
        var boxMassTw = 82.7;
        var boxMassSum = boxMassOn + boxMassTw;
        var boxMassDiff = boxMassOn - boxMassTw;
        System.out.println("Сумма масс сставляет:" + boxMassSum);
        System.out.println("Разница масс сставляет:"  + boxMassDiff);

        //task7_prt1
        var boxMassDiv =boxMassTw % boxMassOn;
        System.out.println("Остаток составляет:" + boxMassDiv);

        //task8_prt1
        var totalTime = 640;
        var dayTimeEmpl = 8;
        var totalEmpl = totalTime / dayTimeEmpl;
        System.out.println("Всего работников компании — " + totalEmpl + " человек");
        //task8_prt2
        var totalEmplQ = 94;
        var totalTimeSec = totalEmplQ * 8;
        System.out.println("Если в компании работает " + totalEmplQ +" человека, то всего " + totalTimeSec + " часов работы может быть поделено между сотрудниками");

    }






}
