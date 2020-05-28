import java.util.Random;

class Main {
  public static void One(){
    Random rand = new Random();
    int mas[][] = new int[10][10];
    for(int i = 0; i < 10; i++){
      for(int l = 0; l < 10; l++){
        mas[i][l] = rand.nextInt(99) + 1;
        System.out.print(mas[i][l] + "\t");
      }
      System.out.println("\n");
    }
  }
  public static void Two(){
    Random rand = new Random();
    int k=-1;
    int e = 3, z = 5;
    int mass[][] = new int[e][z];
    for(int i = 0; i < e; i++){
      for(int l = 0; l < z; l++){
        mass[i][l] = rand.nextInt(9) + 1;
        System.out.print(mass[i][l] + "\t");
      }
      System.out.println("\n");
    }
    int m2[][] = new int[e][z];
    int ta[] = new int[e];
    for(int n = 0; n < z; n++){
      for(int i = 0; i < e; i++){ ta[i] = mass[i][n]; }
      for(int l = 0; l < e; l++){
        int min = 9999;
        for(int i = 0; i < e; i++){ if(min > ta[i]){min = ta[i]; k = i;} }
        m2[l][n] = min;
        ta[k] = 9999;
      }
    }
    System.out.println("\n");
    for(int i = 0; i < e; i++){
      for(int l = 0; l < z; l++){ System.out.print(m2[i][l] + "\t"); }
      System.out.println("\n");
    }
  }

  public static void main(String[] args) {
    System.out.println("\nЗадание №1\n");
    One();
    System.out.println("\n\nЗадание №2. Сортировка двумерного массива.\n\n");
    Two();
  }
}