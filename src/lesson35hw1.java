import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson35hw1 {
  public static void main(String[] args) throws IOException {
    //Задача 1. Создайте класс Wine, который содержит переменные
    // name, sort и year.
    // Создайте три экземпляра этого класса.
    // Выведите на консоль значения их переменных методом toString.
    // Добавить в класс Wine метод: onStock, имеет один параметр –
    // количество бутылок. Выводит на консоль сообщение "На складе
    // имеется количество бутылок".
    // Задайте метод getYear – возвращает год
    // производства вина. Вызвать этот метод для каждого из объектов.
    //Можно выполнить это задание на примере собственного класса с тремя полями.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Wein vinishko = new Wein("Malbec", "dry", 2010);
//    vinishko.name = "Malbec";
//    vinishko.sort = "dry";
//    vinishko.year = 2010;
    System.out.println(vinishko.toString());
    vinishko.getYear();

    Wein vinishko2 = new Wein();
    vinishko2.name = "Risling";
    vinishko2.sort = "sweet";
    vinishko2.year = 2020;
    System.out.println(vinishko2.toString());
    vinishko2.getYear();

    Wein vinishko3 = new Wein();
    vinishko3.name = "Montepulchiano";
    vinishko3.sort = "dry";
    vinishko3.year = 2010;
    System.out.println(vinishko3.toString());
    vinishko3.getYear();

    vinishko.onStock(Integer.parseInt(br.readLine()));
  }
}