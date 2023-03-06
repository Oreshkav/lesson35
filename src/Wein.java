public class Wein {
  String name;
  String sort;
  int year;


  Wein(String name, String sort, int yearWein){
    this.name = name;
    this.sort = sort;
    year = yearWein;
  }

  Wein(String name, String sort){
    this.name = name;
    this.sort = sort;
    year = 2023;
  }

    Wein(){
  }
  @Override
  public String toString() {
    return "Wein {" + "name = " + name + ", sort = " + sort + ", year = " + year +'}';
  }
  void onStock(int quantity){
    System.out.printf("На складе имеется %d бутылок", quantity);
  }
  void getYear(){
    System.out.println(year);
  }

}
