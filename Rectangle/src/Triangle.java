public class Triangle {

    public static void  main(String[] args) {
        Rectangle triangle = new Rectangle();
     triangle.height = 5;
     triangle.width = 10;
     System.out.println("Площа прямокутника = " + (triangle.width + triangle.height));
     System.out.println("Периметр прямокутника = " + (triangle.width + triangle.height) *2);
}
}
