//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //task1
        byte age = 18;

        if (age >= 18) {
            System.out.println("Совершеннолетие достигнуто");
        }
        else {
            System.out.println("Совершеннолетие не достигнуто");
        }

        //task2

        byte temperature = 7;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, холодно, одентесь потеплее");
        }

        else {
            System.out.println("На улице " + temperature + " градусов, не одевайтесь сильно тепло");
        }

        //task3

        short speed = 70;

        if (speed > 60) {
            System.out.println("Вы едете слишком быстро, снизте скорость на " + (speed - 60) + " км/ч или получите штраф");
        }
        else {
            System.out.println("Так держать");
        }

        //task 4

        age = 24;

        if (age >= 2 && age <= 6){
            System.out.println("Тебе в садик");
        }
        else if (age >= 7 && age <=17) {
            System.out.println("Тебе в школу");
        }
        else if (age >= 18 && age <= 24) {
            System.out.println("Тебе пора в университет");
        }
        else if (age > 24) {
            System.out.println("Иди работай)");
        }

        //task 5

        age = 24;

        if (age < 5){
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на атракционе");
        }
        else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен" + age + " то ему можно кататься на атракционе только в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст равен " + age + " то вам можно кататься без сопровождения");
        }

        //task 6
        short people = 59;

        if (people > 102){
            System.out.println("Вагон полностью забит");
        }
        else if (people <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        else if (people > 60){
            System.out.println("В вагоне остались только стоячие места");
        }

        //task 7

        byte one = 1;
        byte two = 2;
        byte three = 3;

        if (one > two && one > three) {
            System.out.println(one + " самое большое число");
        }
        else if (two > one && two > three){
            System.out.println(two + " самое большое число");
        }
        else if (three > two && three > one){
            System.out.println(three + " самое большое число");
        }
    }
}