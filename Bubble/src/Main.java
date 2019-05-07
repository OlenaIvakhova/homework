public class Main {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 100);
            System.out.println(mas[i] + " ");
        }
        for (int i = 0; i < mas.length; i++)System.out.print(mas[i] + " ");
    }
}
         


