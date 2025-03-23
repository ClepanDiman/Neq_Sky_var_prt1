
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
        var BoxMass_1 = 78.2;
        var BoxMass_2 = 82.7;
        var BoxMass_Sum = BoxMass_1 + BoxMass_2;
        var BoxMass_Diff = BoxMass_1 - BoxMass_2;
        System.out.println("Сумма масс сставляет:" + BoxMass_Sum);
        System.out.println("Разница масс сставляет:"  + BoxMass_Diff);

        //task7_prt1
        var BoxMass_Div = BoxMass_2 % BoxMass_1;
        System.out.println("Остаток составляет:" + BoxMass_Div);

        //task8_prt1
        var TotalTime = 640;
        var DayTime_empl = 8;
        var TotalEmpl = TotalTime / DayTime_empl;
        System.out.println("Всего работников компании — " + TotalEmpl + " человек");
        //task8_prt2
        var TotalEmpl_2 = 94;
        var TotalTime_2 = TotalEmpl_2 * 8;
        System.out.println("Если в компании работает " + TotalEmpl_2 +" человека, то всего " + TotalTime_2 + " часов работы может быть поделено между сотрудниками");

    }






}
