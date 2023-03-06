public class Wein {
  String name;
  String sort;
  int year;


  Wein(String nameWein, String sortWein, int yearWeibn){
    name = nameWein;
    sort = sortWein;
    year = yearWeibn;
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
