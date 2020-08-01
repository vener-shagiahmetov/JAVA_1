package Lesson01082020;

public class Task_5 {
//*Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль положительное число передали или отрицательное
// (Замечание: ноль считаем положительным числом.)*
    public static void auditNumber(int x) {

        if (x <= 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static void main(String[] args) {
        auditNumber(1);
    }
}